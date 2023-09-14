package org.example.Zadacha4;

//4) Переписать код в соответствии с Liskov Substitution Principle:
//public class Rectangle {
//    private int width;
//    private int height;
//    public void setWidth(int width) {
//        this.width = width;
//    }
//    public void setHeight(int height) {
//        this.height = height;
//    }
//    public int area() {
//        return this.width * this.height;
//    }
//}
//public class Square extends Rectangle {
//    @Override
//    public void setWidth(int width) {
//        super.width = width;
//        super.height = width;
//    }
//    @Override
//    public void setHeight(int height) {
//        super.width = height;
//        super.height = height;
//    }
//}
//​

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
