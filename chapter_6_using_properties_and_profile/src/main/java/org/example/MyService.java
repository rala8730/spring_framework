package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MyService implements EnvironmentAware {
   @Value("service.baseUrl")
   private String SERVICE_BASEURL;
   private MyRepository repository;
   private Environment environment;
    @Autowired
    public MyService(MyRepository repository){
        this.repository=repository;
    }
    public void doBusinessLogic(){
        //System.out.println("Do Business logic for "+name);

        System.out.println("Do Business logic for ");
        System.out.println("Active profile : "+ Arrays.toString(this.environment.getActiveProfiles()));
        System.out.println(String.format("connecting to [%s]",SERVICE_BASEURL));
        repository.doQuery();
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment=environment;

    }
}
