package com.example.demo.Class;

public class Officer {
    private Integer id;
    private String badgeName;
    private Location loc;

    public Officer(Integer id, String badgeName, Location loc) {
        this.id = id;
        this.badgeName = badgeName;
        this.loc = loc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBadgeName() {
        return badgeName;
    }

    public void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }
}
