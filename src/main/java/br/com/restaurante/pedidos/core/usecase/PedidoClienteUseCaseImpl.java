package br.com.restaurante.pedidos.core.usecase;

import br.com.restaurante.pedidos.core.domain.contract.PedidoClienteRepository;
import br.com.restaurante.pedidos.core.domain.contract.PedidoClienteUseCase;
import br.com.restaurante.pedidos.core.domain.entity.PedidoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoClienteUseCaseImpl implements PedidoClienteUseCase {

    @Autowired
    private PedidoClienteRepository pedidoClienteRepository;

    @Override
    public PedidoCliente insert(PedidoCliente pedidoCliente) {
        pedidoClienteRepository.insert(pedidoCliente);
        return pedidoCliente;
    }

    @Override
    public List<PedidoCliente> getAll() {
        return pedidoClienteRepository.getAll();
    }

    @Override
    public PedidoCliente getById(int id) {
        return pedidoClienteRepository.getById(id);
    }

    @Override
    public PedidoCliente update(PedidoCliente pedidoCliente) {
        pedidoClienteRepository.update(pedidoCliente);
        return pedidoCliente;
    }

    @Override
    public void delete(int id) {
        pedidoClienteRepository.delete(id);
    }
}
