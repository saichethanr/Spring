package org.example;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop called");
    }

    @Override
    public void compile(){
        System.out.println("Laptop Speaking");
    }
}
