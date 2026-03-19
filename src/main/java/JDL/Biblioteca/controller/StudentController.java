package JDL.Biblioteca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class StudentController {
    
    @GetMapping("/nomes")
    public String getStudentName() {
        return "nome daora";
    }

    @GetMapping("/nomes")
    public String postStudentName(@RequestParam String nome) {
        return nome;
    }
}
