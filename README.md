## --- NETOLOGY HOMEWORK ---
### DATA STORAGE AND SECURITY ORGANIZATION --> JDBC API, JdbcTemplate, NamedParametersJdbcTemplate


#### --> Task 1 --> DAO Layer (Data Access Object)

## Overview

This project demonstrates the use of Spring Boot with Spring JDBC and NamedParameterJdbcTemplate to interact with a PostgreSQL database. It includes a simple setup with a DAO (Data Access Object) layer for managing `Product` entities, a service layer for business logic, and a controller layer for handling HTTP requests.

## Project Structure

- **Controller Layer**: Handles HTTP requests and delegates them to the service layer.
- **Service Layer**: Contains business logic and interacts with the DAO layer.
- **DAO Layer**: Manages database operations using NamedParameterJdbcTemplate.

## Files

### Java Classes

- **ProductController.java**: Handles HTTP GET requests for fetching product names by customer first name.
- **ProductService.java**: Contains the business logic for fetching product names.
- **ProductRepository.java**: Interacts with the database to fetch product names by customer first name.
- **JdbcApiJdbcTemplateNamedParametersHwTask1DaoLayerApplication.java**: Main class for running the 
Spring Boot application.

### SQL Files

- **schema.sql**: Contains the SQL script for creating the necessary database schema.
- **find_product_by_name.sql**: Contains the SQL query for fetching product names based 
on the customer's first name.
- **data.sql**: Contains sample data for populating the database.

### Configuration Files

- **application.properties**: Contains the Spring Boot application configuration.

## Getting Started

### Prerequisites

- Java 17
- PostgreSQL
- Maven

### Setup

1. **Clone the repository**:
````
   git clone <repository-url>
   cd jdbc-api-jdbctemplate-namedparameters-hw-task1-daolayer
````

2. Configure the database:
Ensure you have a PostgreSQL database running and update the application.properties file with your 
database credentials.
````
spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
spring.datasource.username=username
spring.datasource.password=password
spring.sql.init.mode=always
spring.sql.init.continue-on-error=true
````

3. Run the application:
   Use Maven to build and run the Spring Boot application.
````
mvn spring-boot:run
````

4. Access the application:
   Open your browser and navigate to:
````
http://localhost:8080/products/fetch-product?firstName=Ivan
````

## Conclusion
This project demonstrates how to create a simple Spring Boot application with a DAO layer using NamedParameterJdbcTemplate to interact with a PostgreSQL database. The application includes basic CRUD operations and showcases how to structure a Spring Boot project with controller, service, and repository layers.

Feel free to explore the project and modify it according to your needs.

If you encounter any issues or have questions, please feel free to open an issue on GitHub or contact the project maintainers.

Happy coding!



