create schema jdbc_hw;

create table jdbc_hw.customers (
id BIGSERIAL PRIMARY KEY NOT NULL,
first_name VARCHAR(100) NOT NULL,
last_name VARCHAR(100) NOT NULL,
age INT,
phone_number VARCHAR(20) NOT NULL
);

create table jdbc_hw.orders (
id BIGSERIAL PRIMARY KEY NOT NULL,
date DATE NOT NULL,
customer_id INT NOT NULL,
product_name VARCHAR(100) NOT NULL,
amount DECIMAL(3,2) NOT NULL
);

ALTER TABLE jdbc_hw.orders ALTER COLUMN customer_id SET DATA TYPE BIGINT;

ALTER TABLE jdbc_hw.orders ADD CONSTRAINT fk_customers FOREIGN KEY (customer_id)
    REFERENCES jdbc_hw.customers (id);