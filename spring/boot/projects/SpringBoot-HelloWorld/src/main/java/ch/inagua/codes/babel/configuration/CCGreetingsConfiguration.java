package ch.inagua.codes.babel.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class CCGreetingsConfiguration {

    @Autowired
    CCDatabaseConfiguration databaseConfiguration;

    @Bean
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public CCFriendlyGreetings sFriendlyGreetings() {
        return new CCFriendlyGreetings(this.databaseConfiguration);
    }

}
