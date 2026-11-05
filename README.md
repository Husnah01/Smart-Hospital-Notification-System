# Smart Hospital Notification System

## Description
A Spring Boot application that processes patient notifications
using Spring IoC and Dependency Injection.
## Technologies
- Java 25
- Spring Boot
- Maven
## Features
- Email notifications
- SMS notifications
- Emergency ICU notifications
- @Autowired dependency injection
- @Primary bean selection
- @Qualifier bean selection
- @Value configuration
- Environment variable security
## Setup
1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Configure HOSPITAL_API_SECRET as an environment variable.
4. Configure HOSPITAL_NAME as an environment variable.
5. Run SmartHospitalApplication.java.
## Security
The .env file is excluded from GitHub.
Never commit real API credentials.
Use .env.example as a template.