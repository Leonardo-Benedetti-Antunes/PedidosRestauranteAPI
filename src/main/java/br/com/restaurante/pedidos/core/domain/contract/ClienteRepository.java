package br.com.restaurante.pedidos.core.domain.contract;

import br.com.restaurante.pedidos.core.domain.entity.Cliente;
import java.util.List;

public interface ClienteRepository {

    void insert(Cliente cliente);

    List<Cliente> getById(int id);

    void put(Cliente cliente);

    void delete(int id);
}
