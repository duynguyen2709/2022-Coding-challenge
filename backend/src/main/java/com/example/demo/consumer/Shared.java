package com.example.demo.consumer;

import com.example.demo.Class.Incident;
import com.example.demo.Class.Officer;
import com.example.demo.event.IncidentOccurred;

import java.util.ArrayList;
import java.util.List;

public class Shared {
  List<Incident> incidents = new ArrayList<>();
  List<Officer> officers = new ArrayList<>();

  public void addIncidents(IncidentOccurred i) {
//    this.incidents.add();
  }

  public void addOfficers(Officer o) {
    this.officers.add(o);
  }
}
