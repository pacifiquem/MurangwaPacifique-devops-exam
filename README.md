# DevOps & Software Testing Exam - End of Term I

This repository contains the solution for the DevOps & Software Testing exam, End of Term I. The exam tasks is related to building a simple calculator API using Java Spring Boot, JUnit, and Mockito.

## Project Components

### 1. DTO (Data Transfer Object)

- Created the `DoMathRequest` class representing the input data structure for the `MathController`.

### 2. Controller

- Implemented the `MathController` class, providing a POST endpoint `/doMath` to perform basic mathematical operations.

### 3. Service

- Implemented the `MathOperator` interface and its implementation, `MathOperatorImpl`, to handle the logic of performing addition, subtraction, multiplication, and division.

### 4. Exception Handling

- Included the `InvalidOperationException` class to handle exceptions related to invalid mathematical operations.

### 5. Utility Class

- Implemented the `NotFound` utility class to handle not-found routes and provide information about available paths and usage instructions.

### 6. Tests

#### Unit Tests

- Implemented unit tests for the `MathOperatorImpl` class covering all mathematical operations and exception scenarios.

#### Integration Tests

- Implemented integration tests for the `MathController` using `MockMvc`.

#### End-to-End Tests

- Implemented end-to-end tests for the `MathController` using `TestRestTemplate`.

### 7. Test Folder Structure

>src&nbsp; <br>
|--&nbsp;test&nbsp; <br>
|&nbsp;&nbsp;&nbsp;|--&nbsp;java&nbsp; <br>
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|--&nbsp;rca.yearthree.termone.devops.exam.V1&nbsp; <br>
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|--&nbsp;controller&nbsp; <br>
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|--&nbsp;MathControllerIntegrationTest.java&nbsp; <br>
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|--&nbsp;MathControllerEndToEndTest.java&nbsp; <br>
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|--&nbsp;service&nbsp; <br>
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|--&nbsp;MathOperatorImplTest.java&nbsp; <br>
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|--&nbsp;utils&nbsp; <br>
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|--&nbsp;NotFoundTest.java&nbsp;


## Running the Application

- The application can be run using Spring Boot.
- Necessary properties are configured the `application.properties` file, just run it.