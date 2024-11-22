package br.com.restaurante.pedidos.core.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "cardapio")
public class Cardapio {

    @Id
    @Column (name = "id")
    private int id;

    @Column (name = "nome_cardapio")
    private String nome_cardapio;

    @Column (name = "valor_prato")
    private float valor_prato;

    @Column (name = "categoria_id")
    private int categoria_id;

    @Column (name = "descricao")
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_cardapio() {
        return nome_cardapio;
    }

    public void setNome_cardapio(String nome_cardapio) {
        this.nome_cardapio = nome_cardapio;
    }

    public float getValor_prato() {
        return valor_prato;
    }

    public void setValor_prato(float valor_prato) {
        this.valor_prato = valor_prato;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
