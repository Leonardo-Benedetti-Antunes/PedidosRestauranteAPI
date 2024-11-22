package br.com.restaurante.pedidos.infra.controller;

import br.com.restaurante.pedidos.core.domain.contract.PedidoUseCase;
import br.com.restaurante.pedidos.core.domain.entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoUseCase pedidoUseCase;

    @PostMapping
    public ResponseEntity<Pedido> create(@RequestBody Pedido pedido) {
        Pedido createdPedido = pedidoUseCase.insert(pedido);
        return ResponseEntity.ok(createdPedido);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> getById(@PathVariable int id) {
        Pedido pedido = pedidoUseCase.getById(id);
        return pedido != null ? ResponseEntity.ok(pedido) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedido> update(@PathVariable int id, @RequestBody Pedido pedido) {
        pedido.setId(id);
        Pedido updatedPedido = pedidoUseCase.put(pedido);
        return ResponseEntity.ok(updatedPedido);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        pedidoUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }
}
