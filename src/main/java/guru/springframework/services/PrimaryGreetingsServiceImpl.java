package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author kas
 */
@Component
@Profile({"en", "default"})
@Primary
public class PrimaryGreetingsServiceImpl implements GreetingsService {

    public static final String PRIMARY_HELLO = "I am number one!";

    @Override
    public String sayHello() {
        return PRIMARY_HELLO;
    }
}
