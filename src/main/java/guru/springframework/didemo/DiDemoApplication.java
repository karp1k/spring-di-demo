package guru.springframework.didemo;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.controllers.SetterInjectedController;
import guru.springframework.didemo.controllers.SimpleController;
import guru.springframework.didemo.propertyexamples.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework.didemo"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        SimpleController controller = (SimpleController) ctx.getBean("simpleController");
        System.out.println(controller.sayHello());
        System.out.println(((PropertyInjectedController)ctx.getBean("propertyInjectedController")).callService());
        System.out.println(((SetterInjectedController)ctx.getBean("setterInjectedController")).callService());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).callService());

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println("db username: " + fakeDataSource.getUsername());
    }

}
