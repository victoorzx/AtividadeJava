# Sistema de Produtos com Herança e Sobrescrita (Java)

## 📚 Descrição

Este projeto é uma atividade de programação orientada a objetos desenvolvida em Java. O objetivo é implementar um sistema que represente diferentes tipos de produtos utilizando os conceitos de **herança** e **sobrescrita por extensão** (`super`).

A estrutura do sistema conta com:

- Uma **classe base** chamada `Produto`, contendo os atributos comuns a todos os produtos (`nome` e `preco`) e um método `exibirInfo()` para mostrar essas informações.
- Duas **subclasses específicas**:
  - `Livro`, com atributos adicionais como `autor`, `numeroPaginas` e `capaDura`.
  - `VideoGame`, com atributos como `marca`, `modelo` e `preco`.
- Cada subclasse sobrescreve o método `exibirInfo()` utilizando `super.exibirInfo()` para reutilizar a lógica da classe base, e então adiciona suas próprias informações.


## 📁 Estrutura do Projeto

 - Produto.java
 - Livro.java
 - VideoGame.java
 - Main.java

## 🧠 Conceitos Aplicados

- Herança
- Sobrescrita de métodos
- Reutilização de código com super
- Programação orientada a objetos
