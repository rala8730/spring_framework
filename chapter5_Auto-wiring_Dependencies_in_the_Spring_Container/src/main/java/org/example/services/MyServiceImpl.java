package org.example.services;

import org.example.data.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    @Autowired
    private MyRepository repository;
    public MyServiceImpl(@Qualifier("myRepositoryImpl") MyRepository repository) {
        this.repository = repository;
    }

    @Override
    public void doBusinessLogic(){
        System.out.println("Doing some business logic");
        repository.doQuery();
    }


}
