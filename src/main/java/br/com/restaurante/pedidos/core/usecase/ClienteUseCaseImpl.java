package br.com.restaurante.pedidos.core.usecase;

import br.com.restaurante.pedidos.core.domain.contract.ClienteRepository;
import br.com.restaurante.pedidos.core.domain.contract.ClienteUseCase;
import br.com.restaurante.pedidos.core.domain.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteUseCaseImpl implements ClienteUseCase {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente insert(Cliente cliente) {
        clienteRepository.insert(cliente);
        return cliente;
    }

    @Override
    public Cliente getById(int id) {
        List<Cliente> clientes = clienteRepository.getById(id);
            return clientes.get(0);
    }

    @Override
    public Cliente put(Cliente cliente) {
        clienteRepository.put(cliente);
        return cliente;
    }

    @Override
    public void delete(int id) {
        clienteRepository.delete(id);
    }
}
