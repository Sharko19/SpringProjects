package com.hcl.constructorinj;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/hcl/constructorinj/consinj.xml");
    	College c=(College) context.getBean("college");
    	System.out.println(c);
    
    }
}
