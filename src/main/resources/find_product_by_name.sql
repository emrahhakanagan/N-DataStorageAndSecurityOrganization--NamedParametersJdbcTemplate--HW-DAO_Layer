SELECT product_name FROM jdbc_hw.orders
JOIN jdbc_hw.customers ON jdbc_hw.customers.id = jdbc_hw.orders.customer_id
WHERE first_name = :firstName