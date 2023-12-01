package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    // @Service annotation is removed from the following classes to demonstrate
    // Java based DI (Previously - Annotation based/Stereotype DI)
    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    // Bean with name - propGrtngService will be added to Spring Context
    // Bean name will be same as method name with @Bean annotation
//    @Bean
//    PropertyInjectedGreetingService propGrtngService(){
//        return new PropertyInjectedGreetingService();
//    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }


    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
