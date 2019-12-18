package guru.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author kas
 */
@Controller
public class SimpleController {

    public String sayHello() {
        return "Hello!";
    }

}
