package JDL.Biblioteca.Services;

import org.springframework.stereotype.Service;
import java.util.List;
import JDL.Biblioteca.Repositories.AutorInterface;
import JDL.Biblioteca.Models.Autor;

@Service
public class AutorService {
    private final AutorInterface repository;

    public AutorService(AutorInterface repository) {
        this.repository = repository;
    }

    public List<Autor> getAllAutores() {
        return repository.findAll();
    }

    public Autor getAutorById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Autor createAutor(Autor autor) {
        if (validarAutor(autor)) {
            return repository.save(autor);
        }

        return null;
    }

    public Autor updateAutor(Integer id, Autor autor) {
        if (repository.existsById(id)) {
            autor.setIdAutor(id);
            return repository.save(autor);
        }
        return null;
    }

    public boolean deleteAutor(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }

    public boolean validarAutor(Autor autor) {
        return (autor.getNomeAutor() != null && !autor.getNomeAutor().isEmpty());
    }
}