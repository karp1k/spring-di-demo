package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingsServiceImpl;

/**
 * @author kas
 */
public class PropertyInjectedController {

    public GreetingsServiceImpl greetingsService;

    public String callService() {
        return greetingsService.sayHello();
    }
}
