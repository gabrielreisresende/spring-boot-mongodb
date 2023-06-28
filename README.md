# Spring Boot MongoDB Project
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/gabrielreisresende/spring-boot-mongodb/blob/main/LICENSE)

Este é um projeto que utiliza o Spring Boot armazenando os dados no MongoDB.

## Tecnologias utilizadas
- Spring Boot
- MongoDB
- Spring Data MongoDB
- RESTful APIs
- Maven
- Java 8

## Pré-requisitos

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas:

- Java Development Kit (JDK) 8 ou superior
- MongoDB

## Configuração

1. Clone este repositório em sua máquina local:

   ```bash
   git clone https://github.com/gabrielreisresende/spring-boot-mongodb.git


2. Importe o projeto em sua IDE favorita como um projeto Maven.

3. Certifique-se de que seu servidor MongoDB está em execução. Você pode instalá-lo localmente ou usar uma instância remota.

4. Abra o arquivo `src/main/resources/application.properties` e configure as propriedades relacionadas ao MongoDB, como URL, porta e nome do banco de dados, se necessário.

## Executando o projeto

- Na sua IDE, execute a classe `SpringBootMongodbApplication` como um aplicativo Java.

  O projeto será executado e estará disponível em `http://localhost:8080`

## Utilizando os endpoints

Este projeto oferece alguns endpoints para interagir com o MongoDB. Você pode testá-los usando um cliente REST, como, por exemplo, o Postman. Aqui estão alguns exemplos de endpoints disponíveis:

- `GET /users`: retorna todos os usuários armazenados no banco de dados.
- `GET /users/{id}`: retorna um usuário específico com o ID fornecido.
- `POST /users`: cria um novo usuário com os dados fornecidos no corpo da solicitação.
- `PUT /users/{id}`: atualiza os dados de um usuário existente com o ID fornecido.
- `DELETE /users/{id}`: exclui um usuário com o ID fornecido.
- `GET /posts/titlesearch?text=Bom%20dia`: retorna todos os posts contendo o texto "Bom dia".
- `GET /posts/fullsearch?text=aproveite&minDate=2018-03-20&maxDate=2018-03-30`: retorna todos os posts contendo o texto escrito entre as datas especificadas.


