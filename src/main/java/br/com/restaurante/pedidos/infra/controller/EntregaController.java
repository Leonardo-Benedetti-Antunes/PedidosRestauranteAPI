package br.com.restaurante.pedidos.infra.controller;

import br.com.restaurante.pedidos.core.domain.contract.EntregaUseCase;
import br.com.restaurante.pedidos.core.domain.entity.Entrega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrega")
public class EntregaController {

    @Autowired
    private EntregaUseCase entregaUseCase;

    @GetMapping
    public ResponseEntity<List<Entrega>> getAll() {
        List<Entrega> entregas = entregaUseCase.getAll();
        return ResponseEntity.ok(entregas);
    }
}
