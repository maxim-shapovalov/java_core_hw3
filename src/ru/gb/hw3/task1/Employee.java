package ru.gb.hw3.task1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Employee {
    private  String date(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дату в формате гггг-мм-дд: ");
        String date = scan.next();

        return date;
    }
    public int compareTo(){
        boolean input;
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.now();
        do {
            input = true;
            String date = date();
            String []d1 = date.split("-");
            date = date();
            String []d2 = date.split("-");
            try {
                int year1 = Integer.parseInt(d1[0]);
                int year2 = Integer.parseInt(d2[0]);
                int month1 = Integer.parseInt(d1[1]);
                int month2 = Integer.parseInt(d2[1]);
                int day1 = Integer.parseInt(d1[2]);
                int day2 = Integer.parseInt(d2[2]);
                ld1 = LocalDate.of(year1,month1,day1);
                ld2 = LocalDate.of(year2,month2,day2);

            } catch (NumberFormatException | ArrayIndexOutOfBoundsException | DateTimeException e) {
                System.out.println("Неверный формат даты, попробуйте еще раз!");
                input = false;
            }
        } while (!input);

        // Сравниваем даты. Можно также использовать:
        // return Integer.signum(ld1.compareTo(ld2));

        int compareYears = (int) Math.signum(ld1.getYear() - ld2.getYear());
        int compareMonth = (int) Math.signum(ld1.getMonthValue() -ld2.getMonthValue());
        int compareDay = (int) Math.signum(ld1.getDayOfMonth() - ld2.getDayOfMonth());
        return compareYears != 0 ? compareYears : (compareMonth != 0 ? compareMonth : compareDay);
    }
}
