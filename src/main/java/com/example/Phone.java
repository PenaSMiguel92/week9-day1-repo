package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //SimService sS = (SimService) context.getBean("simService");
        SIM s = (SIM) context.getBean("airtelObject"); //sS.sim;
        s.call();
        s.message();
        //((ClassPathXmlApplicationContext) context).close();
    }
}
