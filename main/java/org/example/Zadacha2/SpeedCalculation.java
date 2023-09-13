package org.example.Zadacha2;

/**
 * Класс, рассчитывающий разрешенную скорость для различных видов транспортных средств.
 */
class SpeedCalculation {
    /**
     * Рассчитывает разрешенную скорость для заданного транспортного средства.
     *
     * @param vehicle транспортное средство
     * @return разрешенная скорость
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed();
    }
}