package com.Bootcoding.Spring;

import org.springframework.stereotype.Component;

@Component

public class Marker {
    private  Cap c;
    private Ink i;

    public Marker(Cap c,Ink i){
        this.c=c;
        this.i=i;
    }
}
