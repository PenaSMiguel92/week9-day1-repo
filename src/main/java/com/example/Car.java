package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    //@Autowired
    private Engine engine;

    //@Autowired
    public Car(Engine engine) {
        this.engine = engine;
    }

    //@Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    void isWorking() {
        if (engine != null) {
            engine.isWorking();
            System.out.println("Car is running");
        } else {
            System.out.println("Car broke down");
        }
    }
}
