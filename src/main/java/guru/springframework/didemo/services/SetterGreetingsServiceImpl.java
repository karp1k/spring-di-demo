package guru.springframework.didemo.services;

import org.springframework.stereotype.Component;

/**
 * @author kas
 */
@Component
public class SetterGreetingsServiceImpl implements GreetingsService {

    public static final String SETTER_HELLO = "Hi! I'm setter";

    @Override
    public String sayHello() {
        return SETTER_HELLO;
    }
}
