package ru.gb.hw3.task2;

public class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    static void raiseSalary(Employee[] employees) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.salary += 1000;
            }
        }
    }
}
