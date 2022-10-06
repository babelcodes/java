package ch.inagua.codes.babel.ioc;

import org.springframework.stereotype.Component;

@Component
public class Greetings {
    public String greet() {
        return "HiJack!";
    }
}
