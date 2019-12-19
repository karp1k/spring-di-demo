package guru.springframework.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author kas
 */
@Component
public class LifeCycleDemoBean implements InitializingBean,
        DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("#1 LifeCycleDemoBean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("#3 LifeCycleDemoBean factory set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("#2 LifeCycleDemoBean name set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("#10 LifeCycleDemoBean terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("#7 LifeCycleDemoBean properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("#4 LifeCycleDemoBean context set");
    }

    @PostConstruct
    public void init() {
        System.out.println("#6 LifeCycleDemoBean postconsturct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("#9 LifeCycleDemoBean predestroy");
    }

    public void beforeInit() {
        System.out.println("#5 LifeCycleDemoBean before init (called by BeanPostProcessor)");
    }

    public void afterInit() {
        System.out.println("#8 LifeCycleDemoBean after init (called by BeanPostProcessor)");
    }
}
