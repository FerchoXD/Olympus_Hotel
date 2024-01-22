package com.olympus.olympushotel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "pagos")
@Getter @Setter
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String metodo_pago;

    private String Monto;

    private LocalDate fecha;

    private LocalDateTime timestampColumn;

    @OneToOne(mappedBy = "pago")
    private Reservacion reservacion;
}
