package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletnBn {

    public SingletnBn() {
        System.out.println("!!!!!!!!!!!     Creating Singleton bean      !!!!!!!!!!!!!!");
    }

    public String getMyScope(){
        return "--------My scope is Singleton---------";
    }
}
