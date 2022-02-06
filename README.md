# DevVoo
## API Rest para suportar um sistema de vendas de passagens aéreas. 

<br />

### Executando o projeto em seu localhost

1 - Para executar o projeto em localhost é necessário ter o Java JDK 8 ou 11 e o banco de dados MySQL depois basta clonar ou fazer o download do projeto e abrir em seu editor de código (Eclipse, InteliJ e etc...).

2 - Navegue entre os diretorios do pojetos pelo caminho src\main\resources até o diretório resources.

3 - Dentro do diretório resources abrir o arquivo application.properties para configurar o usuário e senha do seu banco de dados. 

Exemplo:

spring.jpa.database=MYSQL <br />
spring.datasource.url=jdbc:mysql://localhost/db_dev_voo <br />
spring.datasource.username=NOME_DE_USUARIO_DO_SEU_MYSQL <br />
spring.datasource.password=SENHA_DO_SEU_MYSQL

4 - Em seu MySQL você deve criar o banco de dados da seguinte forma:
CREATE DATABASE db_dev_voo;

* Fazendo os passos acima e ao iniciar o projeto o Flyway vai executar as migrations criando as tabelas necessárias no banco de dados e o seed.

* No diretório collectionPostman do projeto você irá encontrar o arquivo para importar em seu Postman com todas as requsições

<br />

# Listando voos com seus assentos disponíveis

1 - Requisição GET para url: http://localhost:8080/voos

<br />

# Consultando detalhes da passagem com o voo

2 - Requisição GET para url: http://localhost:8080/airline-tickets/1

* É necessário passar o id da passagem como parâmetro na url como no exemplo acima.

<br />

# Listar passagens aéreas por cliente

3 - Requisição GET para url: http://localhost:8080/airline-tickets/customer/2

* É necessário passar o id do cliente como parâmetro na url como no exemplo acima.

<br />

# Consultando detalhes da passagem por voo

4 - Requisição GET para url: http://localhost:8080/airline-tickets/voo/1

* É necessário passar o id do voo como parâmetro na url como no exemplo acima.

<br />

# Adicioando um voo

5 - Para adicionar um voo com o seus assentos basta enviar uma requisição POST para url: http://localhost:8080/voos
* No corpo da requisição você deve enviar o conteúdo no formato JSON, segue o exemplo:

```json
{
    "timeToGo": "2022-02-04T11:25:30.00Z",
    "arrivalTime": "2022-02-04T15:30:00.00Z",
    "airportOfOrigin": "TESTE",
    "destinationAirport": "TESTE",
    "numberOfSeats": 2,
    "price": 359.99,
    "seats": [
        {
            "name": "A1"
        },
        {
            "name": "A2"
        }
    ]
}
```

<br />

# Adicioando um cliente

6 - Para adicionar um cliente basta enviar uma requisição POST para url: http://localhost:8080/customers
* No corpo da requisição você deve enviar o conteúdo no formato JSON, segue o exemplo:

```json
{
  "birthDate": "1995-04-06",
  "cpf": "12312312399",
  "fullName": "Fulano de Tal"
}
```

<br />

# Adicioando compra de passagem aérea

7 - Para adicionar a compra de uma passagem aérea basta enviar uma requisição POST para url: http://localhost:8080/airline-tickets
* No corpo da requisição você deve enviar o conteúdo no formato JSON, segue o exemplo:

```json
{
  "customer": {
    "id": 2
  },
  "flightSea": {
    "id": 3
  },
  "voo": {
    "id": 1
  }
}
```

<br />

# Acessando a documentação com Swagger

1 - Para acessar a documentação no estilo Swagger-UI acesse a url: http://localhost:8080/swagger-ui.html

* Lembre-se para abrir a url do swagger é necessário estar com o seu projeto iniciado e em execução no seu localhost.
