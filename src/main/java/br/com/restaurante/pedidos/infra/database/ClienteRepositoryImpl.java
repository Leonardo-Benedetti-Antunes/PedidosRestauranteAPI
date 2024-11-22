package br.com.restaurante.pedidos.infra.database;

import br.com.restaurante.pedidos.core.domain.contract.ClienteRepository;
import br.com.restaurante.pedidos.core.domain.entity.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    @Override
    public void insert(Cliente cliente) {
        var query = """
                INSERT INTO cliente (nome, email, endereco, celular) 
                VALUES (:nome, :email, :endereco, :celular)
                """;
        entityManager.createNativeQuery(query)
                .setParameter("nome", cliente.getNome())
                .setParameter("email", cliente.getEmail())
                .setParameter("endereco", cliente.getEndereco())
                .setParameter("celular", cliente.getCelular())
                .executeUpdate();
    }

    @Override
    public List<Cliente> getById(int id) {
        var query = "SELECT * FROM cliente WHERE id = :id";
        return entityManager.createNativeQuery(query, Cliente.class)
                .setParameter("id", id)
                .getResultList();
    }

    @Transactional
    @Override
    public void put(Cliente cliente) {
        var query = """
                UPDATE cliente 
                SET nome = :nome, email = :email, endereco = :endereco, celular = :celular 
                WHERE id = :id
                """;
        entityManager.createNativeQuery(query)
                .setParameter("id", cliente.getId())
                .setParameter("nome", cliente.getNome())
                .setParameter("email", cliente.getEmail())
                .setParameter("endereco", cliente.getEndereco())
                .setParameter("celular", cliente.getCelular())
                .executeUpdate();
    }

    @Transactional
    @Override
    public void delete(int id) {
        var query = "DELETE FROM cliente WHERE id = :id";
        entityManager.createNativeQuery(query)
                .setParameter("id", id)
                .executeUpdate();
    }
}
