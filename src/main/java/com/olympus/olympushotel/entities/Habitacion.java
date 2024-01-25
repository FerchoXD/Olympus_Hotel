package com.olympus.olympushotel.entities;

import com.olympus.olympushotel.entities.enums.Disponibilidad;
import com.olympus.olympushotel.entities.enums.TipoHabitacion;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "habitaciones")
@Getter @Setter
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TipoHabitacion tipoHabitacion;

    private Disponibilidad disponibilidad;

    private String foto;

    private String titulo;

    private String descripcion;

    private Long puntuacion;

    private LocalDate fecha_inicio;

    private LocalDate fecha_fin;

    private Long numero_huespedes;

    private Double tarifa_original;

    @OneToMany(mappedBy = "habitacion", cascade = CascadeType.ALL)
    private List<Reservacion> reservaciones;

    @OneToMany(mappedBy = "habitacion", cascade = CascadeType.ALL)
    private List<Tarifa> tarifas;
}
