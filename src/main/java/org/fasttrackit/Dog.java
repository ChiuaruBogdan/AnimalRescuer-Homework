package org.fasttrackit;
// inheritance or "is-a" relationship cu Pet

public class Dog {


    private String name;
    private String color;
    private int happinessLevel;

    public Dog(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public Dog() {

    }



    public void showHappinessLevel(Dog happinessLevel){
        System.out.println(getName() + " is wagging his tail because his happiness level is " + getHappinessLevel());
    }


}


//getName() + " is playing with" + pet.getName() + "by doing " + activity.getName());  <<<---