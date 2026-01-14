# 🏋️ Academia Alunos API

API REST desenvolvida em **Java 17 com Spring Boot** para o **cadastro e gerenciamento de alunos de uma academia**.  
O projeto foi criado com foco em boas práticas de desenvolvimento backend, organização de código e documentação clara.

---

## 📌 Sobre o Projeto

A **Academia Alunos API** permite gerenciar alunos de uma academia por meio de endpoints RESTful, possibilitando o cadastro, a listagem e a busca de alunos por identificador único.

Este projeto foi desenvolvido para consolidar conhecimentos em desenvolvimento backend com Java, aplicando conceitos como arquitetura em camadas, validação de dados, persistência com JPA e documentação automática da API.

---

## 🚀 Funcionalidades

- Cadastro de alunos
- Listagem de alunos
- Busca de aluno por ID
- Validação de dados de entrada
- Persistência de dados com JPA
- Documentação interativa com Swagger (OpenAPI)

---

## 🛠️ Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- Hibernate  
- SQLite  
- Swagger / OpenAPI  
- Maven  
- Insomnia  

---

## 📂 Estrutura do Projeto
src/main/java/org/example
├── Application.java
├── controller
│ └── AlunoController.java
├── dto
│ └── AlunoRequestDTO.java
├── entity
│ └── Aluno.java
├── repository
│ └── AlunoRepository.java
├── validation
│ └── AlunoValidator.java
└── Objetivo.java



---

## 🔗 Endpoints Disponíveis

| Método | Endpoint       | Descrição              |
|------|----------------|------------------------|
| GET  | `/alunos`      | Lista todos os alunos  |
| POST | `/alunos`      | Cadastra um aluno      |
| GET  | `/alunos/{id}` | Busca aluno por ID     |

---

## 📦 Exemplo de Requisição

### POST `/alunos`

```json
{
  "nome": "João Silva",
  "idade": 25,
  "objetivo": "HIPERTROFIA"
}
```
📚 Documentação Swagger

A documentação da API é gerada automaticamente com Swagger (OpenAPI).

Após rodar o projeto localmente, acesse:
http://localhost:8080/swagger-ui/index.html
🧪 Testes

Os endpoints foram testados manualmente utilizando a ferramenta Insomnia.

▶️ Como Executar o Projeto
Pré-requisitos

Java 17

Maven

Executar

git clone https://github.com/RaissaMatosDev/academia-alunos-api
cd academia-alunos-api
mvn spring-boot:run

🧠 Conceitos Aplicados

Arquitetura em camadas

Separação de responsabilidades

APIs RESTful

DTOs

Validação de dados

JPA e Hibernate

Documentação com Swagger

Testes com Insomnia

🎯 Objetivo

Projeto desenvolvido como parte do meu portfólio pessoal, com foco em oportunidades como Desenvolvedora Backend Java Júnior.

👩‍💻 Autora

Raíssa Matos
Desenvolvedora Backend Java Júnior

LinkedIn: https://linkedin.com/in/raissamatosdev

GitHub: https://github.com/RaissaMatosDev
