package ru.gb.hw3;
import ru.gb.hw3.task1.RunTask1;
import ru.gb.hw3.task2.RunTask2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������� ����� ������, ���������� ������� ������ ���������� 1 ��� 2: ");
        int number = 0;
        try {
            number = Integer.parseInt(scanner.next());
        }catch (NumberFormatException e){
            System.out.println("�� ����� �� �����!");
        }
        switch (number){
            case 1:
                System.out.println("�������� �������� ����������� - ����� ������ ������ ����������, \n" +
                        "������������ ��� ����, �������������� � ���� ��� ����� ����-��-��, \n" +
                        "��� ������������� ��������� ���������.\n");
                RunTask1.runTask1();
                break;
            case 2:
                System.out.println("������� ����� ������������, ��������� �� ����������. ���������� \n" +
                        " ����������� ����� ��������� �������� � ����� ������������, ������������� \n" +
                        " ����� ����� �������, ����� �� ��� ������� ���������� ����� ����, ����� �������������.\n" +
                        " � �������� ��������� �������� ������������ � ��������� ��� � ����� ������ �����������.\n" +
                        " �������� �������� ���� ����������� � ����������, ����� �������� ������������ �� ����������.\n");
                RunTask2.runTask2();
                break;
            default:
                System.out.println("������ � ����� ������� ��� � ������!");
        }



    }
}
