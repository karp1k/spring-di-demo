package guru.springframework.didemo.services;

import org.springframework.stereotype.Component;

/**
 * @author kas
 */
@Component
public class GreetingsServiceImpl implements GreetingsService {

    public static final  String HELLO = "Hello darkness my old friend";

    @Override
    public String sayHello() {
        return HELLO;
    }
}
