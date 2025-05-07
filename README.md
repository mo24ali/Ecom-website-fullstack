# 🛒 E-Commerce Web Application

A full-stack E-Commerce web application developed using **Spring Boot**, **Angular**, and **MySQL**. This platform allows users to browse products, manage carts, place orders, and handle payments. Admins can manage products, orders, and user roles.

## ⚙️ Tech Stack

| Layer        | Technology      |
|--------------|-----------------|
| Frontend     | Angular 16      |
| Backend      | Spring Boot 3   |
| Database     | MySQL 8+        |
| Build Tool   | Maven           |
| Security     | Spring Security |
| API Comm.    | RESTful APIs    |
| Auth         | JWT             |

## 📁 Project Structure


ecommerce-app/
│
├── backend/               # Spring Boot Project
│   ├── src/main/java/...  # Java source code
│   └── src/main/resources/
│
├── frontend/              # Angular Project
│   ├── src/app/
│   └── angular.json
│
└── README.md


# 🔐 Features

# 🧑 User Side
- User registration & login (JWT-based)
- Product browsing & filtering
- Shopping cart management
- Order placement
- Order history

# 🛠 Admin Panel
- Product CRUD operations
- View and manage orders
- Role-based access control

# 🚀 Getting Started

# 📦 Backend Setup (Spring Boot)

cd backend
# Configure `application.properties` for MySQL
./mvnw spring-boot:run


# 💻 Frontend Setup (Angular)
bash
cd frontend
npm install
ng serve


> By default:
> - Frontend runs on: `http://localhost:4200/'
> - Backend runs on: `http://localhost:8080/'

# 🗃 Database Configuration

Update 'application.properties' in 'backend/src/main/resources/':
properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


Run this SQL to create the DB manually (if needed):
sql
CREATE DATABASE ecommerce_db;


# 🧪 API Overview

| Method | Endpoint              | Description           |
|--------|------------------------|-----------------------|
| GET    | `/api/products`        | List all products     |
| POST   | `/api/auth/login`      | Authenticate user     |
| POST   | `/api/orders`          | Place new order       |
| GET    | `/api/admin/products`  | Admin product listing |

# 🧑‍💻 Contributing

1. Fork the project  
2. Create a feature branch (`git checkout -b feature/xyz`)  
3. Commit your changes  
4. Push to your fork  
5. Submit a Pull Request  
