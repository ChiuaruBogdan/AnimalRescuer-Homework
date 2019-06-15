package org.fasttrackit;

import java.time.LocalDateTime;

public class AnimalFood {

    String name;
    int price;
    int amount;
    boolean availability;
    int energyLevel;
    String flavor;
    String type;
    String manufacturer;


    LocalDateTime expirationDate;

    public static void main(String[] args) {
    LocalDateTime expirationDate = LocalDateTime.of(2020,10, 8,8,10,2);

        System.out.println("expirationDate");
    }
}
