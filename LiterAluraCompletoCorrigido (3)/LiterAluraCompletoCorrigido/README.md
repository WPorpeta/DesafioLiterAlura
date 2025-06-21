# LiterAlura 📚

Projeto desenvolvido por [Wellington Porpeta](https://github.com/WPorpeta) como parte dos estudos de Java e Spring Boot da Alura, utilizando dados da API Gutendex para exibir e persistir informações de livros e autores.

## ✨ Tecnologias Utilizadas

- Java 17+
- Spring Boot 3.2.3
- Spring Data JPA
- PostgreSQL
- Jackson (ObjectMapper)
- Maven

## 🚀 Funcionalidades

- Buscar livros por título (via API Gutendex)
- Listar livros salvos no banco de dados
- Listar autores
- Persistência automática de livros e autores

## 📦 Como executar o projeto

1. Clone o repositório:
```bash
git clone https://github.com/WPorpeta/LiterAlura.git
```

2. Acesse a pasta do projeto:
```bash
cd LiterAlura
```

3. Configure seu banco PostgreSQL com:
```sql
CREATE DATABASE literalura;
```

4. Atualize o `application.properties` com seu `username` e `password`.

5. Execute o projeto:
```bash
./mvnw spring-boot:run
```

## 🗂 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── br/com/literalura/
│   │       ├── client/
│   │       ├── http/
│   │       ├── model/
│   │       ├── record/
│   │       ├── repository/
│   │       └── service/
│   └── resources/
└── pom.xml
```

## 🧠 Aprendizados

- Utilização da API Gutendex com `HttpClient`
- Serialização e desserialização com `ObjectMapper`
- Padrão REST e boas práticas com Spring Boot
- Integração com banco de dados relacional

---

Feito por [Wellington Porpeta](https://github.com/WPorpeta)
