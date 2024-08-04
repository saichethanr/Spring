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

        //so the number of objects created is not depending on the no of reference for a class
        //but it depends on the no of

        Alien obj1 = (Alien) context.getBean("alien1");
        //the below line is one way to store the value but we can also do it using setter injection which is done in the setter.xml
//        obj1.setK(21);
        System.out.println(obj1.getK());
        //how many ever times we create a reference only a single object is created so if any
        //attribute of object is changes by the reference all the references will have the same value
        //this is singolton scoping which is default
        //but if we want prototype scoping then we would need to change the spring.xml file
        //on protopye mode on the Application context line object would not be create--- it would onl chheck for the required breans

//        Alien obj2 = (Alien) context.getBean("alien1");


    }
}
