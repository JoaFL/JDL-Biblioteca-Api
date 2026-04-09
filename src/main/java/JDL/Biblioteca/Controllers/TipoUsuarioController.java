package JDL.Biblioteca.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import JDL.Biblioteca.Models.TipoUsuario;
import JDL.Biblioteca.Services.TipoUsuarioService;
import java.util.List;

@RestController
@RequestMapping("/tipos-usuario") 
public class TipoUsuarioController {
    private final TipoUsuarioService tipoUsuarioService;

    @Autowired
    public TipoUsuarioController(TipoUsuarioService tipoUsuarioService) {
        this.tipoUsuarioService = tipoUsuarioService;
    }

    @GetMapping("/get")
    public List<TipoUsuario> getAllTiposUsuario() {
        return tipoUsuarioService.getAllTiposUsuario();
    }

    @GetMapping("/get/{id}")
    public TipoUsuario getTipoUsuarioById(@PathVariable Integer id) {
        return tipoUsuarioService.getTipoUsuarioById(id);
    }

    @PostMapping("/post")
    public TipoUsuario createTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
        return tipoUsuarioService.createTipoUsuario(tipoUsuario);
    }

    @PutMapping("/put/{id}")
    public TipoUsuario updateTipoUsuario(@PathVariable Integer id, @RequestBody TipoUsuario tipoUsuario) {
        return tipoUsuarioService.updateTipoUsuario(id, tipoUsuario);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteTipoUsuario(@PathVariable Integer id) {
        return tipoUsuarioService.deleteTipoUsuario(id);
    }
}