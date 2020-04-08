# SpringBoot-Assignment-1

First Assignment for Java training at Unthinkable Solutions LLP.

Assignment covers the training started on:- 
- Java
- [Maven](https://maven.apache.org/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Boot Rest](https://spring.io/guides/gs/rest-service)
- [JPA](https://spring.io/guides/gs/accessing-data-mysql/)
- [H2 DB](https://www.h2database.com/)

####Software Used
[Spring Tool Suite](https://spring.io/tools)


##### Server on 
Default port is 8080, port is changed in `application.properties` file

    - localhost:8082/employees
    - localhost:8082/departments

Rest Api is directly implemented using the JPA Repository.
Many to One relations on Department and Employee.

###CRUD Operations
#####Employee
- ###### Create employee 
    Post request on `localhost:8082/employees` with body containing JSON data
- ###### Read employees 
    GET request on `localhost:8082/employees`
- ###### Update employee 
    PUT request on `localhost:8082/employees` with body containing JSON data
- ###### Delete employee 
    DELETE request on `localhost:8082/employees/{empId}`

#####Department
- ###### Create department 
    Post request on `localhost:8082/departments` with body containing JSON data
- ###### Read departments 
    GET request on `localhost:8082/departments`
- ###### Update department 
    PUT request on `localhost:8082/departments` with body containing JSON data
- ###### Delete department 
    DELETE request on `localhost:8082/departments/{deptId}`