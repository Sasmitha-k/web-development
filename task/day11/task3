CREATE TABLE Customers (
    customer_id int PRIMARY KEY,
    customer_name varchar(100),
    city varchar(50)
);
INSERT INTO Customers (customer_id, customer_name, city)
VALUES
(1, 'Sana', 'Coimbatore'),
(2, 'Rehana', 'Madurai'),
(3, 'sasmitha', 'Chennai');

CREATE TABLE Orders (
    order_id int PRIMARY KEY,
    customer_id int,
    order_date DATE,
    amount int,
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id)
);
INSERT INTO Orders (order_id, customer_id, order_date, amount)
VALUES
(201, 1, '2025-06-01', 250),
(202, 2, '2025-06-05', 450),
(203, 1, '2025-06-10', 300),
(204, 3, '2025-06-15', 150);

--join orders and customer
SELECT o.order_id, o.order_date, o.amount, c.customer_name, c.city
FROM Orders o
JOIN Customers c ON o.customer_id = c.customer_id;
