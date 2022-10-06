package ch.inagua.codes.babel.ioc.configuration;

import org.springframework.stereotype.Component;

@Component
public class CGreetings implements CGreetingsInterface {
    @Override
    public String greet() {
        return "HiJack!";
    }
}
