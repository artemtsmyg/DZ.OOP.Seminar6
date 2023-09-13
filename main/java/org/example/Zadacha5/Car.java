package org.example.Zadacha5;

/**
 * Класс, представляющий машину.
 */
public class Car {
    private Engine engine;

    /**
     * Конструктор класса Car, принимающий экземпляр объекта, реализующего интерфейс Engine.
     * Это позволяет передавать разные типы двигателей (PetrolEngine, DieselEngine и т. д.).
     *
     * @param engine Экземпляр объекта, реализующего интерфейс Engine.
     */
    public Car(Engine engine) {
        this.engine = engine;
    }

    /**
     * Метод для запуска машины.
     */
    public void start() {
        this.engine.start();
    }
}
