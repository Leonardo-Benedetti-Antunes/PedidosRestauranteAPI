package br.com.restaurante.pedidos.infra.database;

import br.com.restaurante.pedidos.core.domain.contract.PedidoClienteRepository;
import br.com.restaurante.pedidos.core.domain.entity.PedidoCliente;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PedidoClienteRepositoryImpl implements PedidoClienteRepository {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    @Override
    public void insert(PedidoCliente pedidoCliente) {
        entityManager.persist(pedidoCliente);
    }

    @Override
    public List<PedidoCliente> getAll() {
        var query = "SELECT * FROM pedido_cliente";
        return entityManager.createNativeQuery(query, PedidoCliente.class).getResultList();
    }

    @Override
    public PedidoCliente getById(int id) {
        return entityManager.find(PedidoCliente.class, id);
    }

    @Transactional
    @Override
    public void update(PedidoCliente pedidoCliente) {
        entityManager.merge(pedidoCliente);
    }

    @Transactional
    @Override
    public void delete(int id) {
        PedidoCliente pedidoCliente = entityManager.find(PedidoCliente.class, id);
        if (pedidoCliente != null) {
            entityManager.remove(pedidoCliente);
        }
    }
}
