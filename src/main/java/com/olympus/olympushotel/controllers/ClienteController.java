package com.olympus.olympushotel.controllers;

import com.olympus.olympushotel.controllers.dtos.response.GetClienteResponse;
import com.olympus.olympushotel.controllers.dtos.request.CreateClienteRequest;
import com.olympus.olympushotel.services.interfaces.IClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private IClienteService service;
    private static final Logger logger = LoggerFactory.getLogger(ClienteController.class);

    @GetMapping("/{id}")
    public GetClienteResponse get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping("/create")
    public GetClienteResponse create(@Valid @RequestBody CreateClienteRequest request) {
        GetClienteResponse clienteResponse = service.create(request);
        return clienteResponse;
    }
}
