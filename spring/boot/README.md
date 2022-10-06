# Spring Boot

- Part of [Java](../..) / [Spring](..)
- [spring.io/projects/spring-boot](https://spring.io/projects/spring-boot) `#2.7.4`

## Concepts

- Easily develop autonomous apps
- Tomcat embedded
- Use [Spring](..)

## Dependencies

- [Maven](../../maven) as build and dependencies management tool


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
