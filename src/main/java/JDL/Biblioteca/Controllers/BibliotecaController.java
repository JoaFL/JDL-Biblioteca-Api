package JDL.Biblioteca.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import JDL.Biblioteca.Models.Biblioteca;
import JDL.Biblioteca.Services.BibliotecaService;
import java.util.List;

@RestController
@RequestMapping("/bibliotecas") 
public class BibliotecaController {
    private final BibliotecaService bibliotecaService;

    @Autowired
    public BibliotecaController(BibliotecaService bibliotecaService) {
        this.bibliotecaService = bibliotecaService;
    }

    @GetMapping("/get")
    public List<Biblioteca> getAllBibliotecas() {
        return bibliotecaService.getAllBibliotecas();
    }

    @GetMapping("/get/{id}")
    public Biblioteca getBibliotecaById(@PathVariable Integer id) {
        return bibliotecaService.getBibliotecaById(id);
    }

    @PostMapping("/post")
    public Biblioteca createBiblioteca(@RequestBody Biblioteca biblioteca) {
        return bibliotecaService.createBiblioteca(biblioteca);
    }

    @PutMapping("/put/{id}")
    public Biblioteca updateBiblioteca(@PathVariable Integer id, @RequestBody Biblioteca biblioteca) {
        return bibliotecaService.updateBiblioteca(id, biblioteca);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteBiblioteca(@PathVariable Integer id) {
        return bibliotecaService.deleteBiblioteca(id);
    }
}