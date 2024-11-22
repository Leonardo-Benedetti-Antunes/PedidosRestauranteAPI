package br.com.restaurante.pedidos.core.usecase;

import br.com.restaurante.pedidos.core.domain.contract.PedidoRepository;
import br.com.restaurante.pedidos.core.domain.contract.PedidoUseCase;
import br.com.restaurante.pedidos.core.domain.entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoUseCaseImpl implements PedidoUseCase {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Pedido insert(Pedido pedido) {
        pedidoRepository.insert(pedido);
        return pedido;
    }

    @Override
    public Pedido getById(int id) {
        List<Pedido> pedidos = pedidoRepository.getById(id);
        return pedidos.isEmpty() ? null : pedidos.get(0);
    }

    @Override
    public Pedido put(Pedido pedido) {
        pedidoRepository.put(pedido);
        return pedido;
    }

    @Override
    public void delete(int id) {
        pedidoRepository.delete(id);
    }
}
