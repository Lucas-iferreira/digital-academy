# Academia API 🏋️‍♂️
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Lucas-iferreira/workshop-springboot3-jpa/blob/main/LICENSE) 

# Sobre o projeto

Uma API RESTful desenvolvida para gerenciar alunos e suas avaliações físicas em uma academia. Este projeto foi criado com **Java Spring Boot**, utilizando ferramentas modernas para garantir uma implementação robusta e eficiente.

---

## 📝 Funcionalidades

- **Cadastro de Alunos**: Registre alunos com informações como nome, CPF e data de nascimento.
- **Cadastro de Avaliações Físicas**: Adicione avaliações físicas vinculadas a um aluno.
- **Listagem de Alunos e Avaliações**: Consulte alunos cadastrados com suas respectivas avaliações físicas.
- **Criação de Matricula**: crie a matrícula do aluno e vincule com Aluno.
- **Validação de Dados**: Regras de validação para garantir a consistência das informações.
- **Persistência**: Integração com banco de dados PostgreSQL.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Maven**: Gerenciador de dependências.
- **Spring Boot**:
  - **Spring Web**: Para construção da API RESTful.
  - **Spring Data JPA**: Para manipulação de dados com abstração do banco de dados.
- **PostgreSQL Driver**: Para conexão com o banco de dados PostgreSQL.
- **Hibernate Validator**: Para validação de dados.
- **Lombok**: Redução de boilerplate no código.
- **Postman**: Para testes e validação da API.

---

## 🚀 Como Executar

1. **Clone o Repositório**:
   ```bash
   git clone https://github.com/seuusuario/academia-api.git
   cd academia-api
   ```
   
2. **Configure o Banco de Dados**:
   - Certifique-se de que o PostgreSQL está instalado e configurado.
   - Crie um banco de dados chamado `academia_db`.
   - Atualize o arquivo `application.properties` com suas credenciais:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/academia?useTimezone=true&serverTimezone=UTC&useLegacyDate
     spring.datasource.username=postgres
     spring.datasource.password=1234
     spring.jpa.show-sql=true
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.properties.hibernate.format_sql=true
     logging.level.or.hibernate.type=trace

     ```

3. **Compile e Execute o Projeto**:
   - Compile o projeto com Maven:
     ```bash
     mvn clean install
     ```
   - Execute a aplicação:
     ```bash
     mvn spring-boot:run
     ```

4. **Teste a API**:
   - Utilize ferramentas como o Postman para testar os endpoints da API.
   - Exemplo de URL base: [http://localhost:8080](http://localhost:8080)

---
## 🧪 Testes com Postman

Os testes da API podem ser realizados com o **Postman**.  

## 🌟 Contribuições

Contribuições são sempre bem-vindas! Sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.


---

## 🧑‍💻 Autor

Desenvolvido por **Lucas** junto a plataforma de cursos -> Digital innovation One.  
Conecte-se comigo no [LinkedIn](https://www.linkedin.com/in/lucas-iferreira/).  



---
