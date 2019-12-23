package guru.springframework.didemo.controllers;

import guru.springframework.services.GreetingsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author kas
 */
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void init() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingsServiceImpl = new GreetingsServiceImpl();
    }

    @Test
    public void test() {
        assertEquals(GreetingsServiceImpl.HELLO, propertyInjectedController.callService());
    }
}
