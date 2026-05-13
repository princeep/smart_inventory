SmartInventoryHub – Java JDBC Inventory Management System

A real-world backend project built using
Java,
JDBC,
MySQL, and
IntelliJ IDEA.

This project simulates an inventory management system where shop owners can manage products efficiently using CRUD operations.

Project Overview

SmartInventoryHub is a console-based Java application that connects with MySQL using JDBC and performs product management operations.

Users can:

Add new products
View all products
Update product stock
Delete products
Manage inventory records
Features

✅ Add Product
✅ View Products
✅ Update Product Quantity
✅ Delete Product
✅ Database Connectivity using JDBC
✅ Layered Architecture
✅ Clean Package Structure
✅ Real-world backend project

Tech Stack
Java
JDBC
MySQL
Git
GitHub
IntelliJ IDEA


Database Schema
CREATE DATABASE smart_inventory;

USE smart_inventory;

CREATE TABLE products(
   id INT PRIMARY KEY AUTO_INCREMENT,
   name VARCHAR(100),
   category VARCHAR(100),
   price DOUBLE,
   quantity INT,
   created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
How to Run
1. Clone Repository
git clone <your-repository-url>
2. Open Project

Open the project in IntelliJ IDEA.

3. Configure Database

Update your database credentials inside:

DBConnection.java

4. Run Application

Run:

Main.java

Sample Menu
1 Add Product
2 View Products
3 Update Product
4 Delete Product
5 Exit
Learning Outcomes

Through this project, I practiced:

Object-Oriented Programming
JDBC CRUD operations
SQL queries
Layered architecture
Version control using GitHub
Author

Prince Kumar
