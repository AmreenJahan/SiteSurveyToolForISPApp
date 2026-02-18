# Site Survey Tool for ISP App

A real-world enterprise web application developed during the Infosys Internship Program to help Internet Service Providers (ISPs) efficiently conduct site surveys, manage properties, and organize floor plan data securely.

---

## Overview

The Site Survey Tool digitizes ISP survey workflows by enabling secure property management, floor plan uploads, and multi-organization data handling through a centralized dashboard.

---

## Key Features

- JWT-based secure authentication
- Role-based access control
- Property management system
- Floor plan upload and storage
- Multi-organization support
- Centralized dashboard for survey tracking

---

## Technology Stack

- **Backend:** Spring Boot (Java)
- **Frontend:** JSP (JavaServer Pages)
- **Database:** MySQL / H2
- **Security:** Spring Security with JWT
- **Build Tool:** Maven

---

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher
- MySQL (if not using H2)

---


## Project Structure
SiteSurveyToolForISPApp/
│
├── src/main/java/com/sstapp/
│   ├── controller/        # Handles HTTP requests
│   ├── entity/            # JPA entities
│   ├── repository/        # Data access layer
│   ├── service/           # Business logic
│   └── config/            # Security & JWT configuration
│
├── src/main/resources/
│   └── application.properties
│
├── src/main/webapps/WEB-INF/views/
│   ├── login.jsp
│   ├── register.jsp
│   ├── dashboard.jsp
│   ├── property.jsp
│   └── floor-upload.jsp
│
└── pom.xml
## Usage
Register or log in

Create or select an organization

Add properties for site surveys

Upload and manage floor plans

Track survey activities via dashboard

## Security
JWT token-based authentication

Spring Security request filtering

Protected endpoints with role-based authorization

## License
This project is licensed under the MIT License.
