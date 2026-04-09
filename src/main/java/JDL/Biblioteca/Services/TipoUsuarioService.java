package JDL.Biblioteca.Services;

import org.springframework.stereotype.Service;
import java.util.List;
import JDL.Biblioteca.Repositories.TipoUsuarioInterface;
import JDL.Biblioteca.Models.TipoUsuario;

@Service
public class TipoUsuarioService {
    private final TipoUsuarioInterface repository;

    public TipoUsuarioService(TipoUsuarioInterface repository) {
        this.repository = repository;
    }

    public List<TipoUsuario> getAllTipoUsuario() {
        return repository.findAll();
    }

    public TipoUsuario getTipoUsuarioById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public TipoUsuario createTipoUsuario(TipoUsuario tipoUsuario) {
        if (validarTipoUsuario(tipoUsuario)) {
            return repository.save(tipoUsuario);
        }

        return null;
    }

    public TipoUsuario updateTipoUsuario(Integer id, TipoUsuario tipoUsuario) {
        if (repository.existsById(id)) {
            tipoUsuario.setIdTipoUsuarioPk(id);
            return repository.save(tipoUsuario);
        }
        return null;
    }

    public boolean deleteTipoUsuario(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }

    public boolean validarTipoUsuario(TipoUsuario tipoUsuario) {
        return (tipoUsuario.getNome() != null && !tipoUsuario.getNome().isEmpty());
    }
}