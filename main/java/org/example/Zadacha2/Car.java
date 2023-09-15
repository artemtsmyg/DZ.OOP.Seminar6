package org.example.Zadacha2;

/**
 * Класс, представляющий автомобиль, наследник класса Vehicle.
 */
public class Car extends Vehicle {
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    /**
     * Рассчитывает разрешенную скорость для автомобиля.
     *
     * @return разрешенная скорость для автомобиля
     */
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}




//
