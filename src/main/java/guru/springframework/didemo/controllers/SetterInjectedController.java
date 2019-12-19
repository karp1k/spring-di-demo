package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author kas
 */
@Controller
public class SetterInjectedController {

    private GreetingsService greetingsService;

    public String callService() {
       return greetingsService.sayHello();
    }

    @Autowired
    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
}
