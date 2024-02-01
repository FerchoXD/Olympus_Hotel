package com.olympus.olympushotel.controllers;

import com.olympus.olympushotel.controllers.dtos.response.GetClienteResponse;
import com.olympus.olympushotel.services.interfaces.IHabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Habitaciones")
public class HabitacionController {
    @Autowired
    private IHabitacionService service;
    @GetMapping("{id}")
    public GetClienteResponse get(@PathVariable Long id) {
        return service.get(id);
    }
}
