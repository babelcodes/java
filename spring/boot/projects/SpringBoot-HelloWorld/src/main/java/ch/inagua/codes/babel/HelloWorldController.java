package ch.inagua.codes.babel;

import ch.inagua.codes.babel.ioc.Greetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    Greetings greetings;

    @RequestMapping("/hello")
    public String getHello() {
        return this.greetings.greet();
    }

}
