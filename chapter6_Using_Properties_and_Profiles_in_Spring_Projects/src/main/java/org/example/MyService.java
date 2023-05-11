package org.example;

public class MyService {
    @Value
    private String name;
    private MyRepository repository;

    public MyService(MyRepository repository){this.repository=repository;}
    public void doBusinessLogic(){
        System.out.println("Doing business logic "+name);
        repository.DoQuery()
}
