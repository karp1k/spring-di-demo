package guru.springframework.didemo.configuration;

import guru.springframework.didemo.services.GreetingsService;
import guru.springframework.didemo.services.factory.GreetingsServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author kas
 */
@Configuration
public class GreetingsServiceConfiguration {

    @Bean
    public GreetingsServiceFactory greetingsServiceFactory() {
        return new GreetingsServiceFactory();
    }

    @Bean
    @Profile({"en", "default"})
    @Primary
    GreetingsService primaryGreetingsService(GreetingsServiceFactory greetingsServiceFactory) {
        return greetingsServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingsService germanPrimaryGreetingsService(GreetingsServiceFactory greetingsServiceFactory) {
        return greetingsServiceFactory.createGreetingService("de");
    }

    @Bean
    @Profile("es")
    @Primary
    GreetingsService spanishPrimaryGreetingsService(GreetingsServiceFactory greetingsServiceFactory) {
        return greetingsServiceFactory.createGreetingService("es");
    }
}
