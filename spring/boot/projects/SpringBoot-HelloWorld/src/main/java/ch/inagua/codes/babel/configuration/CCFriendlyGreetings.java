package ch.inagua.codes.babel.configuration;

import ch.inagua.codes.babel.ioc.scope.SGreetingsBase;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CCFriendlyGreetings extends SGreetingsBase implements InitializingBean, DisposableBean {

    private CCDatabaseConfiguration databaseConfiguration;

    public CCFriendlyGreetings(CCDatabaseConfiguration databaseConfiguration) {
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override
    public String greet() {
        return "Dear Jack! " + this.count++ + " " + this.databaseConfiguration.getUrl() + " - " + this.databaseConfiguration.getUsername();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(">> Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(">> After property set");
    }

    @PostConstruct
    public void myPostConstruct() {
        System.out.println(">> @PostConstruct");
    }

    @PreDestroy
    public void myPreDestroy() {
        System.out.println(">> @PreDestroy");
    }

}
