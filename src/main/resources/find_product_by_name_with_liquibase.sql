SELECT product_name FROM jdbc_hw2_liquibase.orders
JOIN jdbc_hw2_liquibase.customers ON jdbc_hw2_liquibase.customers.id = jdbc_hw2_liquibase.orders.customer_id
WHERE first_name = :firstName