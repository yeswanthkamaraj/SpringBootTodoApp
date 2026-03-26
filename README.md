# 🔐 Secure Todo Application (Spring Boot + JWT)

A secure and scalable **Todo Management Application** built using **Spring Boot** with **JWT Authentication**.
This project demonstrates how to build **secure REST APIs** with role-based access and token-based authentication.

---

## 📌 Overview

This application allows users to manage their tasks securely by authenticating via **JWT (JSON Web Token)**.

Only authenticated users can perform CRUD operations, ensuring data security and proper access control.

---

## 🛠️ Tech Stack

* **Java**
* **Spring Boot**
* **Spring Security**
* **JWT (JSON Web Token)**
* **Spring Data JPA**
* **MySQL / H2 Database**
* **Maven**

---

## 🔐 Security Features

✔️ User Authentication using JWT
✔️ Stateless session management
✔️ Secure REST APIs
✔️ Token-based authorization
✔️ Password encryption (BCrypt)

---

## ⚙️ Features

✔️ User Registration & Login
✔️ Generate JWT Token on login
✔️ Add, View, Update, Delete Todos
✔️ Secure endpoints with authentication
✔️ Clean layered architecture

---

## 📂 Project Structure

```id="o0hgn2"
todo-jwt-app/
│
├── controller/
├── service/
├── repository/
├── entity/
├── security/
│   ├── JwtFilter
│   ├── JwtUtil
│   └── SecurityConfig
│
└── pom.xml
```

---

## 🔗 API Endpoints

### 🔑 Authentication

| Method | Endpoint         | Description       |
| ------ | ---------------- | ----------------- |
| POST   | `/auth/register` | Register new user |
| POST   | `/auth/login`    | Login & get JWT   |

---

### 📝 Todo APIs (Protected)

| Method | Endpoint          | Description   |
| ------ | ----------------- | ------------- |
| GET    | `/api/todos`      | Get all todos |
| POST   | `/api/todos`      | Create todo   |
| PUT    | `/api/todos/{id}` | Update todo   |
| DELETE | `/api/todos/{id}` | Delete todo   |

---

## 🔑 JWT Authentication Flow

1. User logs in with credentials
2. Server validates and returns JWT token
3. Client stores token
4. Token is sent in header for every request:

```id="cdbvwx"
Authorization: Bearer <your_token>
```

5. Backend validates token before processing request

---

## ▶️ How to Run

### 1️⃣ Clone the repository

```id="q9um83"
git clone <your-repo-link>
```

### 2️⃣ Configure Database

Update `application.properties`:

```properties id="6m17b3"
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=your_password
```

### 3️⃣ Run the Application

```id="qscm8j"
mvn spring-boot:run
```

---

## 🌐 Test Using Postman

### Login Request:

```json id="k2vx9g"
{
  "username": "user",
  "password": "password"
}
```

### Use Token:

```id="8o9rzg"
Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...
```

---

## 💡 Key Learnings

* Implemented **JWT-based authentication**
* Secured REST APIs using **Spring Security**
* Managed **stateless sessions**
* Handled authentication and authorization
* Built production-ready backend architecture

---

## 🚀 Future Enhancements

* 🔐 Role-based authorization (
