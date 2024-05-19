package ru.gb.hw3;
import ru.gb.hw3.task1.RunTask1;
import ru.gb.hw3.task2.RunTask2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер задачи, выполнение которой хотите посмотреть 1 или 2: ");
        int number = 0;
        try {
            number = Integer.parseInt(scanner.next());
        }catch (NumberFormatException e){
            System.out.println("Вы ввели не число!");
        }
        switch (number){
            case 1:
                System.out.println("Написать прототип компаратора - метод внутри класса сотрудника, \n" +
                        "сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд, \n" +
                        "без использования условного оператора.\n");
                RunTask1.runTask1();
                break;
            case 2:
                System.out.println("Опишите класс руководителя, наследник от сотрудника. Перенесите \n" +
                        " статический метод повышения зарплаты в класс руководителя, модифицируйте \n" +
                        " метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.\n" +
                        " В основной программе создайте руководителя и поместите его в общий массив сотрудников.\n" +
                        " Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.\n");
                RunTask2.runTask2();
                break;
            default:
                System.out.println("Задачи с таким номером нет в списке!");
        }



    }
}
