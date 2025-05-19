# Gestão de Estoque API

Este projeto é uma API para gerenciamento de estoque, permitindo o controle de produtos, categorias, movimentações e usuários.

## Linguagem e Frameworks

- **Linguagem:** Java
- **Framework principal:** Spring Boot
- **Banco de Dados:** Pode utilizar PostgreSQL, MySQL ou outro compatível com Spring Data JPA
- **Outros:** Spring Security, Spring Data JPA, Lombok, dotenv (para variáveis de ambiente)


## Estrutura das Pastas

- `src/main/java/com/seuusuario/gestaoestoque/`
    - `controller/` — Controladores REST para produtos, categorias, movimentações e usuários
    - `dto/` — Objetos de transferência de dados (DTOs)
    - `exception/` — Tratamento de exceções personalizadas
    - `model/` — Entidades JPA do domínio
    - `repository/` — Interfaces do Spring Data JPA
    - `security/` — Configurações e classes de segurança (JWT, filtros, etc)
    - `service/` — Serviços de negócio
    - `util/` — Utilitários e helpers
    - `GestaoEstoqueApiApplication.java` — Classe principal da aplicação

- `src/main/resources/`
    - `application.properties` — Configurações da aplicação
    - `db/migration/` — Scripts de migração do banco (Flyway ou Liquibase, se utilizado)

- `src/test/java/com/seuusuario/gestaoestoque/`
    - Testes unitários e de integração


## Instalação

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/gestao-estoque-api.git
    cd gestao-estoque-api
    ```

2. Importe o projeto em sua IDE Java (IntelliJ, Eclipse, VS Code, etc).

3. Configure as variáveis de ambiente:
    - Crie um arquivo `.env` ou configure o `application.properties`/`application.yml` com as informações do banco de dados e outras configurações necessárias.

4. Execute a aplicação:
    - Via IDE: Rode a classe principal (`@SpringBootApplication`)
    - Ou via terminal:
    ```bash
    ./mvnw spring-boot:run
    ```
    ou
    ```bash
    ./gradlew bootRun
    ```

## Funcionalidades

- Cadastro, edição e remoção de produtos
- Gerenciamento de categorias
- Controle de movimentações de estoque (entrada/saída)
- Autenticação de usuários

## Contribuição

Pull requests são bem-vindos! Abra uma issue para discutir melhorias ou reportar bugs.
