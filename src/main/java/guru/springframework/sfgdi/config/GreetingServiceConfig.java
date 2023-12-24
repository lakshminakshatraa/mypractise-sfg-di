package guru.springframework.sfgdi.config;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.repositories.GreetingRepository;
import guru.springframework.sfgdi.repositories.GreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

// @ImportResource("classpath:sfgdi-config.xml") --> this annotation is used in Main class.
// It can also be used in Configuration class.

// @PropertySource("classpath:datasource.properties")
@Configuration
public class GreetingServiceConfig {

    // Configuring external properties in spring - Section 6, lecture 88
    @Bean
    FakeDataSource fakeDataSource(@Value("${demo.username}") String username, @Value("${demo.password}")String password, @Value("${demo.url}")String jdbcurl){
        FakeDataSource fakeDataSource=new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcurl(jdbcurl);
        return fakeDataSource;
    }

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
        return petServiceFactory.getPetService("cat");
    }

    @Bean
    @Profile({"dog", "default"})
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }

}
