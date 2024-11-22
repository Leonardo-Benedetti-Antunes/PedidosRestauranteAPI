package br.com.restaurante.pedidos.core.usecase;

import br.com.restaurante.pedidos.core.domain.contract.EntregaRepository;
import br.com.restaurante.pedidos.core.domain.contract.EntregaUseCase;
import br.com.restaurante.pedidos.core.domain.entity.Entrega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaUseCaseImpl implements EntregaUseCase {

    @Autowired
    private EntregaRepository entregaRepository;

    @Override
    public List<Entrega> getAll() {
        return entregaRepository.getAll();
    }
}
