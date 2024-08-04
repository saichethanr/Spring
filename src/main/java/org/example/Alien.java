package org.example;

public class Alien {
    private int k ;
    private Laptop lap = new Laptop();

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
