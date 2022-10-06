# Spring Boot

- Part of [Java](../..) / [Spring](..)
- [spring.io/projects/spring-boot](https://spring.io/projects/spring-boot) `#2.7.4`

## Project
- [SpringBoot-HelloWorld](./projects/SpringBoot-HelloWorld)
![](./projects/create-project.intellij.png)


## Concepts
- Easily develop autonomous apps
- Tomcat embedded
- Use [Spring](..)


## Dependencies
- [Maven](../../maven) as build and dependencies management tool


## Concepts

### Inversion Of Control (IoC)
- Uncouple the execution of a task from its definition
- Separate the **WHAT** from the **WHEN**


### Dependency Injection (DI)
- A way of doing IoC
- By injecting its dependencies to an object
- Different means:
  - Setters
  - Constructors
  - Interfaces
  - Field Based
- SpringBoot uses `@Autowired` annotation to inject dependencies


### Spring Beans
- Customized user objects managed by the IoC container
- `@Component` used on a class to declare it to the IoC container
- `@Bean` used on a method, only on classes using `@Configuration`
- `@Autowired` allows to inject beans through constructors, setters or fields


## Code

### Application
```java
package ch.inagua.codes.babel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}
```

### Controller / route
```java
package ch.inagua.codes.babel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String getHello() {
        return "HiJack";
    }
}
```

### Dependency Injection
```java
package ch.inagua.codes.babel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
public class Greetings {
  public String greet() {
    return "HiJack!";
  }
}

@RestController
public class HelloWorldController {
  @Autowired
  Greetings greetings;

  @RequestMapping("/hello")
  public String getHello() {
    return this.greetings.greet();
  }
}
```
