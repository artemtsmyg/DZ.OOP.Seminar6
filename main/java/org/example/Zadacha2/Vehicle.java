package org.example.Zadacha2;

/**
 * Базовый класс для всех видов транспортных средств.
 */
public class Vehicle {
    private int maxSpeed;
    private String type;

    /**
     * Создаёт новый объект транспортного средства с заданной максимальной скоростью и типом
     * @param maxSpeed
     * @param type
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /**
     * Геттеры и сеттеры которые возвращают максимальную скорость и тип
     * @return
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getType() {
        return type;
    }
}




