package com.olympus.olympushotel.services.interfaces;

import com.olympus.olympushotel.controllers.dtos.GetClienteResponse;

public interface IHabitacionService {
    GetClienteResponse get(Long id);
}
