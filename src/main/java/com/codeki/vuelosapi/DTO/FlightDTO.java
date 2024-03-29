package com.codeki.vuelosapi.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class FlightDTO {
    private Long id;
    private String origin;
    private String destiny;
    private LocalDateTime dateTimeDeparture;
    private LocalDateTime dateTimeArrival;
    private double convertedPrice;
}
