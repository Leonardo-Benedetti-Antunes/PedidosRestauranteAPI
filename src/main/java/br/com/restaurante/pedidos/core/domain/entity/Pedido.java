package br.com.restaurante.pedidos.core.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity (name = "pedido")
public class Pedido {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "cliente_id")
    private int cliente_id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "entrega_id")
    private int entrega_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEntrega_id() {
        return entrega_id;
    }

    public void setEntrega_id(int entrega_id) {
        this.entrega_id = entrega_id;
    }
}
