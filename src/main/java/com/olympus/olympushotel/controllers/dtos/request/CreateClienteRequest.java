package com.olympus.olympushotel.controllers.dtos.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;

@Getter @Setter
public class CreateClienteRequest {
    private Long id;
    @NotNull @NotEmpty @Email(message = "El correo debe ser una dirección de correo electrónico válida")
    private String correo;
    @NotNull @NotEmpty
    private String telefono;
    @NotNull @NotEmpty
    private String nombre;
    @NotNull @NotEmpty
    private String apellidos;
}
