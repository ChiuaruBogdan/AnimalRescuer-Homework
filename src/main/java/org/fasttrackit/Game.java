package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    Rescuer rescuer;
    Dog dog;
    Medic medic;
    private List<AnimalFood> availableFood = new ArrayList<>();
    private Activity[] availableActivities = new Activity[2];


    public void start() {
        initFood();
        displayFood();
    }

    private void initFood() {
        AnimalFood carnat = new AnimalFood();
        carnat.setName("Crenwurst");
        availableFood.set(0, carnat);


        AnimalFood pizza = new AnimalFood();
        pizza.setName("Dominos");
        availableFood.set(1, pizza);
    }
    private void displayFood() {
        System.out.println("Available food: ");
        for (int i = 0; i < availableFood.size(); i++) {
            if (availableFood != null) {
                System.out.println(availableFood.get(i).getName());
            }
        }
    }

  private void initActivities() {
        Activity sport = new Activity();
        sport.setName("Alergare");
        availableActivities[0] = sport;

        Activity fun = new Activity();
        fun.setName("Somn");
        availableActivities[1] = fun;
    }


}


