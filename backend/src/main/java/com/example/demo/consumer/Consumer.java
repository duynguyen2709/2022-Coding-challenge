package com.example.demo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer {
  public void receiveMessage(String message) {
    System.out.println("Received <" + message + ">");
  }
}
