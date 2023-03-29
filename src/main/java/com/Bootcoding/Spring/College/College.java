package com.Bootcoding.Spring.College;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {

    @Autowired
    private Department department;
    public College(Department department){
        this.department=department;
        System.out.println(" I'm a college");
    }
}