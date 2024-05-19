ALTER TABLE jdbc_hw2_liquibase.orders ALTER COLUMN customer_id SET DATA TYPE BIGINT;

ALTER TABLE jdbc_hw2_liquibase.orders ADD CONSTRAINT fk_customers FOREIGN KEY (customer_id)
    REFERENCES jdbc_hw2_liquibase.customers (id);