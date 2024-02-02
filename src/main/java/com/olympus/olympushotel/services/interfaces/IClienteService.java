package com.olympus.olympushotel.services.interfaces;

import com.olympus.olympushotel.controllers.dtos.response.GetClienteResponse;
import com.olympus.olympushotel.controllers.dtos.request.CreateClienteRequest;

import java.util.List;

public interface IClienteService {
    GetClienteResponse get(Long id);

    GetClienteResponse create(CreateClienteRequest request);

    GetClienteResponse update(Long id, CreateClienteRequest request);

    void delete(Long id);

    List<GetClienteResponse> findAll();
}
