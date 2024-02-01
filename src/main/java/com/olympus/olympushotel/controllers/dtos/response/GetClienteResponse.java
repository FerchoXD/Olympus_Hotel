package com.olympus.olympushotel.controllers.dtos.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GetClienteResponse {
    private Long id;
    private String correo;
    private String telefono;
    private String nombre;
    private String apellidos;
}
