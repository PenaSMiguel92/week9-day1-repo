package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        SIM s = (SIM) context.getBean("airtel", Airtel.class);
        s.call();
        s.message();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
