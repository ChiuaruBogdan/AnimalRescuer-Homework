package org.fasttrackit;

//inheritance or "is-a" relationship cu Medic

public class Rescuer extends Medic {


    int money;
    String job;
    String gender;
    String favoriteActivity;


    // mai jos sunt cele doua metode de "feeding" si "recreation"

    public void feeding(Pet pet, AnimalFood animalFood) {

        System.out.println("Batman" + " just gave some " + animalFood.name + " to " + pet.name);

    }


    public void recreation (Pet pet, Activity activity) {
        System.out.println("Batman" + " is playing with" + pet.name + "by doing " + activity.name);

    }


}
