package ch.inagua.codes.babel.ioc;

import org.springframework.stereotype.Component;

@Component
public class FriendlyGreetings implements GreetingsInterface {
    @Override
    public String greet() {
        return "Dear Jack!";
    }
}
