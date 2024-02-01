package com.olympus.olympushotel.services.interfaces;

import com.olympus.olympushotel.controllers.dtos.response.GetClienteResponse;
import com.olympus.olympushotel.controllers.dtos.request.CreateClienteRequest;

public interface IClienteService {
    GetClienteResponse get(Long id);

    GetClienteResponse create(CreateClienteRequest request);
}
