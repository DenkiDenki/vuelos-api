package com.codeki.vuelosapi.utils;

import com.codeki.vuelosapi.model.Flight;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FlightUtils {
    public List<Flight> getOffers(List<Flight> flights, double offerPrice){
        return flights.stream()
                .filter(flight -> flight.getPrice() <= offerPrice )
                .collect(Collectors.toList());
    }
}
