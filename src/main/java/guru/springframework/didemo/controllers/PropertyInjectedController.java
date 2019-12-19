package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author kas
 */
@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingsService greetingsServiceImpl;

    public String callService() {
        return greetingsServiceImpl.sayHello();
    }
}
