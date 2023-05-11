package org.example.presentation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
/*
//java based
    @Bean
    @Scope("prototype")
    public MyService getservice(){
        return new MyService(getrepository());
    }
    @Bean
    public MyRepository getrepository(){
        return new MyRepository();
    }
*/
}
