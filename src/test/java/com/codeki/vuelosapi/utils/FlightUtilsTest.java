package com.codeki.vuelosapi.utils;

import com.codeki.vuelosapi.DTO.FlightDTO;
import com.codeki.vuelosapi.model.Flight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FlightUtilsTest {
    @Autowired
    FlightUtils flightUtils;
    double dollarPrice = 1015;
    LocalDateTime departure = LocalDateTime.of(2024,3,11, 18,0);
    LocalDateTime arrival = LocalDateTime.of(2024,4,15, 18,15);

    @BeforeEach
    public void setUp(){}
    @Test
    void flightsMapperTest() {
        List<Flight> flightList = new ArrayList<>();
        List<FlightDTO> flightDTOList;

        Flight flight = new Flight();
        flight.setId(1L);
        flight.setCod("14fg");
        flight.setOrigin("URU");
        flight.setDestiny("ARG");
        flight.setDateTimeDeparture(departure);
        flight.setDateTimeArrival(arrival);
        flight.setPrice(150);
        flight.setFrequency("1hr");
        // ejemplo de comó pasar fecha por parámetro flight.setDateTimeDeparture(LocalDateTime.of(2024,3,11, 18,0));
        flightList.add(flight);

        flightDTOList = flightUtils.flightsMapper(flightList, dollarPrice);

        FlightDTO flightDTO = flightDTOList.get(0);
        assertEquals(1, flightDTO.getId());
        assertEquals("URU", flightDTO.getOrigin());
        assertEquals("ARG", flightDTO.getDestiny());
        assertEquals(flight.getDateTimeDeparture(), flightDTO.getDateTimeDeparture());
        assertEquals(flight.getDateTimeArrival(), flightDTO.getDateTimeArrival());
        assertEquals(dollarPrice*flight.getPrice(), flightDTO.getConvertedPrice());

    }
}