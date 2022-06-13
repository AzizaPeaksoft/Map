package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Car, Cardannye> cars = new HashMap();
        Car car = new Car(1, "A4245");
        Car car1 = new Car(2, "B3241");
        Car car2 = new Car(3, "C8564");

        Cardannye cardannye = new Cardannye(2021, "lexus", 30000, "white");
        Cardannye cardannye1 = new Cardannye(2018, "Toyota", 40000, "black");
        Cardannye cardannye2 = new Cardannye(2022, "BMW", 50000, "red");

        cars.put(car, cardannye);
        cars.put(car1, cardannye1);
        cars.put(car2, cardannye2);

        for (Map.Entry<Car, Cardannye> s : cars.entrySet()) {
            System.out.println(s);
        }
    }
}
