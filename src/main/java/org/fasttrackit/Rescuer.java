package org.fasttrackit;

//inheritance or "is-a" relationship cu Person

public class Rescuer extends Person {

    Rescuer rescuer;




    public Rescuer(String name, int money, String job, String gender){
        this.name = name;
        this.money = money;
        this.job = job;
        this.gender = gender;
    }

    public Rescuer() {

    }


    // mai jos sunt cele doua metode de "feeding" si "recreation"

    public void feeding(Pet pet, AnimalFood animalFood) {

        System.out.println(rescuer.name + " just gave some " + animalFood.name + " to " + pet.name);

    }


    public void recreation (Pet pet, Activity activity) {
        System.out.println( rescuer.name + " is playing with" + pet.name + "by doing " + activity.name);

    }


}
