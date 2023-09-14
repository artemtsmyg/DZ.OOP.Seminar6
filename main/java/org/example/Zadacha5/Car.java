package org.example.Zadacha5;

//5) Переписать код в соответствии с Dependency Inversion Principle:
//public class Car {
//    private PetrolEngine engine;
//    public Car(PetrolEngine engine) {
//        this.engine = engine;
//    }
//    public void start() {
//        this.engine.start();
//    }
//}
//public class PetrolEngine {
//    public void start() {
//    }
//}
//    Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.
//
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
