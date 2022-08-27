package com.example.demo.controller;

import com.example.demo.service.TrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
    @Autowired
    private TrackingService trackingService;

    @GetMapping(value = "/v1/state")
    public ResponseEntity<?> monitorIncidentAndOfficer() {
        return ResponseEntity.ok(trackingService.missedTransReports());
    }
}