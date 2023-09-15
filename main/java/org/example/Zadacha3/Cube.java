package org.example.Zadacha3;

/**
 * Класс, представляющий куб.
 */
public class Cube implements ThreeDimensionalShape {
    private int edge;

    /**
     * Создаёт экземпляр куба с заданным ребром
     * @param edge Длина ребра куба
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    /**
     * Метод для вычисления объема куба
     * @return Объем куба
     */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}



//