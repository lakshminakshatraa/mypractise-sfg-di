package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.GreetingRepository;

/**
 * Created by jt on 12/27/19.
 */
//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
    private final GreetingRepository greetingRepository;

    public I18nEnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository=greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
