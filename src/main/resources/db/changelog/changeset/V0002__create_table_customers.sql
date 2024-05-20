create table jdbc_hw2_liquibase.customers (
    id BIGSERIAL PRIMARY KEY NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    age INT,
    phone_number VARCHAR(20) NOT NULL
);