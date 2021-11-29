package com.hcl.javaannotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory = new AnnotationConfigApplicationContext(annoconfig.class);
        Audi a7 = factory.getBean(Audi.class);
        a7.config();
    }
}
