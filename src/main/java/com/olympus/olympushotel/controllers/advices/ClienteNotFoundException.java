package com.olympus.olympushotel.controllers.advices;

public class ClienteNotFoundException extends RuntimeException{
    public ClienteNotFoundException(Long idCliente) {
        super("El cliente con el ID " + idCliente + " no existe");
    }
}
