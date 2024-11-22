package br.com.restaurante.pedidos.infra.database;

import br.com.restaurante.pedidos.core.domain.contract.UsuarioRepository;
import br.com.restaurante.pedidos.core.domain.entity.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    @Override
    public void insert(Usuario usuario) {
        var query = """
                INSERT INTO usuario (login, senha) 
                VALUES (:login, :senha)
                """;
        entityManager.createNativeQuery(query)
                .setParameter("login", usuario.getLogin())
                .setParameter("senha", usuario.getSenha())
                .executeUpdate();
    }

    @Override
    public List<Usuario> getById(int id) {
        var query = "SELECT * FROM usuario WHERE id = :id";
        return entityManager.createNativeQuery(query, Usuario.class)
                .setParameter("id", id)
                .getResultList();
    }

    @Transactional
    @Override
    public void put(Usuario usuario) {
        var query = """
                UPDATE usuario 
                SET login = :login, senha = :senha 
                WHERE id = :id
                """;
        entityManager.createNativeQuery(query)
                .setParameter("id", usuario.getId())
                .setParameter("login", usuario.getLogin())
                .setParameter("senha", usuario.getSenha())
                .executeUpdate();
    }

    @Transactional
    @Override
    public void delete(int id) {
        var query = "DELETE FROM usuario WHERE id = :id";
        entityManager.createNativeQuery(query)
                .setParameter("id", id)
                .executeUpdate();
    }
}
