package guru.springframework.services;

import org.springframework.stereotype.Component;

/**
 * @author kas
 */
@Component
public class ConstructGreetingsServiceImpl implements GreetingsService {

    public static final String CONSTURCTOR_HELLO = "Hello from the other side";

    @Override
    public String sayHello() {
        return CONSTURCTOR_HELLO;
    }
}
