package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {
    
    private int id;
    private String studentName;

    public Student(@Value("1") int id, @Value("Ariana Grande") String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public void printDetails() {
        System.out.println("Student Name: " + studentName + " Student ID: " + id);
    }
}
