package guru.springframework.didemo.controllers;

import guru.springframework.services.GreetingsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author kas
 */
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void init() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingsServiceImpl());
    }

    @Test
    public void test() {
        assertEquals(GreetingsServiceImpl.HELLO, constructorInjectedController.callService());
    }
}
