package ru.gb.hw3.task2;

public class RunTask2 {
    public static void runTask2() {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Иван", 5000);
        employees[1] = new Employee("Анна", 6000);
        employees[2] = new Manager("Сергей", 7000);

        System.out.println("Зарплата сотрудников до повышения: \n");

        for (Employee employee : employees) {
            System.out.println(employee.name + ": " + employee.getSalary());
        }
        System.out.println("Зарплата сотрудников после повышения  на 1000 (Сергей менеджер)\n");

        Manager.raiseSalary(employees);
        for (Employee employee : employees) {
            System.out.println(employee.name + ": " + employee.getSalary());
        }

    }
}
