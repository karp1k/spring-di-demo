package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author kas
 */
@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingsServiceImpl greetingsService;

    public String callService() {
        return greetingsService.sayHello();
    }
}
