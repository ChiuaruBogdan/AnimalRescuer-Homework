package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    {
        Pet pet = new Pet();
        pet.name = "Rex";
        pet.age = 3;
        pet.happinessLevel = 1;
        pet.health = 1;
        pet.hungerLevel = 1;
        pet.favouriteFood = "bones";
        pet.favouriteActivity ="running";
        pet.type = "dog";
        pet.breed ="Shepherd";
        pet.energy = 9;
        pet.gender = "male";

        Rescuer rescuer = new Rescuer();
        rescuer.money = 100;
        rescuer.name = "Batman";
        rescuer.age = 32;
        rescuer.gender = "male";
        rescuer.job = "Crime-Fighter";
        rescuer.favoriteActivity = "running";


        animalFood animalFood = new animalFood();
        animalFood.name = "Bones";
        animalFood.cantity = 5;
        animalFood.availability = true;
        animalFood.expirationDate = 10;
        animalFood.price = 50;
        animalFood.energyLevel = 6;
        animalFood.flavor = "tasty";
        animalFood.type = "crunchy";
        animalFood.manufacturer = "PetShop";

        Activity activity = new Activity();
        activity.name = "running";
        activity.type = "sport";
        activity.happinessLevel = 4;
        activity.duration = 15;
        activity.exhaustionLevel = 5;

        Medic medic = new Medic();
        medic.name = "Jones";
        medic.specialization = "Vet";
        medic.age = 46;
        medic.services = "treatment";
        medic.skill = 10;
        medic.price = 9.95;


        Game game = new Game();
        game.dog = "Rex";
        game.medic = "Jones";
        game.rescuer = "Batman";

    }

}


