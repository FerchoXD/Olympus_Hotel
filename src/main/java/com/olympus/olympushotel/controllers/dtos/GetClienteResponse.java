package com.olympus.olympushotel.controllers.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class GetClienteResponse {
    private Long id;
    private String correo;
    private String telefono;
    private String nombre;
    private String apellidos;
    private LocalDate timestampColumn;
}
