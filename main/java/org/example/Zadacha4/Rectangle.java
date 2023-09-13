package org.example.Zadacha4;

/**
 * Базовый класс, представляющий прямоугольник.
 */
public class Rectangle {
    private int width;
    private int height;

    /**
     * Установить ширину прямоугольника.
     *
     * @param width Ширина прямоугольника.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Установить высоту прямоугольника.
     *
     * @param height Высота прямоугольника.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Вычислить площадь прямоугольника.
     *
     * @return Площадь прямоугольника.
     */
    public int area() {
        return this.width * this.height;
    }
}
