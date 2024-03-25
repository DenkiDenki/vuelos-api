package com.codeki.vuelosapi.DTO;

import java.time.LocalDateTime;

public class FightDTO {
    private Long id;
    private String origin;
    private String destiny;
    private LocalDateTime dateTimeDeparture;
    private LocalDateTime dateTimeArrival;
    private double convertedPrice;
}
