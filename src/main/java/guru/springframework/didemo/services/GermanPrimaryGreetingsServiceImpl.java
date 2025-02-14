package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author kas
 */
public class GermanPrimaryGreetingsServiceImpl implements GreetingsService {

    public static final String GERMAN_HELLO = "Halo";

    @Override
    public String sayHello() {
        return GERMAN_HELLO;
    }
}
