package com.Bootcoding.Spring.SwitchBoard;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class ValuesExample {

    @Value("${app.isNumber}")
    private boolean numberExists;

    @Value("${laptop.price}")
    private double price;

    @Value("${array.elements}")
    private int[] values;


    @Value("${array.elements}")
    private Set<Integer> values2;


    @Value("${array.elements}")
    private List<Integer> values3;

    public void printValues(){
        System.out.println(numberExists);
        System.out.println(price);
        System.out.println(values);
        System.out.println(values2);
        System.out.println(values3);
    }
}
