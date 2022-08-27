package com.example.demo.Class;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Location {
    private Integer x ;
    private Integer y;

    public Location(Integer x, Integer y ) {
        this.x = x;
        this.y = y ;
    }
}
