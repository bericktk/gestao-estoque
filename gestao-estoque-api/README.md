# Gestão de Estoque API

Este projeto é uma API para gerenciamento de estoque, permitindo o controle de produtos, categorias, movimentações e usuários.

## Linguagem e Frameworks

- **Linguagem:** Java
- **Framework principal:** Spring Boot
- **Banco de Dados:** Pode utilizar PostgreSQL, MySQL ou outro compatível com Spring Data JPA
- **Outros:** Spring Security, Spring Data JPA, Lombok, dotenv (para variáveis de ambiente)

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

## Estrutura do Projeto

- `src/main/java/`
  - `controller/` — Lógica das rotas e regras de negócio
  - `model/` — Modelos das entidades do banco de dados
  - `repository/` — Interfaces de acesso ao banco de dados
  - `service/` — Lógica de negócio
  - `config/` — Configurações gerais (ex: segurança, banco de dados)
  - `GestaoEstoqueApiApplication.java` — Inicialização do Spring Boot

## Funcionalidades

- Cadastro, edição e remoção de produtos
- Gerenciamento de categorias
- Controle de movimentações de estoque (entrada/saída)
- Autenticação de usuários

## Contribuição

Pull requests são bem-vindos! Abra uma issue para discutir melhorias ou reportar bugs.

---

> **Nota:** Altere as instruções conforme as tecnologias e dependências reais do seu projeto.

