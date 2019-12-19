package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author kas
 */
@Controller
public class ConstructorInjectedController {

    private GreetingsService greetingsService;

    public ConstructorInjectedController(@Qualifier("constructGreetingsServiceImpl") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String callService() {
      return greetingsService.sayHello();
    }
}
