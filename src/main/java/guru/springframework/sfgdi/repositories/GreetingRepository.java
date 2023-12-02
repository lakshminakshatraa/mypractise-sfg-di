package guru.springframework.sfgdi.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository {
    String getGreeting();
}
