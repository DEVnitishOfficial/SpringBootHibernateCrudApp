

---

# 📚 Online Workshop Registration and Fee Payment System

This is a **Spring Boot** and **Hibernate** based **CRUD application** to manage online registration and fee payment for a "Web Technologies" Workshop.  
It also includes **basic security management** using Spring Security (HTTP Basic Auth).

---

# ✨ Features

- ✅ Register participants for the workshop
- ✅ View all registered participants
- ✅ Update participant details
- ✅ Delete participant registration
- ✅ Process fee payments
- ✅ Basic authentication security using username and password

---

# 🛠️ Tech Stack

- Java 21+ (or 17+ minimum)
- Spring Boot 3.x
- Spring Data JPA (Hibernate)
- MySQL Database
- Spring Security
- Maven
- Postman for API Testing

---

# 📂 Project Structure

```plaintext
src/main/java/com/example/registration/
├── controller/
│    └── RegistrationController.java
├── model/
│    ├── User.java
│    └── Payment.java
├── repository/
│    ├── UserRepository.java
│    └── PaymentRepository.java
├── config/
│      └── SecurityConfig.java
│── RegistrationApplication.java
```

---

# ⚙️ Installation and Setup

### 1. Clone the project

```bash
git clone https://github.com/DEVnitishOfficial/SpringBootHibernateCrudApp.git
```

Or download the zip and extract.

---

### 2. Set up MySQL Database

- Open your MySQL client (e.g., MySQL Workbench or CLI)
- Create a new database:

```sql
CREATE DATABASE workshopdb;
```

---

### 3. Configure `application.properties`

In `src/main/resources/application.properties`, set your database username and password:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/workshopdb
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080

# Spring Security Default User
spring.security.user.name=admin
spring.security.user.password=admin123
```

---

### 4. Build and Run the Project

In VS Code terminal or CMD, navigate to project folder and run:

```bash
./mvnw spring-boot:run
```
(If using Windows, run `mvnw.cmd spring-boot:run`)

Or simply:

```bash
mvn spring-boot:run
```

The server will start at:

```
http://localhost:8080
```

---

# 🔥 API Endpoints

All APIs are secured using Basic Authentication.  
Use the following credentials:

| Username | Password |
|:---------|:---------|
| admin    | admin123 |

Use **Postman** or any REST Client to call the APIs.

---

### ➡️ Register a New User

- **URL:** `POST /api/register`
- **Body (JSON):**

```json
{
    "name": "John Doe",
    "email": "john@example.com",
    "mobile": "9876543210",
    "course": "Web Technologies"
}
```

---

### ➡️ View All Users

- **URL:** `GET /api/users`

---

### ➡️ Update User Details

- **URL:** `PUT /api/update/{userId}`
- **Body (JSON):**

```json
{
    "name": "Updated Name",
    "email": "updated@example.com",
    "mobile": "9998887776",
    "course": "Advanced Web Tech"
}
```

---

### ➡️ Delete User

- **URL:** `DELETE /api/delete/{userId}`

---

### ➡️ Fee Payment for a User

- **URL:** `POST /api/pay-fee/{userId}`
- **Body (JSON):**

```json
{
    "paymentMode": "Online",
    "amount": 5000
}
```


# 📌 Important Notes

- If you open `http://localhost:8080/` directly in browser → You may see Whitelabel Error Page. It is expected because **there are no frontend pages**. Only backend REST APIs are built.
- Always test using Postman or similar REST clients.
- Database tables `user` and `payment` are auto-created via Hibernate.

---













what is Spring Boot ?

```
Spring Boot is a framework that simplifies the setup and configuration of Java-based applications, especially for building microservices and web applications. It reduces boilerplate code and provides embedded servers, auto-configuration, and other features for rapid development.
```

what is Hibernate?

```
Hibernate is an Object-Relational Mapping (ORM) framework for Java that simplifies database interactions. It maps Java objects to database tables, allowing developers to work with data using object-oriented concepts instead of writing raw SQL queries. Hibernate handles database operations such as persisting, retrieving, updating, and deleting data.


Spring Boot and Hibernate are often used together to build database-driven applications. Spring Boot provides the infrastructure and conventions, while Hibernate handles the interaction with the database. Spring Boot simplifies the configuration of Hibernate, making it easier to integrate into applications. 
```




























what is MAVEN?

```
Maven is a project management and build automation tool, primarily used in the Java ecosystem. It simplifies the build process by automating tasks like dependency management, compilation, testing, and packaging. It uses a "Project Object Model" (POM) to define project structure and dependencies, making it easy to manage complex projects
```

what is JAR files?

```
JAR(Java archive files) is a group of .class(dot class) files.

Purpose:
JAR files are used to package and distribute Java applications, libraries, or reusable components. 

Content:
They contain Java class files, resources, and metadata needed for the application to run. 

Execution:
JAR files can be executed directly by the Java Virtual Machine (JVM) or used as libraries by other applications.

Example:
A JAR file could contain a pre-compiled Java library that an application uses

```

what is WAR files?

```
WAR(web archieve) represents the complete web application which contain servlets, JSP pages, HTML files, CSS, JavaScript, and other static resources.

If there are 10 WAR files it means there are 10 web applications
```

what is EAR files?

```
EAR(Enterprise Archive)
EAR files are used for packaging enterprise-level applications that utilize Java EE features.

They can contain multiple WAR files, JAR files, and enterprise bean modules.

EAR files are deployed to Java EE application servers, which manage the components within them.

EAR is a higher-level archive for enterprise-level applications, often containing both web and non-web components. 
```