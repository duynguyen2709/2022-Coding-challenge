package com.example.demo.wrapper;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TESTING
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class MetricPhase2 {

    private String serviceName;
    private Long sourceId;
    private Integer status;
    private Timestamp beginTime;
    private Map<String, List<Integer>> metricByDay = new HashMap<>();


    public MetricPhase2(String serviceName, Integer status, Timestamp createdAt) {
        this.serviceName = serviceName;
        this.status = status;
        this.beginTime = createdAt;
    }
}
