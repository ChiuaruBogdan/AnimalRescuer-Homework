package org.fasttrackit;
// inheritance or "is-a" relationship cu Dog

import javax.naming.Name;

public class Pet extends Dog{

    String name;
    int age;
    int health;
    int hungerLevel;
    int happinessLevel;
    String favouriteFood;
    String favouriteActivity;
    String type;
    int energy;
    String breed;
    String gender;



    public Pet(String name, String type, int age, String breed, String gender) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.breed = breed;
        this.gender = gender;
    }

public Pet() {

}


}
