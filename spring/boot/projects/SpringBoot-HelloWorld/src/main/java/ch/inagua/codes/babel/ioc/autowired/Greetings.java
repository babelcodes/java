package ch.inagua.codes.babel.ioc.autowired;

import org.springframework.stereotype.Component;

@Component
public class Greetings implements GreetingsInterface {
    @Override
    public String greet() {
        return "HiJack!";
    }
}
