package guru.springframework.didemo.controllers;

import guru.springframework.services.GreetingsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author kas
 */
public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void init() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingsService(new GreetingsServiceImpl());
    }

    @Test
    public void test() {
        assertEquals(GreetingsServiceImpl.HELLO, setterInjectedController.callService());
    }
}
