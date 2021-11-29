package com.hcl.springjavabased;

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
        ApplicationContext context=new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Car carObj=(Car) context.getBean("carObj");
        String name=carObj.getName();
        System.out.println("Car Brand name: "+ name);
        
    }
}
