package com.codeki.vuelosapi.configuration;

import dollar.model.Dollar;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FlightConfigurationTest {

    @Test
    @DisplayName("el promedio de dollar se calcula correctamente")
    void fetchDollarTest() {
        Dollar dummyDollar = new Dollar();

        FlightConfiguration mockedFlightUtils = mock(FlightConfiguration.class);

        dummyDollar.setMoneda("USD");
        dummyDollar.setCasa("tarjeta");
        dummyDollar.setNombre("Tarjeta");
        dummyDollar.setVenta(1000.00);
        dummyDollar.setCompra(1100.00);

        when(mockedFlightUtils.fetchDollar()).thenReturn(dummyDollar);
        Dollar dollar = mockedFlightUtils.fetchDollar();

        assertEquals(1050, dollar.getAveragePrice(),() -> dollar.getAveragePrice() + " should be equal to " + 1050);
    }
}