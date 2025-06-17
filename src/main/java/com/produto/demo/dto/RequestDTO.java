package com.produto.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record RequestDTO(
        String id,      
        @NotBlank
        String name,    
        @NotNull
        Integer price_in_cents

) {

}
