# Spring Boot Inject Map Sample

## Run Spring Boot application
```
mvn spring-boot:run
```

# Testing Traditional Factory method

http://localhost:8080/api/old/map?service=typea&message=hello%20from%20A

http://localhost:8080/api/old/map?service=typea&message=hello%20from%20B

http://localhost:8080/api/old/map?service=typea&message=hello%20from%20C


# Testing Auto Injection

http://localhost:8080/api/map?service=typea&message=hello%20from%20A

http://localhost:8080/api/map?service=typea&message=hello%20from%20B

http://localhost:8080/api/map?service=typea&message=hello%20from%20C
