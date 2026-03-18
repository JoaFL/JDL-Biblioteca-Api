package JDL.Biblioteca;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SaudacaoController_Teste {
    
    @GetMapping("/saucacao")
    public String dizerOla(@RequestParam(value = "nome", defaultValue = "Mundo") String nome) {
        return "Olá" + nome + "!";
    }
}
