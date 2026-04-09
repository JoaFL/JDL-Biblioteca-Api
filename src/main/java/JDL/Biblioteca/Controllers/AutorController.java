package JDL.Biblioteca.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import JDL.Biblioteca.Models.Autor;
import JDL.Biblioteca.Services.AutorService;
import java.util.List;

@RestController
@RequestMapping("/autores") 
public class AutorController {
    private final AutorService autorService;

    @Autowired
    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @GetMapping("/get")
    public List<Autor> getAllAutores() {
        return autorService.getAllAutores();
    }

    @GetMapping("/get/{id}")
    public Autor getAutorById(@PathVariable Integer id) {
        return autorService.getAutorById(id);
    }

    @PostMapping("/post")
    public Autor createAutor(@RequestBody Autor autor) {
        return autorService.createAutor(autor);
    }

    @PutMapping("/put/{id}")
    public Autor updateAutor(@PathVariable Integer id, @RequestBody Autor autor) {
        return autorService.updateAutor(id, autor);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteAutor(@PathVariable Integer id) {
        return autorService.deleteAutor(id);
    }
}