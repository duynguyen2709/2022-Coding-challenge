package com.example.demo.consumer;

import com.example.demo.event.IncidentOccurred;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer {
  Shared shared = new Shared();
  final String I_OCCURRED = "IncidentOccurred";
  final String I_RESOLVED = "IncidentResolved";
  final String O_ONLINE = "OfficerGoesOnline";
  final String O_LOCATION_UPDATED = "OfficerLocationUpdated";
  final String O_OFFLINE = "OfficerGoesOffline";

  private String handleEvent(String raw) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    if (raw.contains(I_OCCURRED)) {
      IncidentOccurred incident = objectMapper.readValue(raw, IncidentOccurred.class);
      handleIncidentOccurred(incident);
      return I_OCCURRED;
    } else if (raw.contains(I_RESOLVED)) {
      return I_RESOLVED;
    } else if (raw.contains(O_ONLINE)) {
      return O_ONLINE;
    } else if (raw.contains(O_LOCATION_UPDATED)) {
      return O_LOCATION_UPDATED;
    }
    return O_OFFLINE;
  }

  public void receiveMessage(String message) {
    System.out.println("Received <" + message + ">");
    try {
      String type = this.handleEvent(message);

      log.info("Received: " + type.toString());
    } catch (Exception e) {
      log.error("fail to handle message " + e.getMessage());
    }
  }

  void handleIncidentOccurred(IncidentOccurred io) {
    shared.addIncidents(io);

  }

  void handleIncidentResolved() {

  }

  void handleOfficerOnline() {

  }
}
