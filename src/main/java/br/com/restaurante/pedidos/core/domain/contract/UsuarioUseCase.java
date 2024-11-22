package br.com.restaurante.pedidos.core.domain.contract;

import br.com.restaurante.pedidos.core.domain.entity.Usuario;
import java.util.List;

public interface UsuarioUseCase {

    Usuario insert(Usuario usuario);

    Usuario getById(int id);

    Usuario put(Usuario usuario);

    void delete(int id);
}
