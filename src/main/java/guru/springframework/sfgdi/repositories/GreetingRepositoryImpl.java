package guru.springframework.sfgdi.repositories;

public class GreetingRepositoryImpl implements GreetingRepository{
    @Override
    public String getGreeting() {
        return "Welcome -from Repository";
    }
}
