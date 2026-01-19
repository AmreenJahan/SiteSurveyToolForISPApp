# Site Survey Tool for ISP Application

A Spring Boot application designed for Internet Service Providers (ISPs) to conduct site surveys efficiently. This tool helps manage properties, floors, and organizational data for site survey operations.

## 🚀 Features

- **Property Management**: Create and manage survey properties
- **Floor Management**: Track floor information for properties
- **Organization Management**: Handle organizational data
- **User Authentication**: JWT-based authentication system
- **RESTful APIs**: Clean REST endpoints for all operations
- **Database Integration**: MySQL database with JPA/Hibernate

## 🛠️ Technology Stack

- **Backend**: Spring Boot 4.0.1
- **Java**: Java 17
- **Database**: MySQL
- **ORM**: Spring Data JPA with Hibernate
- **Security**: Spring Security with JWT
- **Build Tool**: Maven
- **Utilities**: Lombok for boilerplate code reduction

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.6 or higher
- MySQL 8.0 or higher
- Git

## 🗄️ Database Setup

1. Create a MySQL database named `sitesurvey`
2. Update the database credentials in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/sitesurvey
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

## 🚀 Quick Start

1. **Clone the repository**
   ```bash
   git clone https://github.com/AmreenJahan/SiteSurveyToolForISPApp.git
   cd SiteSurveyToolForISPApp
   ```

2. **Build the application**
   ```bash
   mvn clean install
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

The application will start on `http://localhost:8086`

## 📁 Project Structure

```
SiteSurveyToolForISPApp/
├── src/
│   └── main/
│       ├── java/com/sstapp/
│       │   ├── SiteSurveyToolForIspAppApplication.java  # Main application class
│       │   ├── config/
│       │   │   └── SecurityConfig.java                   # Security configuration
│       │   ├── controller/
│       │   │   ├── AuthController.java                   # Authentication endpoints
│       │   │   ├── FloorController.java                  # Floor management endpoints
│       │   │   └── PropertyController.java               # Property management endpoints
│       │   ├── entity/
│       │   │   ├── Floor.java                           # Floor entity
│       │   │   ├── Organization.java                    # Organization entity
│       │   │   ├── Property.java                        # Property entity
│       │   │   └── User.java                            # User entity
│       │   ├── repository/
│       │   │   ├── FloorRepository.java                 # Floor data access
│       │   │   ├── PropertyRepository.java              # Property data access
│       │   │   └── UserRepository.java                   # User data access
│       │   └── service/
│       │       └── FileStorageService.java              # File handling service
│       └── resources/
│           ├── application.properties                    # Application configuration
│           ├── static/                                  # Static resources
│           └── templates/                               # View templates
├── pom.xml                                              # Maven configuration
└── README.md                                            # This file
```

## 🔌 API Endpoints

### Property Management
- `POST /api/property` - Create a new property
- `GET /api/property` - Get all properties

### Floor Management
- Floor management endpoints available via FloorController

### Authentication
- Authentication endpoints available via AuthController

## 🔧 Configuration

The application configuration is managed through `application.properties`:

- **Server Port**: 8086 (configurable)
- **Database**: MySQL connection settings
- **JPA**: Hibernate DDL auto-update enabled
- **JWT**: Secret key configuration (commented in properties)

## 🧪 Testing

Run the test suite:
```bash
mvn test
```

## 📝 Dependencies

Key dependencies include:
- Spring Boot Starter Web MVC
- Spring Boot Starter Data JPA
- Spring Boot Starter Security
- MySQL Connector
- JWT (io.jsonwebtoken)
- Lombok

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 📞 Contact

For any queries or support, please reach out through the repository issues.

---

**Note**: Make sure to update the database credentials in `application.properties` before running the application.
