package com.codeki.vuelosapi.controller;

import com.codeki.vuelosapi.model.Flight;
import com.codeki.vuelosapi.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/all")
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();

    }
    @GetMapping("/{id}")
    public Optional<Flight> findFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }

    @GetMapping("/offer/{offer}")
    public List<Flight> getOffers(@PathVariable double offer){
        return flightService.getFlightsInProm(offer);
    }

    @GetMapping("/origin")
    public List<Flight> getFlightsByLocations(@RequestParam String origin) {
        return flightService.getByOrigin(origin);
    }

    @GetMapping("/locations")
    public List<Flight> getFlightsByLocations(@RequestParam String origin, @RequestParam String destiny) {
        return flightService.getByOriginAndDestiny(origin, destiny);
    }

    @GetMapping("/dolar-price")
    public double getDolar(){
        return flightService.getDolar();
    }
    @PostMapping("/create")
    @ResponseBody
    public String createFlight(@RequestBody Flight flight) {
        flightService.createFlight(flight);
        return "vuelo agregado";
    }

    @PutMapping("/update")
    public Optional<Flight> updateFlight(@RequestBody Flight flight){
        return flightService.updateFlight(flight);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public String deleteFlight(@PathVariable Long id){
        flightService.deleteFlightById(id);
        return "vuelo eliminado";
    }


}
