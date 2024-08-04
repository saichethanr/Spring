package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

        //note that beans are the objects that are managed by the spring framework
        //this is not a part of java its a part of spring framework
        //object is getting created on the line 15 itself
        //all the classes mentioned as beans will be created as the statement below gets executed
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //create the spring.xml passed above in the parameter and configure its declaration and then add breans to the classes the
        //which has to be created by the spring framework
        Alien obj1 = (Alien) context.getBean("alien1");
        obj1.code();

        Alien obj2 = (Alien) context.getBean("alien1");
        obj2.code();
    }
}
