package com.codeki.vuelosapi.controller;

import com.codeki.vuelosapi.DTO.FlightDTO;
import com.codeki.vuelosapi.model.Flight;
import com.codeki.vuelosapi.service.FlightService;
import dollar.model.Dollar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("")
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
    public List<Flight> getFlightsByLocationAndDestiny(@RequestParam String origin, @RequestParam String destiny) {
        return flightService.getByOriginAndDestiny(origin, destiny);
    }

    @GetMapping("/pesos")
    public List<FlightDTO> getAllFlightsPeso(){
        return flightService.getAllFlightsPesos();
    }
    @PostMapping("/create/{companyId}")
    @ResponseBody
    public Flight createFlight(@RequestBody Flight flight, @PathVariable Long companyId) {
        return flightService.createFlight(flight, companyId);

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
    @GetMapping("/alldollars")
    public List<Dollar> getAllDollars(){
        return flightService.getAllDollars();
    }

    /*@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}*/

}
