package com.codeki.vuelosapi.utils;

import com.codeki.vuelosapi.DTO.FlightDTO;
import com.codeki.vuelosapi.model.Flight;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FlightUtils {
    public List<Flight> getOffers(List<Flight> flights, double offerPrice){
        return flights.stream()
                .filter(flight -> flight.getPrice() <= offerPrice )
                .collect(Collectors.toList());
    }

    public FlightDTO flightMapper(Flight flight, double price){
        return new FlightDTO(flight.getId(),
                flight.getCod(),
                flight.getOrigin(),
                flight.getDestiny(),
                flight.getDateTimeDeparture(),
                flight.getDateTimeArrival(),
                flight.getPrice() * price, flight.getFrequency(), flight.getCompany());
    }

    public List<FlightDTO> flightsMapper(List<Flight> flights, double price){
        List<FlightDTO> flightsDto = new ArrayList<>();

        for (Flight flight : flights) {
            flightsDto.add(new FlightDTO(
                    flight.getId(),
                    flight.getCod(),
                    flight.getOrigin(),
                    flight.getDestiny(),
                    flight.getDateTimeDeparture(),
                    flight.getDateTimeArrival(),
                    flight.getPrice() * price,
                    flight.getFrequency(),
                    flight.getCompany())
            );
        }

        return flightsDto;
    }
}
