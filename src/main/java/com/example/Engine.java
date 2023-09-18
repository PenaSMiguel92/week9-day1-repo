package com.example;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    Engine() {
        System.out.println("Engine Started");
    }
    void isWorking() {
        System.out.println("engine is working");
    }
}
