package com.olympus.olympushotel.controllers;

import com.olympus.olympushotel.controllers.dtos.GetClienteResponse;
import com.olympus.olympushotel.services.interfaces.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class ClienteController {
    @Autowired
    private IClienteService service;

    @GetMapping("{id}")
    public GetClienteResponse get(@PathVariable Long id) {
        return service.get(id);
    }
}
