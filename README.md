# Microservicios con Spring Boot

Mini Proyecto en spring boot con microservice de prueba que implementa una arquitectura de microservicios utilizando Spring Boot, Docker y otras tecnologías para el desarrollo.

## Arquitectura

Este proyecto está compuesto por 4 microservicios principales:

```
├── 1-inmueble/          # Gestión de propiedades inmobiliarias
├── 2-compra/            # Gestión de compras y transacciones
├── 3-apigateway/        # Puerta de enlace para enrutamiento
└── 4-eureka/            # Servidor de descubrimiento de servicios
```

## Tecnologías Utilizadas

- **Java**
- **Spring Boot**
- **Spring Cloud Eureka**
- **Spring Cloud Gateway**
- **Docker**
- **PostgreSQL (Docker)**
- **MySQL (Docker)**

## 📋 Microservicios

### 1. Servicio Inmueble
Microservicio encargado de la gestión de propiedades inmobiliarias.

### 2. Servicio Compra
Microservicio para gestionar las operaciones de compra y transacciones.

### 3. API Gateway
Punto de entrada único para todos los microservicios. Maneja el enrutamiento, balanceo de carga y seguridad.

### 4. Eureka Server
Servidor de registro y descubrimiento de servicios. Permite que los microservicios se encuentren entre sí dinámicamente.

## Docker

Todos los servicios están containerizados con Docker, incluyendo las bases de datos PostgreSQL y MySQL.

## 📝 Notas

- Este es un proyecto de prueba con fines de familiarizarme y seguir aprendiendo sobre java y como trabajar sobre un proyecto, no pretendo expandirlo mas.