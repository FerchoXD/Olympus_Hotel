package com.olympus.olympushotel.entities;

import com.olympus.olympushotel.entities.Cliente;
import com.olympus.olympushotel.entities.Habitacion;
import com.olympus.olympushotel.entities.Pago;
import com.olympus.olympushotel.entities.Promocion;
import com.olympus.olympushotel.entities.pivots.Reservacion_Servicio;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "reservaciones")
@Getter
@Setter
public class Reservacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha_inicio;

    private LocalDate fecha_fin;

    private Long precio_total;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "habitacion_id", nullable = false)
    private Habitacion habitacion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "promocion_id", referencedColumnName = "id")
    private Promocion promocion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pago_id", referencedColumnName = "id")
    private Pago pago;

    @OneToMany(mappedBy = "reservacion", cascade = CascadeType.ALL)
    private List<Reservacion_Servicio> reservacionServicios;
}
