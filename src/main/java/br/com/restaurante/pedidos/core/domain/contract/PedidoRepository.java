package br.com.restaurante.pedidos.core.domain.contract;

import br.com.restaurante.pedidos.core.domain.entity.Pedido;
import java.util.List;

public interface PedidoRepository {

    void insert(Pedido pedido);

    List<Pedido> getById(int id);

    void put(Pedido pedido);

    void delete(int id);
}
