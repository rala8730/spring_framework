package org.example;

public class MyService {
    private MyRepository repository;
    /* constructor depedency
    public MyService(MyRepository repository){
        this.repository=repository;
    }
    */
    public void doBusinessLogic(){
        System.out.println("Doing some business logic");
        repository.doQuery();
    }
//setter depedency
    public void setRepository(MyRepository repository) {
        this.repository = repository;
    }
}
