package com.codeki.vuelosapi.controller;

import com.codeki.vuelosapi.model.Flight;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FlightControllerTest {
    LocalDateTime localDateTime1 = LocalDateTime.of(
            2024, 3, 4, 14, 15, 48);
    LocalDateTime localDateTime2 = LocalDateTime.of(
            2024, 5, 5, 15, 30, 48);
    @BeforeEach
    void setUp() {
        Flight flight = new Flight("h4j5",
                "EZE",
                "UIO",
                localDateTime1,
                localDateTime2,
                1000,
                "3HS");
        Flight flight2 = new Flight("N1L5",
                "EZE",
                "MEX",
                localDateTime1,
                localDateTime2,
                2000,
                "3HS");
        Flight flight3 = new Flight("S4K5",
                "URU",
                "BRA",
                localDateTime1,
                localDateTime2,
                500,
                "1HS");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAllFlights() {

    }

    @Test
    void findFlightById() {
    }

    @Test
    void getOffers() {
    }

    @Test
    void createFlight() {
    }

    @Test
    void updateFlight() {
    }

    @Test
    void deleteFlight() {
    }
}