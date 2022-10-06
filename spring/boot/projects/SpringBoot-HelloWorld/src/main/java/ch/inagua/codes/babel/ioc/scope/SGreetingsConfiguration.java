package ch.inagua.codes.babel.ioc.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class SGreetingsConfiguration {

    @Bean
    @Scope(value = "prototype")
    public SGreetings sGreetings() {
        return new SGreetings();
    }

    @Bean
    // @Scope(value = "singleton")
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public SFriendlyGreetings sFriendlyGreetings() {
        return new SFriendlyGreetings();
    }

}
