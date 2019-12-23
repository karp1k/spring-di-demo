package guru.springframework.didemo.controllers;

import guru.springframework.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author kas
 */
@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("greetingsServiceImpl")
    public GreetingsService greetingsServiceImpl;

    public String callService() {
        return greetingsServiceImpl.sayHello();
    }
}
