package com.Bootcoding.Spring.SwitchBoard;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Button {
    public String color;

    public Button() {
        System.out.println(" BUTTON ");

    }


    @Bean
    public Scanner getScanner() {
        Scanner sc = new Scanner("");
        return sc;
    }

}