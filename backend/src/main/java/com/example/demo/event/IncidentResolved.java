package com.example.demo.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IncidentResolved {
  String type;
  int incidentId;
}
