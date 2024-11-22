package br.com.restaurante.pedidos.core.domain.contract;

import br.com.restaurante.pedidos.core.domain.entity.Cliente;

import java.util.List;

public interface ClienteUseCase {

    Cliente insert(Cliente cliente);

    Cliente getById(int id);

    Cliente put(Cliente cliente);

    void delete(int id);

}
