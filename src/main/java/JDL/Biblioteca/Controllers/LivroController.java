package JDL.Biblioteca.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import JDL.Biblioteca.Models.Livro;
import JDL.Biblioteca.Services.LivroService;
import java.util.List;

@RestController
@RequestMapping("/livros") 
public class LivroController {
    private final LivroService livroService;

    @Autowired
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping("/get")
    public List<Livro> getAllLivros() {
        return livroService.getAllLivros();
    }

    @GetMapping("/get/{id}")
    public Livro getLivroById(@PathVariable Integer id) {
        return livroService.getLivroById(id);
    }

    @PostMapping("/post")
    public Livro createLivro(@RequestBody Livro livro) {
        return livroService.createLivro(livro);
    }

    @PutMapping("/put/{id}")
    public Livro updateLivro(@PathVariable Integer id, @RequestBody Livro livro) {
        return livroService.updateLivro(id, livro);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteLivro(@PathVariable Integer id) {
        return livroService.deleteLivro(id);
    }
}