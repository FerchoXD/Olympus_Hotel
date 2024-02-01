package com.olympus.olympushotel.services;

import com.olympus.olympushotel.controllers.advices.ClienteNotFoundException;
import com.olympus.olympushotel.controllers.dtos.response.GetClienteResponse;
import com.olympus.olympushotel.controllers.dtos.request.CreateClienteRequest;
import com.olympus.olympushotel.entities.Cliente;
import com.olympus.olympushotel.repositories.IClienteRepository;
import com.olympus.olympushotel.services.interfaces.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(ClienteServiceImpl.class);

    @Override
    public GetClienteResponse get(Long id) {
        return from(id);
    }

    @Override
    public GetClienteResponse create(CreateClienteRequest request) {
        Cliente cliente = new Cliente();
        cliente.setNombre(request.getNombre());
        cliente.setApellidos(request.getApellidos());
        cliente.setCorreo(request.getCorreo());
        cliente.setTelefono(request.getTelefono());
        Cliente savedCliente = repository.save(cliente);
        logger.debug("Cliente creado con exito");
        return from(savedCliente);
    }

    private GetClienteResponse from(Cliente cliente) {
        GetClienteResponse response = new GetClienteResponse();
        response.setId(cliente.getId());
        response.setCorreo(cliente.getCorreo());
        response.setNombre(cliente.getNombre());
        response.setApellidos(cliente.getApellidos());
        response.setTelefono(cliente.getTelefono());
        return response;
    }

    private GetClienteResponse from(Long idCliente) {
        return repository.findById(idCliente)
                .map(this::from)
                .orElseThrow(() -> new ClienteNotFoundException(idCliente));
    }
}
