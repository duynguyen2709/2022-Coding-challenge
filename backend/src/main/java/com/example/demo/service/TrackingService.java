package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class TrackingService {
    BaseResponse<Page<ServiceInfoDTO>> findOfficer();
}
