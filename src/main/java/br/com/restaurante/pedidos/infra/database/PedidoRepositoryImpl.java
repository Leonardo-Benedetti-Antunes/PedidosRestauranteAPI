package br.com.restaurante.pedidos.infra.database;

import br.com.restaurante.pedidos.core.domain.contract.PedidoRepository;
import br.com.restaurante.pedidos.core.domain.entity.Pedido;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PedidoRepositoryImpl implements PedidoRepository {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    @Override
    public void insert(Pedido pedido) {
        var query = """
                INSERT INTO pedido (cliente_id, descricao, entrega_id) 
                VALUES (:cliente_id, :descricao, :entrega_id)
                """;
        entityManager.createNativeQuery(query)
                .setParameter("cliente_id", pedido.getCliente_id())
                .setParameter("descricao", pedido.getDescricao())
                .setParameter("entrega_id", pedido.getEntrega_id())
                .executeUpdate();
    }

    @Override
    public List<Pedido> getById(int id) {
        var query = "SELECT * FROM pedido WHERE id = :id";
        return entityManager.createNativeQuery(query, Pedido.class)
                .setParameter("id", id)
                .getResultList();
    }

    @Transactional
    @Override
    public void put(Pedido pedido) {
        var query = """
                UPDATE pedido 
                SET cliente_id = :cliente_id, descricao = :descricao, entrega_id = :entrega_id 
                WHERE id = :id
                """;
        entityManager.createNativeQuery(query)
                .setParameter("id", pedido.getId())
                .setParameter("cliente_id", pedido.getCliente_id())
                .setParameter("descricao", pedido.getDescricao())
                .setParameter("entrega_id", pedido.getEntrega_id())
                .executeUpdate();
    }

    @Transactional
    @Override
    public void delete(int id) {
        var query = "DELETE FROM pedido WHERE id = :id";
        entityManager.createNativeQuery(query)
                .setParameter("id", id)
                .executeUpdate();
    }
}
