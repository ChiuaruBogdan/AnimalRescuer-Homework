package org.fasttrackit;

import java.time.LocalDateTime;

public class AnimalFood {

    String name;
    int price;
    int amount;
    int energyLevel;
    String flavor;
    String type;
    String manufacturer;
    LocalDateTime expirationDate;

public AnimalFood(String name, int price, String manufacturer, String type){
    this.name = name;
    this.price = price;
    this.manufacturer = manufacturer;
    this.type = type;
}

public AnimalFood() {

}


//    LocalDateTime expirationDate = LocalDateTime.of(2020,10, 8,8,10,2);

    }

