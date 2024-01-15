<hr>
<p align="center">
   <img src="https://github.com/renatof4rias/spring-project-delivery/assets/123312837/b64b845a-2303-40c0-8c04-54dd6f9d203e" #vitrinedev/>
</p>
<hr>
<h1 align="center"> Delivery </h1>

## Descrição do projeto 

<p align="justify">
Delivery é uma aplicação backend de uma API REST.

A aplicação consiste em um sistemas que gerência cadastros de produtos, ordens de pedidos e o gerênciamento de entregas em domicílio.  
</p>

## Modelo Conceitual
![modelo-conceitual](https://github.com/renatof4rias/spring-project-delivery/assets/123312837/005911ef-8f9f-44bb-b43c-601780219b68)

<h1 align="center"> Tecnologias Utilizadas </h1>

## Back end

- Java 
- Spring Boot
- JPA / Hibernate
- Maven
- MVC
<h1 align="center"> Como execurtar o projeto </h1>

## Back end  
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone git@github.com:renatof4rias/spring-project-delivery

# entrar na pasta do projeto back end
cd delivery

# executar o projeto
./mvnw spring-boot:run
```

<h1 align="center"> Como testar o projeto </h1>

Pré-requisitos: Postman

```bash
#END POINTS
[GET] /products #Busca todos os produtos registrados em ordem alfabética.
[GET] /orders #Busca todos os pedidos registrados com status PENDING.
[PUT] /orders/{id}/delivered #Atualiza o status do pedido em DELIVERED.
[POST] /orders #Cadastra um pedido novo ¹.
```
Observações 
```bash
#Método [POST] /orders necesita de um "body" como parâmetro.
Exemplo : 
{
        "address": " Local de Entrega, Numero da Casa",
        "latitude": -23.56168,
        "longitude": -46.656139,
        "total": null,
        "products": [
            {
                "id": 2
            },
            {
                "id": 5
            }
        ]
}

```
# Autor
Renato Gonçalves Farias

https://www.linkedin.com/in/renatof4rias/

renatof4rias@gmail.com
