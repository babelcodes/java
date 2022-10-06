package ch.inagua.codes.babel.ioc.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControllerConfiguration {

    @Autowired
    CGreetingsInterface cGreetings;

    @Autowired
    CGreetingsInterface cFriendlyGreetings;

    @RequestMapping("/configuration/hello")
    public String getHello() {
        return this.cGreetings.greet();
    }

    @RequestMapping("/configuration/helloFriendly")
    public String getHelloFriendly() {
        return this.cFriendlyGreetings.greet();
    }

}
