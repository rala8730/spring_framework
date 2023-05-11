package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext ctx= new FileSystemXmlApplicationContext("application-context.xml");
        ApplicationContext ctx= new ClassPathXmlApplicationContext("application-context.xml");

        MyService bean=ctx.getBean(MyService.class);

        bean.doBusinessLogic();

        MyRepository repository=ctx.getBean(MyRepository.class);
        repository.doQuery();
    }
}
