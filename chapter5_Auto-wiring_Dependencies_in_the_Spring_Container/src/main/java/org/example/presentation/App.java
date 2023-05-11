package org.example.presentation;

import org.example.services.AnotherServiceImpl;
import org.example.services.MyService;
import org.example.services.MyServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext ctx= new FileSystemXmlApplicationContext("application-context.xml");
        //ApplicationContext ctx= new ClassPathXmlApplicationContext("application-context.xml");
        ApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);


        MyService service=ctx.getBean(AnotherServiceImpl.class);
        MyService service1=ctx.getBean(MyServiceImpl.class);
    }
}
