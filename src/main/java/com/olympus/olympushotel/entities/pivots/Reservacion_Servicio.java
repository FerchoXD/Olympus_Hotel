package com.olympus.olympushotel.entities.pivots;

import com.olympus.olympushotel.entities.Habitacion;
import com.olympus.olympushotel.entities.Reservacion;
import com.olympus.olympushotel.entities.Servicio;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservacion_servicio")
@Getter @Setter
public class Reservacion_Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime timestampColumn;

    @ManyToOne
    @JoinColumn(name = "reservacion_id", nullable = false)
    private Reservacion reservacion;

    @ManyToOne
    @JoinColumn(name = "servicio_id", nullable = false)
    private Servicio servicio;
}
