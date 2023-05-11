package org.example.services;

import org.example.data.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnotherServiceImpl implements MyService {

    @Override
    public void doBusinessLogic(){
        System.out.println("Doing some business logic slightly differently");
    }


}
