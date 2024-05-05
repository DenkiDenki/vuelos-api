package com.codeki.vuelosapi.DTO;

import com.codeki.vuelosapi.model.Company;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class FlightDTO {
    private Long id;
    private String cod;
    private String origin;
    private String destiny;
    private LocalDateTime dateTimeDeparture;
    private LocalDateTime dateTimeArrival;
    private double convertedPrice;
    private String frequency;
    private Company company;

    public FlightDTO(Long id, String cod, String origin, String destiny, LocalDateTime dateTimeDeparture, LocalDateTime dateTimeArrival, double convertedPrice) {
    }
}
