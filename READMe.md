# Sistema de Autenticación Spring Boot

Aplicación simple de autenticación con Spring Boot y Thymeleaf.

## Diagrama de Clases

```plantuml
@startuml
!include docs/diagrams/auth-system-uml.puml
@enduml
```

## Requisitos
- Java 17+
- Maven 3.6+

## Instalación
```bash
mvn clean install
```

## Ejecución
```bash
mvn spring-boot:run
```

## Uso
Accede a la aplicación en:
```
http://localhost:8080/inicio
```

Credenciales de prueba:
- Usuario: admin
- Contraseña: 1234

## Diagrama de Clases

![Diagrama UML](docs/diagrams/auth-system-uml.png)

