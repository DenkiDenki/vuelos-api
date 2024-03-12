package com.codeki.vuelosapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
    private Long id;
    private String origen;
    private String destiny;
    private LocalDateTime dateTimeDeparture;
    private LocalDateTime dateTimeArrival;
    private double price;
    private String frequency;
}
