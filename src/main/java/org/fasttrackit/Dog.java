package org.fasttrackit;
// inheritance or "is-a" relationship cu Pet

public class Dog {

    private String color;

    public Dog(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog() {

    }

//    public void showHappinessLevel(Dog happinessLevel){
//        System.out.println(getName() + " is wagging his tail because his happiness level is " + getHappinnessLevel);
//    }
}
