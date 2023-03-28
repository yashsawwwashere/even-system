package com.Bootcoding.Spring.Hospital;

import org.springframework.stereotype.Component;

@Component
public class Patient {
    public Patient(Bill bill,Insurance insurance){
        System.out.println("patient");
    }

}
