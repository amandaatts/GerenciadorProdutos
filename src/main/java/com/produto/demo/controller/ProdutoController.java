package com.produto.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produto.demo.controller.entities.Produto;
import com.produto.demo.dto.RequestDTO;
import com.produto.demo.repositories.ProdutoRepository;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/product")
public class ProdutoController {


    @Autowired
    private ProdutoRepository repository;

   
    @GetMapping
    public ResponseEntity getAllProducts() {
        var allProducts = repository.findAll(); 
        return ResponseEntity.ok(allProducts); 
    }

    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid RequestDTO data) {
        Produto newProduct = new Produto(data); 
        repository.save(newProduct); 
        return ResponseEntity.ok().build(); 
    }

  
    @PutMapping
    @Transactional 
    public ResponseEntity updateProduct(@RequestBody @Valid RequestDTO data) {
        Optional<Produto> optionalProduct = repository.findById(data.id()); 

        if (optionalProduct.isPresent()) {
            Produto product = optionalProduct.get();
            product.setName(data.name()); 
            product.setPrice_in_cents(data.price_in_cents()); 
            return ResponseEntity.ok(product); 
        } else {
            return ResponseEntity.notFound().build(); 
        }
    }
}
