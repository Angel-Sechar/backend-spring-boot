package com.ajsvproject.backend_api.model;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleVenta {
    private Long id;

    @ManyToOne
    private Venta venta;

    @ManyToOne
    private Producto prod;

    private Integer cantProd;

    private Double precio;
}
