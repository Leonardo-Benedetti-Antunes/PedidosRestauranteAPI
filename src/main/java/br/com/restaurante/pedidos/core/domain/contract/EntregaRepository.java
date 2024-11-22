package br.com.restaurante.pedidos.core.domain.contract;

import br.com.restaurante.pedidos.core.domain.entity.Entrega;
import java.util.List;

public interface EntregaRepository {

    List<Entrega> getAll();
}
