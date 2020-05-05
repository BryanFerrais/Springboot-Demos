package ferrais.bryan.Demo_Cars.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Bem-vindo a lista de carros.";
    }


}
