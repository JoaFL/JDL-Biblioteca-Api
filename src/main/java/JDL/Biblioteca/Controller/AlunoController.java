package JDL.Biblioteca.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    
    @GetMapping("/nomes")
    public String getAluno(@RequestParam int id) {
        return "";
    }

    @GetMapping("/nomes")
    public String postStudentName(@RequestParam String nome) {
        return "";
    }
}
