package org.fasttrackit;

//inheritance or "is-a" relationship cu Medic
// fa o clasa logica gen "Person" care sa extinda catre Medic
public class Rescuer extends Medic {


    int money;
    String job;
    String gender;
    String favoriteActivity;


    // mai jos sunt cele doua metode de "feeding" si "recreation"

    public void feeding(Pet pet, AnimalFood animalFood) {

        System.out.println(Rescuer.class + " just gave some " + animalFood.name + " to " + pet.name);

    }


    public void recreation (Pet pet, Activity activity) {
        System.out.println( Rescuer.class + " is playing with" + pet.name + "by doing " + activity.name);

    }


}
