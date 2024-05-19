package ru.gb.hw3.task2;

public class RunTask2 {
    public static void runTask2() {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("����", 5000);
        employees[1] = new Employee("����", 6000);
        employees[2] = new Manager("������", 7000);

        System.out.println("�������� ����������� �� ���������: \n");

        for (Employee employee : employees) {
            System.out.println(employee.name + ": " + employee.getSalary());
        }
        System.out.println("�������� ����������� ����� ���������  �� 1000 (������ ��������)\n");

        Manager.raiseSalary(employees);
        for (Employee employee : employees) {
            System.out.println(employee.name + ": " + employee.getSalary());
        }

    }
}
