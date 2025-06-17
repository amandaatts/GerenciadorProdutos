package com.produto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.demo.controller.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
  
}
