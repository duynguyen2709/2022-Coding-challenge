package com.example.demo.Class;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public Integer getOfficerId() {
        return officerId;
    }

    public void setOfficerId(Integer officerId) {
        this.officerId = officerId;
    }
}
