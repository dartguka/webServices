# Web Services API - Spring Boot
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/dartguka/webServices/blob/main/LICENSE) 

## Principais Conceitos Demonstrados

✔ Desenvolvimento de APIs REST com Spring Boot

✔ Arquitetura em Camadas (Controller, Service, Repository)

✔ Persistência de Dados com JPA/Hibernate

✔ Banco de Dados PostgreSQL

✔ Relacionamentos Many-to-Many, Many-to-One e One-to-One

✔ Tratamento Global de Exceções

✔ Modelagem de Dados para Sistemas de E-commerce

✔ Programação Orientada a Objetos (POO)

✔ Versionamento com Git e GitHub

## Sobre o Projeto

Este projeto consiste no desenvolvimento de uma API RESTful utilizando Java e Spring Boot, simulando um ambiente de e-commerce com gerenciamento de usuários, produtos, categorias, pedidos e pagamentos.

A aplicação foi construída seguindo boas práticas de desenvolvimento backend, arquitetura em camadas e modelagem relacional, permitindo operações completas de cadastro, consulta, atualização e remoção de dados (CRUD).

O sistema contempla a gestão de usuários contendo informações como nome, e-mail, telefone e senha, além do gerenciamento de produtos organizados por categorias, controle de pedidos, itens de pedido e processamento de pagamentos.

Durante o desenvolvimento foram aplicados conceitos fundamentais de Programação Orientada a Objetos, persistência de dados com JPA/Hibernate, relacionamentos complexos entre entidades e tratamento centralizado de exceções.

## Funcionalidades

**Usuários**
- Cadastro de usuários
- Consulta de usuários
- Atualização de dados
- Remoção de registros

**Produtos**
- Cadastro e gerenciamento de produtos
- Controle de preços
- Associação com categorias

**Categorias**
- Cadastro de categorias
- Relacionamento com múltiplos produtos

**Pedidos**
- Criação de pedidos
- Registro de data e hora utilizando Instant (ISO 8601)
- Controle de status dos pedidos

**Pagamentos**
- Processamento de pagamento
- Associação One-To-One com pedidos
- Atualização de status de pagamento

**Tratamento de Exceções**
- Tratamento global de erros
- Respostas padronizadas para requisições inválidas
- Validação de recursos não encontrados

## Arquitetura da Aplicação

A aplicação foi estruturada utilizando arquitetura em camadas:

Controller
↓
Service
↓
Repository
↓
Database
Controller

Responsável por receber as requisições HTTP e retornar respostas para o cliente.

**Service**

Camada que contém as regras de negócio e processamento da aplicação.

**Repository**

Responsável pela comunicação com o banco de dados através do Spring Data JPA.

**Database**

Persistência dos dados utilizando PostgreSQL.

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
## Banco de Dados
- PostgreSQL
## APIs e Comunicação
- REST API
- JSON
- HTTP
## Persistência e ORM
- JPA
- Hibernate
- Entity Mapping
## Modelagem e Arquitetura
Programação Orientada a Objetos (POO)
Arquitetura em Camadas
Modelagem UML
Boas Práticas de Desenvolvimento
## Controle de Versão
- Git
- GitHub

# Autor

Gustavo Moura

https://www.linkedin.com/in/gustavo-smoura

