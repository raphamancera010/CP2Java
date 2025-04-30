# 👜 CP2 - Domain Driven Design - Bolsas, Malas e Mochilas

Este projeto foi desenvolvido como parte do CP2 da disciplina **1TDSPJ-2025** com foco em **Domain Driven Design (DDD)**, utilizando Java puro e organizado em pacotes.

## 🎯 Tema

A aplicação simula um sistema de cadastro e manipulação de produtos da categoria **Bolsas, Malas e Mochilas**, inspirado no site [1tdspj-commerce.com](http://1tdspj-commerce.com). Os produtos possuem informações técnicas, avaliações de usuários e sugestões com tipos específicos.

---

## 📁 Estrutura de Pacotes

```
src/
├── models/   -> Entidades do domínio (Produto, Bolsa, Avaliacao, Sugestao)
├── enums/    -> Enumeração usada no sistema (TipoSugestao)
└── testes/   -> Classe de execução com menu (MenuTeste.java)
```

---

## 🧠 Conceitos Aplicados

- **Encapsulamento**
- **Herança e Abstração**
- **Enumeração (enum)**
- **Regras de Negócio**
- **DDD - Domain Driven Design**

---

## 🧩 Funcionalidades

- Visualizar informações básicas e técnicas de uma bolsa
- Atualizar descrição do produto
- Aplicar desconto (%)
- Verificar se está em promoção
- Realizar avaliações com nota e comentário
- Enviar sugestões com tipo definido (ELOGIO, CRÍTICA, SUGESTÃO)

---

## 📋 Classes principais

### 🔸 Produto (abstrata)
- Atributos: nome, marca, preço, descrição
- Métodos:
  - `getInformacoesAdicionais()`
  - `getDescricao()`
  - `aplicarDesconto()`
  - `estaEmPromocao()`
  - `atualizarDescricao()`

### 🔸 Bolsa (herda Produto)
- Atributos adicionais: tipo, capacidade em litros, impermeável
- Implementa: `getDetalhesTecnicos()`

### 🔸 Avaliacao
- Armazena nota (1 a 5), usuário e comentário

### 🔸 Sugestao
- Armazena tipo (enum), usuário e mensagem

### 🔸 TipoSugestao (enum)
- ELOGIO
- CRITICA
- SUGESTAO

---

## 🖥️ Execução

A classe `MenuTeste` permite interação via terminal com opções de menu numeradas. Basta rodar o método `main` e seguir as instruções exibidas.

---

## 👨‍💻 Desenvolvedores

- Nomes: **Raphael** **Matheus**
- Repositório: [github.com/raphamancera010/CP2Java](https://github.com/raphamancera010/CP2Java)

---

## ✅ Requisitos do CP2 atendidos

- Projeto com nome `cp2_Nomes`
- Três pacotes: `models`, `enums`, `testes`
- Uso de classe abstrata e herança
- Criação de enums e métodos de negócio
- Menu de testes funcionando
- Avaliação e sugestão do produto

---

> Projeto entregue com sucesso no prazo da disciplina 💡
