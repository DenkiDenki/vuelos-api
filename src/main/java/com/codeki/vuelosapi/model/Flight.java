package com.codeki.vuelosapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String cod;
    private String origin;
    private String destiny;
    private LocalDateTime dateTimeDeparture;
    private LocalDateTime dateTimeArrival;
    private double price;
    private String frequency;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public Flight(String cod, String origin, String destiny, LocalDateTime dateTimeDeparture, LocalDateTime dateTimeArrival, double price, String frequency) {
        this.cod = cod;
        this.origin = origin;
        this.destiny = destiny;
        this.dateTimeDeparture = dateTimeDeparture;
        this.dateTimeArrival = dateTimeArrival;
        this.price = price;
        this.frequency = frequency;
    }
}
