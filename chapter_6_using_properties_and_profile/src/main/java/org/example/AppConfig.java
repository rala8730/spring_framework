package org.example;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("local")
@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:application-local.properties")
public class AppConfig {

}
