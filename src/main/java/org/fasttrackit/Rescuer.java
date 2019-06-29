package org.fasttrackit;

//inheritance or "is-a" relationship cu Person

public class Rescuer extends Person {

    private String nickname;
    Rescuer rescuer;


    public Rescuer(String name, int money, String job, Rescuer rescuer) {
        super(name, money, job);
        this.rescuer = rescuer;
    }

    public Rescuer(String name, int money, String job, String gender){
        this.getName();
        this.getMoney();
        this.getJob();
        this.getGender();
    }

    public Rescuer(String nickname) {
        this.nickname = nickname;
    }

    public Rescuer() {

    }


    // mai jos sunt cele doua metode de "feeding" si "recreation"

    public void feeding(Pet pet, AnimalFood animalFood) {

        System.out.println(getName() + " just gave some " + animalFood.getName() + " to " + pet.getName());

    }


    public void recreation (Pet pet, Activity activity) {
        System.out.println(getName() + " is playing with " + pet.getName() + "by doing " + activity.getName());

    }


}
