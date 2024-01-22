package com.olympus.olympushotel.entities;

import com.olympus.olympushotel.entities.enums.TipoHabitacion;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "habitaciones")
@Getter @Setter
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TipoHabitacion tipoHabitacion;

    private String descripcion;

    private Double tarifa;

    @OneToMany(mappedBy = "habitacion", cascade = CascadeType.ALL)
    private List<Reservacion> reservaciones;

    @OneToMany(mappedBy = "habitacion", cascade = CascadeType.ALL)
    private List<Tarifa> tarifas;
}
