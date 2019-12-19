package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author kas
 */
@Component
@Profile("es")
@Primary
public class SpanishPrimaryGreetingsServiceImpl implements GreetingsService {

    public static final String SPANISH_HELLO = "Hola";

    @Override
    public String sayHello() {
        return SPANISH_HELLO;
    }
}
