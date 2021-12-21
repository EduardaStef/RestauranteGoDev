package com.godev.restaurantegodev.repository.custom;

import java.util.List;

import com.godev.restaurantegodev.model.Cliente;

public interface ClienteRepoCustom {

    List<Cliente> buscarTodosClientesQueryDsl();
}
