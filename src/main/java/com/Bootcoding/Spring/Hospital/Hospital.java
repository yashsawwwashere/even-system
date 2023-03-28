package com.Bootcoding.Spring.Hospital;

import org.springframework.stereotype.Component;

@Component
public class Hospital {
    private Patient patient;
    private Nurse nurse;
    private Doctor dr;
    private Insurance insurance;
    private Bill bill;

    public Hospital(Patient patient,Nurse nurse,Doctor dr,Insurance insurance,Bill bill){
        this.patient=patient;
        this.nurse=nurse;
        this.dr=dr;
        this.insurance=insurance;
        this.bill=bill;
        System.out.println("i m in hospital");
    }

}
