package com.codeki.vuelosapi.service;

import com.codeki.vuelosapi.model.Flight;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FlightService {
    Flight flight = new Flight(4l, "ITA", "MEX",
            LocalDateTime.of(2024, 2, 23, 18, 00),
            LocalDateTime.of(2024, 3, 30, 18, 00),
            12000.00, "2hs");
    Flight flight1 = new Flight(1l, "EZE", "COR",
            LocalDateTime.of(2024,2,23,18,0),
            LocalDateTime.of(2024,2,23,18,0),
            12000.00, "2hs");

    Flight flight2 = new Flight(2l, "EZE", "UIO",
            LocalDateTime.of(2024,2,23,18,0),
            LocalDateTime.of(2024,2,23,18,0),
            12000.00, "2hs");
    public List<Flight> listFlights() {
        return List.of(flight1, flight2);
    }


    public Flight getFlightById(long id) {
        return flight;
    }
}
