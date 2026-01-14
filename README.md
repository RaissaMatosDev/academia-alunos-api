# 🏋️ Academia Alunos API

API REST desenvolvida em Java para **cadastro e gerenciamento de alunos de uma academia**, permitindo criar, listar e buscar alunos por ID.  
O projeto foi desenvolvido com foco em boas práticas, organização de código e documentação clara.

---


## 🚀 Funcionalidades

- ✅ Cadastro de alunos
- ✅ Listagem de todos os alunos
- ✅ Busca de aluno por ID
- ✅ Validação de dados de entrada
- ✅ Documentação automática com Swagger (OpenAPI)

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **SQLite**
- **Swagger / OpenAPI**
- **Maven**

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


## 🔗 Endpoints Disponíveis

| Método | Endpoint            | Descrição                     |
|------|---------------------|-------------------------------|
| GET  | `/alunos`           | Lista todos os alunos         |
| POST | `/alunos`           | Cadastra um novo aluno        |
| GET  | `/alunos/{id}`      | Busca aluno por ID            |


## 📦 Exemplo de Requisição (POST /alunos)


{
  "nome": "João Silva",
  "idade": 22,
  "objetivo": "HIPERTROFIA"
}

##📚 Documentação Swagger
A API possui documentação interativa gerada automaticamente com Swagger.

Após rodar o projeto localmente, acesse:
http://localhost:8080/swagger-ui/index.html


##🧠 Conceitos Aplicados
Arquitetura em camadas (Controller, DTO, Repository)

Validação de dados

Boas práticas REST

Persistência com JPA

Documentação de API

##👩‍💻 Autora
Projeto desenvolvido por Raíssa Matos
📌 Desenvolvedora Backend Java Júnior

LinkedIn: https://linkedin.com/in/raissamatosdev

GitHub: https://github.com/RaissaMatosDev

📌 Observações
Este projeto faz parte do meu portfólio de estudos e tem como objetivo demonstrar conhecimentos práticos em desenvolvimento backend com Java e Spring Boot.

<img width="488" height="848" alt="Captura de tela 2026-01-13 222501" src="https://github.com/user-attachments/assets/6db8fb51-b42a-48ff-9d19-1c3bbcde7dbc" />
<img width="1901" height="874" alt="Captura de tela 2026-01-13 220610" src="https://github.com/user-attachments/assets/d662cfdf-c2bf-49a3-a0fd-550a982e5f3a" />


