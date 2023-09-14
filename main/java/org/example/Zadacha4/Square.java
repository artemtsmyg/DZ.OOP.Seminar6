package org.example.Zadacha4;

/**
 * Класс, представляющий квадрат, который является подклассом прямоугольника.
 */
public class Square extends Rectangle {
    /**
     * Установить ширину квадрата. При этом, как квадрат, устанавливается и высота.
     *
     * @param width Ширина квадрата.
     */
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    /**
     * Установить высоту квадрата. При этом, как квадрат, устанавливается и ширина.
     *
     * @param height Высота квадрата.
     */
    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}





