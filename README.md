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

yaml
Copiar código

---

## 🔗 Endpoints Disponíveis

| Método | Endpoint            | Descrição                     |
|------|---------------------|-------------------------------|
| GET  | `/alunos`           | Lista todos os alunos         |
| POST | `/alunos`           | Cadastra um novo aluno        |
| GET  | `/alunos/{id}`      | Busca aluno por ID            |

---

## 📦 Exemplo de Requisição (POST /alunos)

```json
{
  "nome": "João Silva",
  "idade": 22,
  "objetivo": "HIPERTROFIA"
}
📚 Documentação Swagger
A API possui documentação interativa gerada automaticamente com Swagger.

Após rodar o projeto localmente, acesse:

bash
Copiar código
http://localhost:8080/swagger-ui/index.html
▶️ Como Executar o Projeto
Pré-requisitos
Java 17

Maven

Passos
bash
Copiar código
git clone https://github.com/SEU_USUARIO/student-management-api.git
cd student-management-api
mvn spring-boot:run
A aplicação estará disponível em:

arduino
Copiar código
http://localhost:8080
🧠 Conceitos Aplicados
Arquitetura em camadas (Controller, DTO, Repository)

Validação de dados

Boas práticas REST

Persistência com JPA

Documentação de API

👩‍💻 Autora
Projeto desenvolvido por Raíssa Matos
📌 Desenvolvedora Backend Java Júnior

LinkedIn: https://linkedin.com/in/raissamatosdev

GitHub: https://github.com/RaissaMatosDev

📌 Observações
Este projeto faz parte do meu portfólio de estudos e tem como objetivo demonstrar conhecimentos práticos em desenvolvimento backend com Java e Spring Boot.


