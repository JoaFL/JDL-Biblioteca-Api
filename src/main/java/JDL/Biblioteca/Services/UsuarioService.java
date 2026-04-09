package JDL.Biblioteca.Services;

import org.springframework.stereotype.Service;
import java.util.List;
import JDL.Biblioteca.Repositories.UsuarioInterface;
import JDL.Biblioteca.Models.Usuario;

@Service
public class UsuarioService {

    private final UsuarioInterface repository;

    public UsuarioService(UsuarioInterface repository) {
        this.repository = repository;
    }

    public List<Usuario> getAllUsuario() {
        return repository.findAll();
    }

    public Usuario getUsuarioById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Usuario createUsuario(Usuario usuario) {
        if (validarUsuario(usuario)) {
            return repository.save(usuario);
        }

        return null;
    }

    public Usuario updateUsuario(Integer id, Usuario usuario) {
        if (repository.existsById(id)) {
            usuario.setIdUsuarioPk(id);
            return repository.save(usuario);
        }
        return null;
    }

    public boolean deleteUsuario(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }

    public boolean validarUsuario(Usuario usuario) {
        return (usuario.getNome() != null && !usuario.getNome().isEmpty()
        && usuario.getEmail() != null && !usuario.getEmail().isEmpty()
        && usuario.getSenha() != null && !usuario.getSenha().isEmpty()
        && usuario.getMatricula() != null
        && usuario.getTelefone() != null && !usuario.getTelefone().isEmpty()
        && usuario.getSerie() != null && !usuario.getSerie().isEmpty()
        && usuario.getNivelPerm() != null && !usuario.getNivelPerm().isEmpty());
    }
}