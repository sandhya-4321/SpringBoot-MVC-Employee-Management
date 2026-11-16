
# Spring Boot MVC - Employee Management System

## Project Overview

This project is an Employee Management System developed using Spring Boot MVC. It allows users to manage employee information through CRUD operations.

The application follows MVC architecture and uses JSP for the user interface and Spring Data JPA for database operations.

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- JSP
- JSTL
- HTML
- Maven
- Apache Tomcat
- Spring Tool Suite (STS)

## Features

- Add New Employee
- View All Employees
- View Employee Details
- Update Employee Information
- Delete Employee Details
- Store Employee Data in Database

## Project Architecture

The project follows MVC architecture.

### 1. Model
- Employee.java
- Represents employee details.

### 2. Controller
- EmployeeController.java
- Handles HTTP requests and responses.

### 3. Service
- EmployeeService.java
- Contains business logic.
- Performs employee CRUD operations.

### 4. Repository
- EmployeeRepo.java
- Handles database operations using Spring Data JPA.

### 5. View
JSP pages are used to display employee information.

- addEmployee.jsp
- employeelist.jsp
- updateEmployee.jsp

## Project Structure

    SpringBootMvc-1
    |
    ├── src/main/java
    |    ├── com.SpringBootMvc.controller
    |    |       └── EmployeeController.java
    |    |
    |    ├── com.SpringBootMvc.model
    |    |       └── Employee.java
    |    |
    |    ├── com.SpringBootMvc.repo
    |    |       └── EmployeeRepo.java
    |    |
    |    └── com.SpringBootMvc.service
    |            └── EmployeeService.java
    |
    ├── src/main/webapp
    |    └── WEB-INF
    |         └── views
    |              ├── addEmployee.jsp
    |              ├── employeelist.jsp
    |              └── updateEmployee.jsp
    |
    └── pom.xml

## CRUD Operations

| Operation | Description |
|-----------|-------------|
| Create | Add new employee |
| Read | Display employee records |
| Update | Modify employee details |
| Delete | Remove employee records |

## How to Run the Project

1. Clone the repository.
2. Import the project into Spring Tool Suite.
3. Configure the MySQL database.
4. Update database credentials in application
