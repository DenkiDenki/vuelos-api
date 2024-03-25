package dolar.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Dolar {
    private String moneda;
    private String casa;
    private String nombre;
    private double compra;
    private double venta;
    private LocalDateTime fechaActualizacion;

    public double getAveragePrice() {
        return ((getCompra() + getVenta())/2);
    }
}