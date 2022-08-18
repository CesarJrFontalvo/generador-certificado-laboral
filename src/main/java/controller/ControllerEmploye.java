package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEmploye {
    @GetMapping("/hola")
    public String helloMundo() {return "Hola mundo que tal vamos? Hasta luego!";};
}
