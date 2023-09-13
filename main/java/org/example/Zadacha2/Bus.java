package org.example.Zadacha2;

/**
 * Класс, представляющий автобус, наследник класса Vehicle.
 */
public class Bus extends Vehicle {
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    /**
     * Рассчитывает разрешенную скорость для автобуса.
     *
     * @return разрешенная скорость для автобуса
     */
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}
