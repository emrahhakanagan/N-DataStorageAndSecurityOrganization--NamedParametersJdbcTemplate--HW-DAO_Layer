create table jdbc_hw2_liquibase.orders (
    id BIGSERIAL PRIMARY KEY NOT NULL,
    date DATE NOT NULL,
    customer_id INT NOT NULL,
    product_name VARCHAR(100) NOT NULL,
    amount DECIMAL(3,2) NOT NULL
);