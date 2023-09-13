package org.example;

import org.example.Zadacha5.Car;
import org.example.Zadacha5.DieselEngine;
import org.example.Zadacha5.Engine;
import org.example.Zadacha5.PetrolEngine;

public class App {
    public static void main(String[] args) {
/**
 * Создаём машину с бензиновым двигателем
 */
        Engine petrolEngine = new PetrolEngine();
        Car carWithPetrolEngine = new Car(petrolEngine);

        /**
         * Создаём машину с дизельным двигателем
         */
        Engine dieselEngine = new DieselEngine();
        Car carWithDieselEngine = new Car(dieselEngine);

        /**
         * Запускаем машины
         */
        carWithPetrolEngine.start();
        carWithDieselEngine.start();
    }
}