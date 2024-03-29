package com.codeki.vuelosapi.service;

import com.codeki.vuelosapi.configuration.FlightConfiguration;
import com.codeki.vuelosapi.model.Flight;
import com.codeki.vuelosapi.repository.FlightRepository;
import com.codeki.vuelosapi.utils.FlightUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;
    @Autowired
    FlightConfiguration flightConfiguration;
    @Autowired
    FlightUtils flightUtils;

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
    public  List<Flight> getByOrigin(String origin){
        return flightRepository.findByOrigin(origin);
    }

    public  List<Flight> getByOriginAndDestiny(String origin, String destiny){
        return flightRepository.findByOriginAndDestiny(origin, destiny);
    }

    public Optional<Flight> updateFlight(Flight flight) {
        flightRepository.save(flight);
        return flightRepository.findById(flight.getId());
    }

    public List<Flight> getFlightsInProm(double offer) {
        List<Flight> flights = flightRepository.findAll();
        return flightUtils.getOffers(flights, offer);

    }

    public double getDolar() {
        return flightConfiguration.fetchDolar().getAveragePrice();
    }
}
