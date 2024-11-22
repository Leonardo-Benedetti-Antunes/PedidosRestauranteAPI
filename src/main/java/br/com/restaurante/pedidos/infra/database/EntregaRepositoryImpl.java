package br.com.restaurante.pedidos.infra.database;

import br.com.restaurante.pedidos.core.domain.contract.EntregaRepository;
import br.com.restaurante.pedidos.core.domain.entity.Entrega;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EntregaRepositoryImpl implements EntregaRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Entrega> getAll() {
        var query = "SELECT * FROM entrega";
        return entityManager.createNativeQuery(query, Entrega.class)
                .getResultList();
    }
}
