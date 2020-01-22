package br.com.ridgue;

import com.fasterxml.jackson.datatype.jsr310.deser.JSR310StringParsableDeserializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping
    public String showHome() {
        String page = "<h1>Welcome!</h1>" + "<a href=\"formulario.html\">formulario</a>";
        return page;
    }
    @GetMapping("/formuulario")
    public String formulario() {
        String page =  "<form action=\"resultado\">" +
                "<input type=\"text\" placeholder=\"Lados\">" +
                "<input type=\"text\" placeholder=\"Vezes\">" +
                "<button>Jogar</button>" +
                "</form>";
        return page;
    }
    @GetMapping("/resultado")
    public String mostrarResultado() {
        String page = "<h1>O rsultado é 100</h1>";
        return page;
    }



}
