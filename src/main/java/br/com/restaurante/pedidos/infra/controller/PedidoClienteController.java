package br.com.restaurante.pedidos.infra.controller;

import br.com.restaurante.pedidos.core.domain.contract.PedidoClienteUseCase;
import br.com.restaurante.pedidos.core.domain.entity.PedidoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido-cliente")
public class PedidoClienteController {

    @Autowired
    private PedidoClienteUseCase pedidoClienteUseCase;

    @PostMapping
    public ResponseEntity<PedidoCliente> create(@RequestBody PedidoCliente pedidoCliente) {
        PedidoCliente createdPedidoCliente = pedidoClienteUseCase.insert(pedidoCliente);
        return ResponseEntity.ok(createdPedidoCliente);
    }

    @GetMapping
    public ResponseEntity<List<PedidoCliente>> getAll() {
        List<PedidoCliente> pedidoClientes = pedidoClienteUseCase.getAll();
        return ResponseEntity.ok(pedidoClientes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoCliente> getById(@PathVariable int id) {
        PedidoCliente pedidoCliente = pedidoClienteUseCase.getById(id);
        return ResponseEntity.ok(pedidoCliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PedidoCliente> update(@PathVariable int id, @RequestBody PedidoCliente pedidoCliente) {
        pedidoCliente.setId(id);
        PedidoCliente updatedPedidoCliente = pedidoClienteUseCase.update(pedidoCliente);
        return ResponseEntity.ok(updatedPedidoCliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        pedidoClienteUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }
}
