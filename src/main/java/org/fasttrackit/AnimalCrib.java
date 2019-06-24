package org.fasttrackit;

public class AnimalCrib {

    private String name;
    private double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public AnimalCrib(String name, double price){
        this.name = name;
        this.price = price;

    }
    public AnimalCrib(){

    }

}


