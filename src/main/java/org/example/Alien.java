package org.example;

import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    private int k ;
    private Computer comp;


    //sprcified in the spring.xml file
    @ConstructorProperties({"age","lap"})
    public Alien(int k,Computer com){
        System.out.println("constructor for the k and lap variable called");
         this.k = k;
         this.comp = com;
    }


    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public Alien(){
        System.out.println("object created");
    }
    public void code(){
        System.out.println("coding");
        comp.compile();

    }
}
