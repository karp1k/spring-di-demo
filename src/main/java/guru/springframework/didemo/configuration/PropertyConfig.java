package guru.springframework.didemo.configuration;

import guru.springframework.didemo.propertyexamples.FakeDataSource;
import guru.springframework.didemo.propertyexamples.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author kas
 */
@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${db.username}")
    String username;
    @Value("${password}")
    String password;
    @Value("${db.url}")
    String dbUrl;

    @Value("${jms.username}")
    String jmsUsername;
    @Value("${jms.password}")
    String jmsPassword;
    @Value("${jms.url}")
    String jmsUrl;

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

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
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }

}
