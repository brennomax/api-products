# API de Produtos

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/postgreSQL-%23336791.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-%23Clojure.svg?style=for-the-badge&logo=swagger&logoColor=white)


Esta é uma API RESTful desenvolvida em Spring Boot para gerenciamento de produtos. A API permite a criação, consulta, atualização e exclusão de informações de produtos, como nome e valor. O projeto utiliza PostgreSQL como banco de dados.

## Funcionalidades

- Criar um novo produto
- Listar todos os produtos
- Consultar um produto específico por ID
- Atualizar as informações de um produto
- Excluir um produto

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3.3**
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
```

**Obs:** Substitua `senha_do_postgres` pela senha do seu PostgreSQL.

### Rodando a Aplicação

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/product-api.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd product-api
   ```
   
3. Compile o projeto com Maven:
   ```bash
   mvn clean install
   ```

Ou compile o projeto diretamente pela sua IDE (como IntelliJ IDEA ou Eclipse) utilizando as opções de Build ou Rebuild Project.

4. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

Ou execute a aplicação diretamente pela sua IDE clicando com o botão direito no arquivo ProductApiApplication.java e selecionando a opção Run 'ProductApiApplication'.

A API estará disponível em `http://localhost:8080`.

### Usando a API via Postman

Você pode testar os endpoints da API utilizando o **Postman**. Para isso, siga os passos abaixo:

1. Abra o **Postman** e crie uma nova requisição.
2. Insira a URL base da API: `http://localhost:8080`.
3. Utilize os endpoints mencionados na seção [Endpoints](#endpoints) para realizar as requisições `GET`, `POST`, `PUT` ou `DELETE`.
   - Por exemplo, para listar todos os produtos, faça uma requisição `GET` para `http://localhost:8080/products`.
4. Para requisições `POST` e `PUT`, lembre-se de enviar os dados no corpo da requisição utilizando o formato JSON.

### Alternativa: Usar o Swagger para Documentação e Testes

Se preferir uma forma mais simples de testar a API e ver a documentação de forma interativa, você pode integrar o **Swagger** ao projeto. Siga as etapas abaixo para adicionar o Swagger:

1. Adicione as dependências do Swagger no seu arquivo `pom.xml`:
   ```xml
   <dependency>
       <groupId>org.springdoc</groupId>
       <artifactId>springdoc-openapi-ui</artifactId>
       <version>coloque aqui a versão desejada</version>
   </dependency>
   ```
2. Após rodar a aplicação novamente, acesse a documentação interativa gerada pelo Swagger em `http://localhost:8080/swagger-ui.html`.
Com o Swagger, você poderá visualizar todos os endpoints da API e testá-los diretamente através da interface gerada.


Agora você tem duas opções: usar o **Postman** para testar manualmente ou integrar o **Swagger** para documentação e testes mais fáceis.


### Endpoints

| Método HTTP | Endpoint          | Descrição                          | Status HTTP        |
|-------------|-------------------|------------------------------------|--------------------|
| `POST`      | `/products`        | Cria um novo produto               | `201 CREATED`      |
| `GET`       | `/products`        | Lista todos os produtos            | `200 OK` ou `404 NOT FOUND` |
| `GET`       | `/products/{id}`   | Consulta um produto por ID         | `200 OK` ou `404 NOT FOUND` |
| `PUT`       | `/products/{id}`   | Atualiza os dados de um produto    | `200 OK` ou `404 NOT FOUND` |
| `DELETE`    | `/products/{id}`   | Exclui um produto por ID           | `200 OK` ou `404 NOT FOUND` |

### Boas Práticas Seguidas

- **DTO (Data Transfer Object)**: Utilizado o padrão DTO para transferir dados entre a camada de serviço e a camada de controle, isolando a lógica de negócios dos dados que são transferidos entre o cliente e o servidor.
- **Validação**: Utilização de anotações do Jakarta Validation (`@NotBlank`, `@NotNull`) para garantir a integridade dos dados recebidos pela API.
- **Tratamento de Erros**: Retorno adequado de status HTTP, como `404 NOT FOUND` para entidades não encontradas, garantindo que o cliente receba respostas claras e precisas.
- **Uso de UUID**: O identificador de cada produto é um UUID, garantindo unicidade e escalabilidade no gerenciamento de produtos.

### Melhorias Futuras

- **Autenticação e Autorização**: Implementar autenticação (por exemplo, com JWT) e autorização para proteger a API contra acessos não autorizados.
- **Paginação e Ordenação**: Adicionar funcionalidades de paginação e ordenação para otimizar a listagem de produtos, especialmente em grandes volumes de dados.
- **Testes Unitários e de Integração**: Implementar testes unitários e de integração utilizando **JUnit** e **MockMVC** para garantir a qualidade e a integridade do código.
- **Documentação Automatizada**: Integração com **Swagger** para gerar uma documentação interativa e facilitar o uso da API por outros desenvolvedores.

---

Desenvolvido com :heart: por [Breno Max](https://github.com/brennomax).
