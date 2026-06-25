# 🎮 GameHub System

Sistema de gerenciamento de jogos desenvolvido em Java para organização de bibliotecas de games.

## 📖 Sobre o Projeto

O **GameHub** é uma aplicação criada para facilitar o gerenciamento de coleções de jogos, permitindo cadastrar, consultar, editar e remover informações de forma organizada.

O projeto utiliza a arquitetura **DAO (Data Access Object)** para separar as regras de acesso ao banco de dados da lógica da aplicação, proporcionando maior organização, manutenção e escalabilidade do sistema.

---

## 🚀 Tecnologias Utilizadas

* Java
* JDBC
* PostgreSQL
* SQL
* DAO Pattern
* Programação Orientada a Objetos (POO)

---

## ⚙️ Funcionalidades

### Gerenciamento de Gêneros

* Cadastro de gêneros
* Consulta de gêneros por ID
* Atualização de informações
* Remoção de gêneros

### Banco de Dados

* Integração com PostgreSQL
* Conexão centralizada através da classe `DBConnection`
* Operações CRUD utilizando JDBC

---

## 🛠 Padrões Utilizados

### DAO (Data Access Object)

O projeto utiliza o padrão DAO para separar a camada de acesso ao banco de dados da lógica de negócio.

### Singleton

A classe `DBConnection` utiliza o padrão Singleton para garantir uma única instância de conexão durante a execução da aplicação.

---

## 🗄 Banco de Dados

O sistema está configurado para utilizar um banco PostgreSQL chamado:

```sql
gamehub
```

A conexão é realizada através do JDBC.

---

## 🎯 Objetivo

Desenvolver um sistema simples e eficiente para gerenciamento de informações relacionadas a jogos, servindo como projeto de aprendizado em:

* Java
* JDBC
* PostgreSQL
* Padrões de Projeto
* Persistência de Dados

---

## 👨‍💻 Desenvolvedores

* André
* Anely

---

## 📌 Status do Projeto

🚧 Em desenvolvimento
