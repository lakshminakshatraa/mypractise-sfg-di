package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

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

    @Bean
    @Primary
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Bean
    @Profile({"EN"})
    I18nEnglishGreetingService i18nService(){
        return new I18nEnglishGreetingService();
    }

    @Bean("i18nService")
    @Profile({"ES","default"})
    I18NSpanishService i18NSpanishService(){
        return new I18NSpanishService();
    }
}
