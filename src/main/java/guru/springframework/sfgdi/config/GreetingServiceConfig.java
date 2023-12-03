package guru.springframework.sfgdi.config;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.repositories.GreetingRepository;
import guru.springframework.sfgdi.repositories.GreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    // Bean with name - propGrtngService will be added to Spring Context
    // Bean name will be same as method name with @Bean annotation
//    @Bean
//    PropertyInjectedGreetingService propGrtngService(){
//        return new PropertyInjectedGreetingService();
//    }

    // @Service annotation is removed from the following classes to demonstrate
    // Java based DI (Previously - Annotation based/Stereotype DI)

    // constructorGreetingService is created via xml file
//    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

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
    GreetingRepository greetingRepository(){
        return new GreetingRepositoryImpl();
    }

    @Bean
    @Profile({"EN"})
    I18nEnglishGreetingService i18nService(GreetingRepository repo){
        return new I18nEnglishGreetingService(repo);
    }

//    @Bean
//    @Profile({"EN"})
//    I18nEnglishGreetingService i18nService(){
//        return new I18nEnglishGreetingService(new GreetingRepositoryImpl());
//    }

    @Bean("i18nService")
    @Profile({"ES","default"})
    I18NSpanishService i18NSpanishService(){
        return new I18NSpanishService();
    }

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Bean
    @Profile("cat")
    PetService catPetService(PetServiceFactory petServiceFactory){
        return new PetServiceFactory().getPetService("cat");
    }

    @Bean
    @Profile({"dog", "default"})
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return new PetServiceFactory().getPetService("dog");
    }

}
