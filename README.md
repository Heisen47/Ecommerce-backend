# E-commerce Backend

## Overview
This project is an e-commerce backend built using Java Spring Boot. It leverages microservices architecture to manage various aspects of the e-commerce platform such as user authentication, product management, order processing, and payment handling. The application uses Hibernate for ORM, Spring MVC for handling web requests, Spring Security with JWT for authentication and authorization.

## Technologies Used
- **Java Spring Boot**: Framework for building microservices.
- **Microservices**: Architecture to manage different services independently.
- **Hibernate**: ORM tool for database interactions.
- **Spring MVC**: Framework for building web applications.
- **Spring Security**: Framework for securing the application.
- **JWT (JSON Web Token)**: Used for user authentication and authorization.

## Features
- User authentication and authorization using JWT.
- Product management (CRUD operations).
- Order processing and management.
- Payment handling.
- Secure endpoints with Spring Security.
- Integration with a relational database using Hibernate.

## Microservices
1. **User Service**: Manages user registration, login, and profile.
2. **Product Service**: Manages product catalog, including adding, updating, and deleting products.
3. **Order Service**: Handles order creation, updating, and tracking.
4. **Payment Service**: Manages payment processing and integration with payment gateways.

## Prerequisites
- Java 11 or higher
- Maven
- MySQL or any other relational database
- IDE (IntelliJ, Eclipse, etc.)

## Getting Started
### Clone the Repository
```bash
git clone https://github.com/your-username/ecommerce-backend.git
cd ecommerce-backend
```

## Database Setup
### Create a database named ecommerce_db.
Update the application.properties file in each microservice to configure the database connection.


## Accessing the Application
The application will be accessible at http://localhost:8080.
Swagger documentation is available at http://localhost:8080/swagger-ui.html.


### Postman API Collection

Drag and drop the file Ecommerce Api.postman_collection to postman to get all the API collections for testing

# GET
- http://localhost:8080/api/users/profile
- http://localhost:8080/api/products
- http://localhost:8080/api/products/1
- http://localhost:8080/api/cart/
- http://localhost:8080/api/payments/pay_LodIH9EjCig5re
- http://localhost:8080/api/orders/user
- http://localhost:8080/api/orders/651943b7ceba9c53baa42bfa
- http://localhost:8080/api/admin/products/creates
- http://localhost:8080/api/users

# POST
- http://localhost:8080/auth/signup
- http://localhost:8080/auth/signin
- http://localhost:8080/api/admin/products/
- http://localhost:8080/api/orders/
- http://localhost:8080/api/payments/651943b7ceba9c53baa42bfa
- https://ecommerce-server-production-7ba8.up.railway.app/api/admin/products/creates
- http://localhost:8080/auth/reset-password
- http://localhost:8080/auth/request-reset-password

# PUT
- http://localhost:8080/user/new_address/1
- http://localhost:8080/api/cart/add
- http://localhost:8080/api/cart_items/7
- http://localhost:8080/api/admin/orders/6519292953b3b6194285ac35/confirmed

# DELETE
- http://localhost:8080/api/admin/orders/2/delete


