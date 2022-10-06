package ch.inagua.codes.babel.ioc.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    GreetingsInterface greetings;

    @Autowired
    GreetingsInterface friendlyGreetings; // Autowire the right instance thanks to the name `friendlyGreetings`

    @RequestMapping("/hello")
    public String getHello() {
        return this.greetings.greet();
    }

    @RequestMapping("/helloFriendly")
    public String getHelloFriendly() {
        return this.friendlyGreetings.greet();
    }

}
