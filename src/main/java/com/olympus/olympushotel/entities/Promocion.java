package com.olympus.olympushotel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "promociones")
@Getter @Setter
public class Promocion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    private BigDecimal descuento;

    private LocalDate fecha_inicio;

    private LocalDate fecha_fin;

    @OneToOne(mappedBy = "promocion")
    private Reservacion reservacion;
}
