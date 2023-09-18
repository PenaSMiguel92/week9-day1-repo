package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Airtel")
public class Airtel implements SIM {

    public void message() {
        System.out.println("Airtel provides up to 100 free text messages per day");
    }

    public void call() {
        System.out.println("Airtel provides unlimited calls");
    }

    @Bean
    public Airtel airtelObject() {
        return new Airtel();
    }
    
}
