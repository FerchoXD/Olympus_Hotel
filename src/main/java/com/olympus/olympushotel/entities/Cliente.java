package com.olympus.olympushotel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "clientes")
@Getter @Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 250)
    private String correo;

    private String contraseña;

    private String telefono;

    private String nombre;

    private String apellidos;

    private LocalDateTime timestampColumn;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Reservacion> reservaciones;
}
