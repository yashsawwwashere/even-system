package com.Bootcoding.Spring.College;

import org.springframework.stereotype.Component;

@Component
public class Department {

    public Department(Teacher teacher){
        System.out.println("im in department");
    }
}