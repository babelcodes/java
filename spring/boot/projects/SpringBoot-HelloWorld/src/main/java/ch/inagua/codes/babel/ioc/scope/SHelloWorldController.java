package ch.inagua.codes.babel.ioc.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SHelloWorldController {

    @Autowired
    SGreetings sGreetings1;
    @Autowired
    SGreetings sGreetings2;

    @Autowired
    SFriendlyGreetings sFriendlyGreetings1;
    @Autowired
    SFriendlyGreetings sFriendlyGreetings2;

    @RequestMapping("/scope/hello1")
    public String getHello1() {
        return this.sGreetings1.greet();
    }

    @RequestMapping("/scope/hello2")
    public String getHello2() {
        return this.sGreetings2.greet();
    }

    @RequestMapping("/scope/helloFriendly1")
    public String getHelloFriendly1() {
        return this.sFriendlyGreetings1.greet();
    }

    @RequestMapping("/scope/helloFriendly2")
    public String getHelloFriendly2() {
        return this.sFriendlyGreetings2.greet();
    }

}
