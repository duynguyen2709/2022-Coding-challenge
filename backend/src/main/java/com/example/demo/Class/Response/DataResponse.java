package com.example.demo.Class.Response;

import com.example.demo.Class.Incident;
import com.example.demo.Class.Offcier;

public class DataResponse {
    private Incident[] incidents ;
    private Offcier[] offciers;

    public DataResponse(Incident[] incidents, Offcier[] offciers) {
        this.incidents = incidents;
        this.offciers = offciers;
    }

    public Incident[] getIncidents() {
        return incidents;
    }

    public void setIncidents(Incident[] incidents) {
        this.incidents = incidents;
    }

    public Offcier[] getOffciers() {
        return offciers;
    }

    public void setOffciers(Offcier[] offciers) {
        this.offciers = offciers;
    }
}
