**JWT Authentication with Spring Security 6**

This project demonstrates how to implement JWT (JSON Web Token) authentication in a Spring Boot application using Spring Security 6. It includes secure endpoints, user registration, login, and JWT token validation.


**Features**:

1)User registration and login

2)JWT generation and validation

3)Role-based access control

4)Secured endpoints using JWT

5)Token-based authentication and stateless sessions




**Technologies Used**

Spring Boot: Rapid development with built-in features.

Spring Security 6: Security framework for Java-based applications.

JWT: Token-based authentication for stateless, secure sessions.

Maven: Dependency management.




**How JWT Authentication Works**

-User Registration/Login: When a user registers or logs in, they receive a JWT.

-JWT Token: The client stores this token (e.g., in localStorage or sessionStorage) and includes it in the Authorization header for each subsequent request to secured endpoints.

-Token Validation: The backend verifies the token. If valid, the user is allowed access to the requested resource.

-Stateless Sessions: The server does not store user sessions. Each request is authenticated independently using the JWT.

