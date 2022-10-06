package ch.inagua.codes.babel.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CCHelloWorldController {
    @Autowired
    CCFriendlyGreetings ccFriendlyGreetings;

    @RequestMapping("/configuration/ccFriendlyGreetings")
    public String getHelloFriendly1() {
        return this.ccFriendlyGreetings.greet();
    }
}
