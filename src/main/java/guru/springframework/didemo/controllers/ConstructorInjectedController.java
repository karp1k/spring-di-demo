package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingsService;

/**
 * @author kas
 */
public class ConstructorInjectedController {

    private GreetingsService greetingsService;

    public ConstructorInjectedController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String callService() {
      return greetingsService.sayHello();
    }
}
