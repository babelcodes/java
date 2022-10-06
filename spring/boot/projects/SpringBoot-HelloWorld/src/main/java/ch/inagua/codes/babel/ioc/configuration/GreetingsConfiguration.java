package ch.inagua.codes.babel.ioc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingsConfiguration {

    @Bean
    public CGreetingsInterface cGreetings() {
        return new CGreetings();
    }

    @Bean
    public CGreetingsInterface cFriendlyGreetings() {
        return new CFriendlyGreetings();
    }

}
