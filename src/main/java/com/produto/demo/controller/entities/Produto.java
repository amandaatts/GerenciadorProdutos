package com.produto.demo.controller.entities;

import jakarta.persistence.*;
import java.util.Objects;

import com.produto.demo.dto.RequestDTO;

@Entity
@Table(name = "tb_product")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price_in_cents;

    public Produto() {}

    public Produto(String id, String name, Integer price_in_cents) {
        this.id = id;
        this.name = name;
        this.price_in_cents = price_in_cents;
    }

    public Produto(RequestDTO requestProduct) {
        this.name = requestProduct.name();
        this.price_in_cents = requestProduct.price_in_cents();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice_in_cents() {
        return price_in_cents;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice_in_cents(Integer price_in_cents) {
        this.price_in_cents = price_in_cents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto product = (Produto) o;
        return Objects.equals(getId(), product.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
