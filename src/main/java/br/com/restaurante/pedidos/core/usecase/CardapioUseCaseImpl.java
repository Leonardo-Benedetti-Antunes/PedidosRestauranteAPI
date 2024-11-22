package br.com.restaurante.pedidos.core.usecase;

import br.com.restaurante.pedidos.core.domain.contract.CardapioRepository;
import br.com.restaurante.pedidos.core.domain.contract.CardapioUseCase;
import br.com.restaurante.pedidos.core.domain.entity.Cardapio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardapioUseCaseImpl implements CardapioUseCase {

    @Autowired
    private CardapioRepository cardapioRepository;

    @Override
    public List<Cardapio> getAll() {
        return cardapioRepository.getAll();
    }
}
