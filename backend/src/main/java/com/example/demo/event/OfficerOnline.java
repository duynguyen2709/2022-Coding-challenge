package com.example.demo.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OfficerOnline {
  String type;
  int officerId;
  String badgeName;
}
