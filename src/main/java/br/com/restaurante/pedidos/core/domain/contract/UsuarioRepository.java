package br.com.restaurante.pedidos.core.domain.contract;

import br.com.restaurante.pedidos.core.domain.entity.Usuario;
import java.util.List;

public interface UsuarioRepository {

    void insert(Usuario usuario);

    List<Usuario> getById(int id);

    void put(Usuario usuario);

    void delete(int id);
}
