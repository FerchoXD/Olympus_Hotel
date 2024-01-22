package com.olympus.olympushotel.services.interfaces;

import com.olympus.olympushotel.controllers.dtos.GetClienteResponse;

public interface IClienteService {
    GetClienteResponse get(Long id);
}
