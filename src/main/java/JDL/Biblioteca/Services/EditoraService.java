package JDL.Biblioteca.Services;

import org.springframework.stereotype.Service;
import java.util.List;
import JDL.Biblioteca.Repositories.EditoraInterface;
import JDL.Biblioteca.Models.Editora;

@Service
public class EditoraService {
    private final EditoraInterface repository;

    public EditoraService(EditoraInterface repository) {
        this.repository = repository;
    }

    public List<Editora> getAllEditoras() {
        return repository.findAll();
    }

    public Editora getEditoraById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Editora createEditora(Editora editora) {
        if (validarEditora(editora)) {
            return repository.save(editora);
        }

        return null;
    }

    public Editora updateEditora(Integer id, Editora editora) {
        if (repository.existsById(id)) {
            editora.setIdEditoraPk(id);
            return repository.save(editora);
        }
        return null;
    }

    public boolean deleteEditora(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }

    public boolean validarEditora(Editora editora) {
        return (editora.getNomeEditora() != null && !editora.getNomeEditora().isEmpty());
    }
}