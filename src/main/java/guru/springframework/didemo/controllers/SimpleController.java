package guru.springframework.didemo.controllers;

import guru.springframework.services.GreetingsService;
import org.springframework.stereotype.Controller;

/**
 * @author kas
 */
@Controller
public class SimpleController {

    private GreetingsService greetingsService;

    public SimpleController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }


    public String sayHello() {
        return greetingsService.sayHello();
    }

}
