package com.codeki.vuelosapi.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {
    private static Flight flight;

    @BeforeAll
    public static void setUp(){
        flight = new Flight();
    }
    @Test
    void getCodSetCod() {
        String testedCod = "e5f6";
        flight.setCod(testedCod);
        assertEquals(flight.getCod(), testedCod);
    }

    @Test
    void getOrigen() {
    }

    @Test
    void getDestiny() {
    }

    @Test
    void getPrice() {
    }

    @Test
    void getFrequency() {
    }
}