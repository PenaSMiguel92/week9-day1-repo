package com.example;

import org.springframework.stereotype.Component;
@Component
public class Airtel implements SIM {
    public void message() {
        System.out.println("Airtel provides up to 100 free text messages per day");
    }

    public void call() {
        System.out.println("Airtel provides unlimited calls");
    }
    
}
