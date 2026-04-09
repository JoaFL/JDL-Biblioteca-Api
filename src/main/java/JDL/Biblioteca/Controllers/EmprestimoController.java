package JDL.Biblioteca.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import JDL.Biblioteca.Models.Emprestimo;
import JDL.Biblioteca.Services.EmprestimoService;
import java.util.List;

@RestController
@RequestMapping("/emprestimos") 
public class EmprestimoController {
    private final EmprestimoService emprestimoService;

    @Autowired
    public EmprestimoController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @GetMapping("/get")
    public List<Emprestimo> getAllEmprestimos() {
        return emprestimoService.getAllEmprestimos();
    }

    @GetMapping("/get/{id}")
    public Emprestimo getEmprestimoById(@PathVariable Integer id) {
        return emprestimoService.getEmprestimoById(id);
    }

    @PostMapping("/post")
    public Emprestimo createEmprestimo(@RequestBody Emprestimo emprestimo) {
        return emprestimoService.createEmprestimo(emprestimo);
    }

    @PutMapping("/put/{id}")
    public Emprestimo updateEmprestimo(@PathVariable Integer id, @RequestBody Emprestimo emprestimo) {
        return emprestimoService.updateEmprestimo(id, emprestimo);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteEmprestimo(@PathVariable Integer id) {
        return emprestimoService.deleteEmprestimo(id);
    }
}