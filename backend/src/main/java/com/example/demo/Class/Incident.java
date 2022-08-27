package com.example.demo.Class;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Incident {
    private Integer id;
    private String codeName;
    private Location loc;
    private Integer officerId;

    public Incident(Integer id, String codeName, Location loc) {
        this.id = id;
        this.codeName = codeName;
        this.loc = loc;
        this.officerId = null;
    }
}
