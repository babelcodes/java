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
- `@Component` used on a class to declare it to the IoC container: the class becomes a managed bean
- `@Bean` used on a method to defined its result as a bean, only on classes using `@Configuration`
- By default, the bean name is the same as the method
- `@Autowired` allows to inject beans through constructors, setters or fields
  - Matching by the type (default)
  - Matching by the field name
  - Matching with additional annotations (`@Qualifier`)


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

public interface GreetingsInterface {
  String greet();
}

@Component
public class Greetings implements GreetingsInterface {
  public String greet() {
    return "HiJack!";
  }
}

@Component
public class FriendlyGreetings implements GreetingsInterface {
  @Override
  public String greet() {
    return "Dear Jack!";
  }
}

@RestController
public class HelloWorldController {
  @Autowired
  Greetings greetings;                  // Matching the type => Greetings

  @Autowired
  GreetingsInterface greetings;         // Matching the name of the field => Greetings

  @Autowired
  GreetingsInterface friendlyGreetings; // Matching the name of the field => FriendlyGreetings

  @Autowired
  // @Qualifier(value="friendlyGreetings")
  GreetingsInterface greetings666;      // Fail!
                                        // Or use @Component(value=greetings666) in the target class definition
                                        // Or use @Qualifier(value="friendlyGreetings") here / above
  @RequestMapping("/hello")
  public String getHello() {
    return this.greetings.greet();
  }
}
```
