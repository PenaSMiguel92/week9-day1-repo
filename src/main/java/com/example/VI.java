package com.example;
import org.springframework.stereotype.Component;

@Component
public class VI implements SIM {
    public void message() {
        System.out.println("VI provides up to 100 free text messages per day");
    }

    public void call() {
        System.out.println("VI provides unlimited calls");
    }
    
}
