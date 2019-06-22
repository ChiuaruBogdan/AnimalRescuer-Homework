package org.fasttrackit;

//inheritance or "is-a" relationship cu Person

public class Rescuer extends Person {





    // mai jos sunt cele doua metode de "feeding" si "recreation"

    public void feeding(Pet pet, AnimalFood animalFood) {

        System.out.println(Rescuer.class + " just gave some " + animalFood.name + " to " + pet.name);

    }


    public void recreation (Pet pet, Activity activity) {
        System.out.println( Rescuer.class + " is playing with" + pet.name + "by doing " + activity.name);

    }


}
