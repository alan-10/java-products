

Uma API RESTful desenvolvida em Spring Boot para gerenciar productos

## Índice

- [Descrição](#descrição)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Como Executar](#como-executar)
- [Endpoints](#endpoints)
- [Regra de Negócio](#regra-de-negocio)
- [Contribuição](#contribuição)
- [Licença](#licença)


## Descrição

Esta API permite a gestão de caixas de e-mail, pastas e mensagens armazenadas. Ela fornece funcionalidades para criar, ler, atualizar e excluir e-mails e pastas.

## Pré-requisitos

Antes de começar, você precisa ter instalado em sua máquina:

- [Java JDK 11 ou superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)

## Instalação

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/email-management-api.git
   cd email-management-api

2. Instale as dependências:

    ```bash
    mvn install

Também poderá ser executado o comando, abaixo e ter acesso a aplicação e o banco de dados no docker!

    ```bash
    docker compose up


Como Executar:

    ```bash
    mvn spring-boot:run

A aplicação estará disponível em http://localhost:8080/swagger-ui/index.html#.

3. Endpoints

Gestão de Produtos:

    POST /product: Insere produtos
    POST /product/increase/{id}:  Aumenta quantidade de estoque do produto
    GET /product/lowStockProducts: List os produtos que estão a quantidade de estoque igual o abaixo de 10
    GET /product/list: lista todos os produtos
    GET /product/findBYId/{id} List o produto pelo ID

Gestão Cliente:

    POST /user: Cria cliente
    GET /user/{id}: Busca o cliente pelo ID
    GET /user/all Retorna todos os clientes
  

Gestão vendas

    GET /order//{id}: Retorna a venda pelo ID.
    POST /Order: Cria uma nova venda.
    

## Regra de Negócio

         Para criar uma venda é preciso primeiro serguir os seguintes passos
         1 criar uma categoria
         2 criar um produto vinculando o ID da acategoria criado no produtom, e a quantidade do estoque.
         3 Crir um cliente.
         4 Ao criar uma venda é necessário passar o ID do cliente e o Id do produto.

         caso o Produto não tenha estoque o suficinte para fazer a venda irá mostrar  um erro.

6. Contribuição

        Contribuições são bem-vindas! Sinta-se à vontade para enviar um pull request ou abrir uma issue.

7. Licença

         Este projeto está licenciado sob a MIT License.
