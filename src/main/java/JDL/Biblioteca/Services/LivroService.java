package JDL.Biblioteca.Services;

import org.springframework.stereotype.Service;
import java.util.List;
import JDL.Biblioteca.Repositories.LivroInterface;
import JDL.Biblioteca.Models.Livro;

@Service
public class LivroService {
    private final LivroInterface repository;

    public LivroService(LivroInterface repository) {
        this.repository = repository;
    }

    public List<Livro> getAllLivros() {
        return repository.findAll();
    }

    public Livro getLivroById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Livro createLivro(Livro livro) {
        if (validarLivro(livro)) {
            return repository.save(livro);
        }

        return null;
    }

    public Livro updateLivro(Integer id, Livro livro) {
        if (repository.existsById(id)) {
            livro.setIdLivroPk(id);
            return repository.save(livro);
        }
        return null;
    }

    public boolean deleteLivro(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }

    public boolean validarLivro(Livro livro) {
        return (livro.getNomeLivro() != null && !livro.getNomeLivro().isEmpty());
    }
}
