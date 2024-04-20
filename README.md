# TransactSmart API

## Sobre o Projeto

A TransactSmart API é uma aplicação RESTful criada com o intuito de aplicar e demonstrar práticas modernas de desenvolvimento de software em Java. Este projeto é um esforço pessoal de Francismario Coelho e Silva, focado no estudo e na implementação de conceitos como arquitetura de software, clean code e integração contínua.

## Objetivos Educacionais

Este projeto serve como um campo de prática para os seguintes conceitos:

- **Arquitetura de Software:** Aplicando as melhores práticas e padrões de arquitetura para criar uma base de código escalável e manutenível.
- **Clean Code:** Escrevendo código legível e conciso que é fácil de ler e manter.
- **Integração Contínua (CI):** Utilizando o GitHub Actions para automatizar o processo de build e teste, garantindo que cada commit seja verificado de forma consistente.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 2.5.0
- Docker
- PostgreSQL
- GitHub Actions

## Como Executar

### Pré-requisitos

Antes de iniciar, certifique-se de ter o Docker, Java 17 e Maven instalados em seu ambiente de desenvolvimento.

### Banco de Dados com Docker

Inicie uma instância do PostgreSQL:


```bash
docker run --name transactsmart-db -p 5432:5432 -e POSTGRES_USER=dbuser -e POSTGRES_PASSWORD=dbpass -e POSTGRES_DB=transactsmart -d postgres
```

### Estrutura do Projeto

O projeto segue a arquitetura hexagonal, organizada da seguinte maneira:
 ```plaintext
src/
└── main/
    └── java/
        └── com/
            └── devportfolio/
                └── banking/
                    └── bankingapi/
                        ├── application/
                        │   ├── core/
                        │   └── outside/
                        ├── domain/
                        │   ├── model/
                        │   ├── service/
                        │   ├── shared/
                        │   └── vo/
                        ├── infrastructure/
                        │   └── repository/
                        └── presentation/
                            └── controller/

                           
