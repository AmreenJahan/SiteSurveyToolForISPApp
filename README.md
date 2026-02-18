# Site Survey Tool for ISP App

A real-world web application developed during an Infosys internship to help Internet Service Providers (ISPs efficiently conduct site surveys, manage properties, and organize floor plan data in a secure and scalable manner.

## Overview
The Site Survey Tool enables ISP teams to digitally manage survey workflows by maintaining property records, uploading floor plans, and organizing data across multiple organizations through a centralized dashboard.

## Key Features
- Secure user authentication and authorization using JWT
- Property and floor plan management
- Multi-organization support
- Centralized dashboard for survey operations
- Role-based access control

## Technology Stack
- **Backend**: Spring Boot (Java)
- **Frontend**: JSP (JavaServer Pages)
- **Database**: MySQL
- **Security**: Spring Security with JWT
- **Build Tool**: Maven

## Prerequisites
- Java 11 or higher
- Maven 3.6 or higher
- MySQL

## Project Structure
SiteSurveyToolForISPApp/
├── src/main/java/com/sstapp/
│   ├── controller/     # Handles HTTP requests
│   ├── entity/         # JPA entities
│   ├── repository/     # Data access layer
│   ├── service/        # Business logic
│   └── config/         # Security and JWT configuration
├── src/main/resources/
│   └── application.properties
├── src/main/webapps/WEB-INF/views/
│   ├── login.jsp
│   ├── register.jsp
│   ├── dashboard.jsp
│   ├── property.jsp
│   └── floor-upload.jsp
└── pom.xml

## Usage

Register or log in to the application

Create or select an organization

Add properties for site surveys

Upload and manage floor plans

View and track survey data via dashboard

## Security

JWT-based authentication

Spring Security for request filtering and access control

## License

This project is licensed under the MIT License.
