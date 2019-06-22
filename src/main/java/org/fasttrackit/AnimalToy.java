package org.fasttrackit;

public class AnimalToy {


    private String name;
    private double price;
    private int energyLevel;
    private String type;
    private int happinessLevel;


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

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public AnimalToy(String name, double price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }
    public AnimalToy(){

    }

}
