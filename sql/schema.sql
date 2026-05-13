CREATE DATABASE smart_inventory;

USE smart_inventory;

CREATE TABLE products(
                         id INT PRIMARY KEY AUTO_INCREMENT,
                         name VARCHAR(100),
                         category VARCHAR(50),
                         price DECIMAL(10,2),
                         quantity INT,
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);