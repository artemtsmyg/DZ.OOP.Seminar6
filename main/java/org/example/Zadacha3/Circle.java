package org.example.Zadacha3;

/**
 * Класс, представляющий круг.
 */
public class Circle implements TwoDimensionalShape {
    /**
     * Радиус окружности
     */
    private double radius;

    /**
     * Создаёт объект Circle с заданным радиусом
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Вычисляет и возвращает площадь окружности
     * @return
     */
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}