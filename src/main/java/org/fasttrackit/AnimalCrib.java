package org.fasttrackit;

public class AnimalCrib {

    private String name;
    private double price;
    private int happinessLevel;
    private int energyLevel;

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

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public AnimalCrib(String name, double price){
        this.name = name;
        this.price = price;

    }
    public AnimalCrib(){

    }

}


