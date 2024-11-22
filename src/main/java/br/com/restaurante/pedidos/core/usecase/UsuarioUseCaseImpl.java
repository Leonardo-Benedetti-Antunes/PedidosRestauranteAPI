package br.com.restaurante.pedidos.core.usecase;

import br.com.restaurante.pedidos.core.domain.contract.UsuarioRepository;
import br.com.restaurante.pedidos.core.domain.contract.UsuarioUseCase;
import br.com.restaurante.pedidos.core.domain.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioUseCaseImpl implements UsuarioUseCase {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario insert(Usuario usuario) {
        usuarioRepository.insert(usuario);
        return usuario;
    }

    @Override
    public Usuario getById(int id) {
        List<Usuario> usuarios = usuarioRepository.getById(id);
        return usuarios.isEmpty() ? null : usuarios.get(0);
    }

    @Override
    public Usuario put(Usuario usuario) {
        usuarioRepository.put(usuario);
        return usuario;
    }

    @Override
    public void delete(int id) {
        usuarioRepository.delete(id);
    }
}
