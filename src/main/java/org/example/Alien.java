package org.example;

import java.beans.ConstructorProperties;

public class Alien {
    private int k ;
    private Laptop lap = new Laptop();

    //sprcified in the spring.xml file
    @ConstructorProperties({"age","lap"})
    public Alien(int k,Laptop lap){
        System.out.println("constructor for the k and lap variable called");
         this.k = k;
         this.lap = lap;
    }


    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
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
        lap.compile();

    }
}
