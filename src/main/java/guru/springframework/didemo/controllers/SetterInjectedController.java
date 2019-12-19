package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingsService;

/**
 * @author kas
 */
public class SetterInjectedController {

    private GreetingsService greetingsService;

    public String callService() {
       return greetingsService.sayHello();
    }

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
}
