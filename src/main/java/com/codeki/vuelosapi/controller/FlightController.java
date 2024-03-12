package com.codeki.vuelosapi.controller;

import com.codeki.vuelosapi.model.Flight;
import com.codeki.vuelosapi.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/flights")
    public List<Flight> flightList() {
        return flightService.listFlights();

    }
    @GetMapping("/flight")
    public Flight flight(@RequestParam long id) {
        return flightService.getFlightById(id);
    }

}
