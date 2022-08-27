package com.example.demo.service;

import com.example.demo.Class.Incident;
import com.example.demo.Class.Location;
import com.example.demo.Class.Offcier;
import com.example.demo.wrapper.BaseResponse;
import com.example.demo.wrapper.MetricPhase2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class TrackingService {
    public BaseResponse<Collection<List<MetricPhase2>>> findOfficerForIncident() {

        Incident incidentA = new Incident(1, "Incident A", new Location(3, 2));
        Incident incidentB = new Incident(2, "Incident B", new Location(2, 3));
        List<Incident> incidentsList = new ArrayList<>();
        incidentsList.add(incidentA);
        incidentsList.add(incidentB);

        Offcier offcierA = new Offcier(1, "Thong 1", new Location(1, 1));
        Offcier offcierB = new Offcier(2, "Thong 2", new Location(4, 4));
        Offcier offcierC = new Offcier(3, "Thong 3", new Location(5, 5));
        List<Offcier> offcierList = new ArrayList<>();
        offcierList.add(offcierA);
        offcierList.add(offcierB);
        offcierList.add(offcierC);

        // logic
        LinkedHashMap<Integer, Integer> incidentMappingOfficer = getNearestOfficer(incidentsList, offcierList);

        // convert incidentMappingOfficer to response
        return null;
    }

    private LinkedHashMap<Integer, Integer> getNearestOfficer(
            List<Incident> incidentList,
            List<Offcier> offcierList
    ) {
        LinkedHashMap<Integer, Integer> result = new LinkedHashMap<>();

        incidentList.forEach(incident -> {
            Integer incidentId = incident.getId();
            Integer x_incident = incident.getLoc().getX();
            Integer y_incident = incident.getLoc().getY();
            offcierList.forEach(offcier -> {
                Integer min_officerId = Integer.MAX_VALUE;
                Double min_distance = Double.MAX_VALUE;

                Integer officerID = offcier.getId();
                Integer x_officer = offcier.getLoc().getX();
                Integer y_officer = offcier.getLoc().getY();

                Double distance = Math.sqrt(Math.abs(x_incident - x_officer) * Math.abs(x_incident - x_officer) + Math.abs(y_incident - y_officer) * Math.abs(y_incident - y_officer));
                if (Double.compare(min_distance, distance) < 0) {
                    min_distance = distance;
                    min_officerId = officerID;
                }
                result.put(incidentId, officerID);
            });
        });
        return result;
    }
}
