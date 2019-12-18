package guru.springframework.didemo;

import guru.springframework.didemo.controllers.SimpleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        SimpleController controller = (SimpleController) ctx.getBean("simpleController");
        System.out.println(controller.sayHello());
    }

}
