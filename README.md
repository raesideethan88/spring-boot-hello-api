# Spring Boot Task API

An API built with Spring Boot and PostgreSQL for managing tasks.

## 🚀 Setup & Installation

1. **Database Setup**: 
   * Download, install, and open pgAdmin4**.
   * Create a new database named `taskdb`.
   
2. **Configuration**:
   * Open `src/main/resources/application.properties`.
   * Update `spring.datasource.password` with your own PostgreSQL password.

3. **Run the App**:
   * Open the terminal in VS Code.
   * Run: `mvn spring-boot:run` or the Application.java file, whichever works for you.

## 🛠 API Endpoints

### 1. Add a Task
**URL:** `GET /tasks/add?desc=YourTaskDescription`  
**Example:** `http://localhost:8080/tasks/add?desc=FinishThisTask`

### 2. View All Tasks
**URL:** `GET /tasks`  
**Example:** `http://localhost:8080/tasks`

## 🗄 Database Structure
The app uses **Spring Data JPA**. The `tasks` table is automatically generated in PostgreSQL upon startup.