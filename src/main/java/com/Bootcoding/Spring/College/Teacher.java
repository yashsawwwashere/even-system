package com.Bootcoding.Spring.College;

import org.springframework.stereotype.Component;

@Component
public class Teacher {

    public Teacher(Student student){
        System.out.println("I'm a teacher");
    }
}