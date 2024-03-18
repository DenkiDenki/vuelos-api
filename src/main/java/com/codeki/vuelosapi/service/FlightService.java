package com.codeki.vuelosapi.service;

import com.codeki.vuelosapi.model.Flight;
import com.codeki.vuelosapi.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;

    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }
    public Optional<Flight> getFlightById(Long id) {
        return flightRepository.findById(id);
    }

    public void createFlight(Flight flight){
        flightRepository.save(flight);
    }

    public void deleteFlightById(Long id) {
        Optional<Flight> delFlight = flightRepository.findById(id);
        delFlight.ifPresent(flightRepository::delete);

       /* flightList.remove(delFlight);*/

    }

    public Optional<Flight> updateFlight(Flight flight) {
        flightRepository.save(flight);
        return flightRepository.findById(flight.getId());
    }

    public List<Flight> getFlightsInProm(double offer) {
        List<Flight> flightsProm = flightRepository.findAll();
        return flightsProm.stream().filter(flight -> flight.getPrice() <= offer).collect(Collectors.toList());

    }
}
