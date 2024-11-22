package br.com.restaurante.pedidos.core.domain.contract;

import br.com.restaurante.pedidos.core.domain.entity.Cardapio;
import java.util.List;

public interface CardapioUseCase {

    List<Cardapio> getAll();
}
