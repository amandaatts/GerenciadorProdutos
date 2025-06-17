# Projeto CRUD Produto - Spring Boot

Este é um projeto simples de CRUD (Create, Read, Update, Delete) para gerenciamento de produtos, feito em Java com Spring Boot, utilizando boas práticas de arquitetura limpa.

## Funcionalidades

* Listar todos os produtos
* Cadastrar novo produto
* Atualizar produto existente

## Tecnologias usadas

* Java 17
* Spring Boot
* Spring Data JPA
* Jakarta Validation
* Banco de dados H2 (pode ser configurado para outro)

## Estrutura do projeto

* **Entity**: representa o produto no banco
* **DTO**: classe para receber dados das requisições
* **Repository**: interface para acesso ao banco
* **Service**: lógica de negócio (opcional, nesse projeto simples ficou no controller)
* **Controller**: endpoints REST para manipular produtos

## Como rodar

1. Clone o projeto
2. Configure seu banco (por padrão H2 em memória)
3. Rode a aplicação com `mvn spring-boot:run` ou no seu IDE favorito
4. Use ferramentas como Postman para testar os endpoints `/product`

## Referência

Este projeto foi desenvolvido com base no vídeo:

[CRUD Spring Boot | Vídeo do YouTube](https://www.youtube.com/watch?v=tP6wtEaCnSI)

---

