package ferrais.bryan.Demo_Rpg.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String mensagem(){
        return "Bem vindo a listagem de Classes RPG.";
    }

}
