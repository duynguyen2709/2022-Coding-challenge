package com.example.demo.event;

import com.example.demo.Class.Location;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IncidentOccurred {
  String type;
  int incidentId;
  String codeName;
  Location loc;
}
