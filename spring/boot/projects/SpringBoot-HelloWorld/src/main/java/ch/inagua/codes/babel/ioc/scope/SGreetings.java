package ch.inagua.codes.babel.ioc.scope;

import org.springframework.stereotype.Component;

public class SGreetings extends SGreetingsBase {
    @Override
    public String greet() {
        return "HiJack! " + this.count++;
    }
}
