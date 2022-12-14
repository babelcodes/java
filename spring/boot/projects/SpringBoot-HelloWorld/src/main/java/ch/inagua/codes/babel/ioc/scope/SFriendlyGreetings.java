package ch.inagua.codes.babel.ioc.scope;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SFriendlyGreetings extends SGreetingsBase implements InitializingBean, DisposableBean {
    @Override
    public String greet() {
        return "Dear Jack! " + this.count++;
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
