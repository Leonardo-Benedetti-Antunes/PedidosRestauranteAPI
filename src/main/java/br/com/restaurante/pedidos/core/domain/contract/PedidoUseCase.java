package br.com.restaurante.pedidos.core.domain.contract;

import br.com.restaurante.pedidos.core.domain.entity.Pedido;
import java.util.List;

public interface PedidoUseCase {

    Pedido insert(Pedido pedido);

    Pedido getById(int id);

    Pedido put(Pedido pedido);

    void delete(int id);
}
