package guru.springframework.didemo.configuration;

import guru.springframework.didemo.propertyexamples.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author kas
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${db.username}")
    String username;
    @Value("${password}")
    String password;
    @Value("${db.url}")
    String dbUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        return new FakeDataSource(env.getProperty("username"), password, dbUrl);
    }

    // In SpringBoot if you are using @PropertySource to register a property file to Spring Environment,
    // you don't need to use PropertySourcesPlaceholderConfigurer. SpringBoot automatically make it available to you
    // If you are not using @PropertySource then user PropertySourcesPlaceholderConfigurer like this:
    // -----------------------------------------------------------------------------------------------------------------------
    // PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
    // propertySourcesPlaceholderConfigurer.setLocation(new ClassPathResource("datasource.properties"));
    // return PropertySourcesPlaceholderConfigurer;
    // ------------------------------------------------------------------------------------------------------------------------
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
