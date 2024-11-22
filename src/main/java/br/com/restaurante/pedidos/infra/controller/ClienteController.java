package br.com.restaurante.pedidos.infra.controller;

import br.com.restaurante.pedidos.core.domain.contract.ClienteUseCase;
import br.com.restaurante.pedidos.core.domain.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteUseCase clienteUseCase;

    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
        Cliente createdCliente = clienteUseCase.insert(cliente);
        return ResponseEntity.ok(createdCliente);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getById(@PathVariable int id) {
        Cliente cliente = clienteUseCase.getById(id);
            return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> update(@PathVariable int id, @RequestBody Cliente cliente) {
            cliente.setId(id);
            Cliente updatedCliente = clienteUseCase.put(cliente);
            return ResponseEntity.ok(updatedCliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
            clienteUseCase.delete(id);
            return ResponseEntity.noContent().build();
    }
}