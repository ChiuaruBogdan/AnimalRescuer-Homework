package org.fasttrackit;


import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        Pet pet = new Pet();
        pet.setName(("Rex"));
        pet.setAge(3);
        pet.setHappinessLevel(1);
        pet.setHealth(1);
        pet.setHungerLevel(1);
        pet.setFavouriteFood("bones");
        pet.setFavouriteActivity("running");
        pet.setType("dog");
        pet.setBreed("Shepherd");
        pet.setEnergy(9);
        pet.setGender("male");


        Dog dog = new Dog();
        dog.setColor("Red");
        dog.setName("Goku");
        dog.setHappinessLevel(5);

        Rescuer rescuer = new Rescuer();
        rescuer.setName("Batman");
        rescuer.setMoney(100);
        rescuer.setAge(32);
        rescuer.setGender("male");
        rescuer.setJob("Crime-Fighter");
        rescuer.setFavoriteActivity("running");
        rescuer.setName("Bruce");


        AnimalFood animalFood = new AnimalFood();
        animalFood.setName("Bones");
        animalFood.setAmount(5);
        animalFood.setExpirationDate(LocalDateTime.of(2020, 10, 8, 8, 10, 2));
        animalFood.setPrice(50);
        animalFood.setEnergyLevel(6);
        animalFood.setFlavor("tasty");
        animalFood.setType("crunchy");
        animalFood.setManufacturer("PetShop");


        Activity activity = new Activity();
        activity.setName("running");
        activity.setType("sport");
        activity.setHappinessLevel(4);
        activity.setDuration(15);
        activity.setExhaustionLevel(5);

        Medic medic = new Medic();
        medic.setName("Jones");
        medic.setSpecialization("Vet");
        medic.setAge(46);
        medic.setServices("treatment");
        medic.setSkill(10);
        medic.setPrice(9.95);


        Game game = new Game();
        game.dog = new Dog();
        game.medic = new Medic();
        game.rescuer = new Rescuer();


        AnimalCrib animalCrib = new AnimalCrib();
        animalCrib.setName("Bed");
        animalCrib.setPrice(50);

        AnimalPark animalPark = new AnimalPark();
        animalPark.setName("Central");


        AnimalToy animalToy = new AnimalToy();
        animalToy.setName("Squeaky");
        animalToy.setPrice(3.5);
        animalToy.setType("Plastic");

//        apelarea metodei feeding din clasa Rescuer
        rescuer.feeding(pet, animalFood);

//        apelarea metodei recreation
        rescuer.recreation(pet, activity);


//            apelarea metodei happinessLevel pentru Dog

        dog.showHappinessLevel(dog);

    }
}