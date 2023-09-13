package org.example.Zadacha1;

import java.util.Date;

/**
 * Класс, представляющий информацию о сотруднике.
 */
public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    /**
     * Создаёт объект Employee с указанным именем, датой рождения и базовым окладо
     * @param name
     * @param dob
     * @param baseSalary
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    /**
     * Получить информацию о сотруднике.
     *
     * @return Строка с именем и датой рождения сотрудника.
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
