package com.Bootcoding.Spring.marker;

import com.Bootcoding.Spring.marker.Cap;
import com.Bootcoding.Spring.marker.Ink;
import org.springframework.stereotype.Component;

@Component

public class Marker {
    private Cap c;
    private Ink i;

    public Marker(Cap c,Ink i){
        this.c=c;
        this.i=i;
    }
}
