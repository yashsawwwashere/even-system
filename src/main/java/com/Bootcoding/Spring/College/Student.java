package com.Bootcoding.Spring.College;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student(Result result){
        System.out.println("I'm a student");
    }
}