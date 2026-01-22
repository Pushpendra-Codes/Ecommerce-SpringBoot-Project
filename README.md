# E-Commerce Application

A Fullstack backend-focused e-commerce application developed using Java and Spring Boot.
The project provides REST APIs for managing products with full CRUD operations
and advanced search functionality using PostgreSQL.



## Tech Stack

### Backend
- Java
- Spring Boot
- Spring Web (REST APIs)
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven

### Frontend
- React
- Axios
- React Router
- Bootstrap / Tailwind 

### Database
- PostgreSQL (You can use H2 in memory also the configurations are commented)

## Backend Features

- RESTful APIs built using Spring Boot
- Product Management APIs (Create, Update, Delete, Fetch)
- Keyword-based product search (search by name, description, category,etc.)
- PostgreSQL database integration
- Spring Data JPA for ORM and database operations
- Exception handling with global error responses



## Backend Architecture

- Controller Layer – Handles REST API requests
- Service Layer – Contains business logic
- Repository Layer – Handles database operations using JPA
- Entity Layer – Database entity mappings


## Database

- Database: PostgreSQL
- ORM: Hibernate (via Spring Data JPA)
- Entity: Product

## Setup Instructions

### Backend Setup
1. Clone the repository
2. Create PostgreSQL database ecommerce_db
3. Update database credentials in `application.properties`
4. Run the Spring Boot application

### Frontend
1. Navigate to frontend folder
2. Run `npm install`
3. Run `npm start`

## Author
Pushpendra Patidar  
GitHub: https://github.com/Pushpendra-Codes