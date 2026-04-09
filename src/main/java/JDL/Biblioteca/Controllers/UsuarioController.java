package JDL.Biblioteca.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import JDL.Biblioteca.Models.Usuario;
import JDL.Biblioteca.Services.UsuarioService;
import java.util.List;

@RestController
@RequestMapping("/usuarios") 
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/get")
    public List<Usuario> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @GetMapping("/get/{id}")
    public Usuario getUsuarioById(@PathVariable Integer id) {
        return usuarioService.getUsuarioById(id);
    }

    @PostMapping("/post")
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.createUsuario(usuario);
    }

    @PutMapping("/put/{id}")
    public Usuario updateUsuario(@PathVariable Integer id, @RequestBody Usuario usuario) {
        return usuarioService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteUsuario(@PathVariable Integer id) {
        return usuarioService.deleteUsuario(id);
    }
}