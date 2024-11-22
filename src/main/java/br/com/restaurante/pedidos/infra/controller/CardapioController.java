package br.com.restaurante.pedidos.infra.controller;

import br.com.restaurante.pedidos.core.domain.contract.CardapioUseCase;
import br.com.restaurante.pedidos.core.domain.entity.Cardapio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cardapio")
public class CardapioController {

    @Autowired
    private CardapioUseCase cardapioUseCase;

    @GetMapping
    public ResponseEntity<List<Cardapio>> getAll() {
        List<Cardapio> cardapios = cardapioUseCase.getAll();
        return ResponseEntity.ok(cardapios);
    }
}
