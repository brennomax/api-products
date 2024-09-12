# API de Produtos

Esta é uma API RESTful desenvolvida em Spring Boot para gerenciamento de produtos. A API permite a criação, consulta, atualização e exclusão de informações de produtos, como nome e valor. O projeto utiliza PostgreSQL como banco de dados.

## Funcionalidades

- Criar um novo produto
- Listar todos os produtos
- Consultar um produto específico por ID
- Atualizar as informações de um produto
- Excluir um produto

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Hibernate**
- **PostgreSQL**
- **Jakarta Validation**
- **Maven**

## Como Executar o Projeto

### Pré-requisitos

- **JDK 17+**: Certifique-se de que o Java Development Kit (JDK) 17 ou superior esteja instalado.
- **Maven**: Ferramenta de build utilizada no projeto.
- **PostgreSQL**: Banco de dados utilizado, com uma instância local rodando na porta `5432` e um banco chamado `product-api`.
  
### Configuração do Banco de Dados

Certifique-se de que as configurações do banco de dados no arquivo `application.properties` estejam corretas:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/product-api
spring.datasource.username=postgres
spring.datasource.password=senha_do_postgres
