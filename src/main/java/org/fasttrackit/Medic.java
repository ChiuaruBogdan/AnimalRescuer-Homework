package org.fasttrackit;


//inheritance sau "is-a" cu Medic
public class Medic extends Rescuer{



    public Medic(String name, int age, String specialization, String gender){

        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.gender = gender;
    }

    public Medic() {

    }
}
