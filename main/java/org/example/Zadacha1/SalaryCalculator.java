package org.example.Zadacha1;

/**
 * Класс для расчета чистой заработной платы сотрудника.
 */
public class SalaryCalculator {
    /**
     * Рассчитать чистую заработную плату сотрудника.
     *
     * @param baseSalary Базовая зарплата сотрудника.
     * @return Чистая заработная плата после вычета налога.
     */
    public int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25); // Здесь можно использовать другую логику для расчета налога.
        return baseSalary - tax;
    }
}