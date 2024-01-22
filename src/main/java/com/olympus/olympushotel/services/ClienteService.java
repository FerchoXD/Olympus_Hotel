package com.olympus.olympushotel.services;

import com.olympus.olympushotel.controllers.advices.ClienteNotFoundException;
import com.olympus.olympushotel.controllers.dtos.GetClienteResponse;
import com.olympus.olympushotel.entities.Cliente;
import com.olympus.olympushotel.repositories.IClienteRepository;
import com.olympus.olympushotel.services.interfaces.IClienteService;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService {
    @Autowired
    private IClienteRepository repository;

    @Override
    public GetClienteResponse get(Long id) {
        return from(id);
    }

    private GetClienteResponse from(Cliente cliente) {
        GetClienteResponse response = new GetClienteResponse();
        response.setId(cliente.getId());
        response.setCorreo(cliente.getCorreo());
        response.setNombre(cliente.getNombre());
        response.setApellidos(cliente.getApellidos());
        response.setTelefono(cliente.getTelefono());
        response.setTimestampColumn(cliente.getTimestampColumn().toLocalDate());
        return response;
    }

    private GetClienteResponse from(Long idCliente) {
        return repository.findById(idCliente)
                .map(this::from)
                .orElseThrow(() -> new ClienteNotFoundException(idCliente));
    }
}
