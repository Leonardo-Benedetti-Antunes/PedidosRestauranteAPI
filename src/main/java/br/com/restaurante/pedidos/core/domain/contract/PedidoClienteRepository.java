package br.com.restaurante.pedidos.core.domain.contract;

import br.com.restaurante.pedidos.core.domain.entity.PedidoCliente;
import java.util.List;

public interface PedidoClienteRepository {

    void insert(PedidoCliente pedidoCliente);

    List<PedidoCliente> getAll();

    PedidoCliente getById(int id);

    void update(PedidoCliente pedidoCliente);

    void delete(int id);
}
