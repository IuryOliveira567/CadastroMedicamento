# Cadastro de Medicamentos

Sistema desktop desenvolvido em Java utilizando Swing para a interface gráfica e MySQL para persistência dos dados.

O projeto permite cadastrar medicamentos e visualizar os registros armazenados no banco de dados por meio de uma tabela integrada à interface.

## Funcionalidades

* Cadastro de medicamentos
* Armazenamento dos dados em banco MySQL
* Listagem automática dos medicamentos cadastrados
* Limpeza dos campos do formulário
* Interface gráfica desenvolvida com Java Swing

## Tecnologias Utilizadas

* Java
* Java Swing
* JDBC
* MySQL
* Apache Ant
* NetBeans IDE

## Estrutura dos Dados

Cada medicamento possui os seguintes atributos:

| Campo           | Descrição                             |
| --------------- | ------------------------------------- |
| id              | Identificador único (auto incremento) |
| nome            | Nome do medicamento                   |
| componenteativo | Componente ativo do medicamento       |
| datacadastro    | Data de cadastro do medicamento       |

## Estrutura do Projeto

```text
src/
├── dao/
│   └── MedicamentoDAO.java
├── model/
│   └── Medicamento.java
├── util/
│   └── Conexao.java
└── view/
    └── FrmMedicamento.java
```

## Configuração do Banco de Dados

Execute o script abaixo no MySQL:

```sql
CREATE DATABASE farmacia;

USE farmacia;

CREATE TABLE medicamento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    componenteativo VARCHAR(150) NOT NULL,
    datacadastro DATE NOT NULL
);
```

## Configuração da Conexão

Configure as credenciais do banco de dados na classe `Conexao.java`:

```java
private static final String URL =
    "jdbc:mysql://localhost:3306/farmacia";

private static final String USER = "root";

private static final String PASSWORD = "";
```

## Como Executar

1. Clone o repositório.
2. Crie o banco de dados utilizando o script fornecido.
3. Adicione o MySQL Connector/J ao projeto.
4. Configure as credenciais na classe `Conexao`.
5. Abra o projeto no NetBeans.
6. Compile e execute a aplicação.

## Objetivo

Este projeto foi desenvolvido para praticar conceitos de:

* Programação Orientada a Objetos (POO)
* Interface gráfica com Java Swing
* Persistência de dados utilizando JDBC
* Integração Java e MySQL
* Organização em camadas (Model, DAO e View)
