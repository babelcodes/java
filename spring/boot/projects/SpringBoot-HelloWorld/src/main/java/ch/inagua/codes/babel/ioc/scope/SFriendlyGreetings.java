package ch.inagua.codes.babel.ioc.scope;

import org.springframework.stereotype.Component;

public class SFriendlyGreetings extends SGreetingsBase {
    @Override
    public String greet() {
        return "Dear Jack! " + this.count++;
    }
}
