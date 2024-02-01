package com.olympus.olympushotel.controllers.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class CreateClienteRequest {
    private Long id;
    private String correo;
    private String telefono;
    private String nombre;
    @NotNull @NotEmpty
    private String apellidos;
}
