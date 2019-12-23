package guru.springframework.didemo.services.factory;

import guru.springframework.didemo.services.GermanPrimaryGreetingsServiceImpl;
import guru.springframework.didemo.services.GreetingsService;
import guru.springframework.didemo.services.PrimaryGreetingsServiceImpl;
import guru.springframework.didemo.services.SpanishPrimaryGreetingsServiceImpl;

/**
 * @author kas
 */
public class GreetingsServiceFactory {



    public GreetingsService createGreetingService(String lang) {
        switch (lang) {
            case "en" : return new PrimaryGreetingsServiceImpl();
            case "de" : return new GermanPrimaryGreetingsServiceImpl();
            case "es" : return new SpanishPrimaryGreetingsServiceImpl();
            default: return new PrimaryGreetingsServiceImpl();
        }
    }
}
