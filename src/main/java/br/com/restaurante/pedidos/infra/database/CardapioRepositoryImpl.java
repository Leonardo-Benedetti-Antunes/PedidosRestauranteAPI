package br.com.restaurante.pedidos.infra.database;

import br.com.restaurante.pedidos.core.domain.contract.CardapioRepository;
import br.com.restaurante.pedidos.core.domain.entity.Cardapio;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardapioRepositoryImpl implements CardapioRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Cardapio> getAll() {
        var query = "SELECT * FROM cardapio";
        return entityManager.createNativeQuery(query, Cardapio.class)
                .getResultList();
    }
}
