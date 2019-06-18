package org.fasttrackit;

//inheritance or "is-a" relationship cu Medic

public class Rescuer extends Medic {


    int money;
    String job;
    String gender;
    String favoriteActivity;


    // mai jos sunt cele doua metode de "feeding" si "recreation"

    public void feeding(Rescuer rescuer, Pet pet, AnimalFood animalFood) {

        System.out.println(rescuer.name + " just gave some " + animalFood.name + " to " + pet.name);

    }


    public void recreation (Rescuer rescuer, Pet pet, Activity activity) {
        System.out.println(rescuer.name + " is playing with" + pet.name + "by doing " + activity.name);

    }


}
