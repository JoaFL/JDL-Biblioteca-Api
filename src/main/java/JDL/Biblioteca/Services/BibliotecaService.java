package JDL.Biblioteca.Services;

import org.springframework.stereotype.Service;
import java.util.List;
import JDL.Biblioteca.Repositories.BibliotecaInterface;
import JDL.Biblioteca.Models.Biblioteca;

@Service
public class BibliotecaService {
    private final BibliotecaInterface repository;

    public BibliotecaService(BibliotecaInterface repository) {
        this.repository = repository;
    }

    public List<Biblioteca> getAllBibliotecas() {
        return repository.findAll();
    }

    public Biblioteca getBibliotecaById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Biblioteca createBiblioteca(Biblioteca biblioteca) {
        if (validarBiblioteca(biblioteca)) {
            return repository.save(biblioteca);
        }

        return null;
    }

    public Biblioteca updateBiblioteca(Integer id, Biblioteca biblioteca) {
        if (repository.existsById(id)) {
            biblioteca.setIdBibliotecaPk(id);
            return repository.save(biblioteca);
        }
        return null;
    }

    public boolean deleteBiblioteca(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }

    public boolean validarBiblioteca(Biblioteca biblioteca) {
        return (biblioteca.getNome() != null && !biblioteca.getNome().isEmpty());
    }
}