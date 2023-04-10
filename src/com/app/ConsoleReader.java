package com.app;

import java.util.Scanner;

public class ConsoleReader {

    public void getName() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя:");
        try {
            if (console.nextLine().equalsIgnoreCase("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("Нет такого имени");
            }
        } catch (Exception e) {
            System.out.println("Введено некорректное значение!");
        }
    }

    public void getNumber() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число:");
        try {
            if (console.nextInt() > 7) {
                System.out.println("Привет");
            }
        } catch (Exception e) {
            System.out.println("Введено некорректное значение!");
        }
    }

    public void getArray() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите числа через запятую:");
        try {
            String numbers = console.nextLine();
            String[] num = numbers.split(",");
            int[] number = new int[num.length];
            for (int i = 0; i < number.length; i++) {
                number[i] = Integer.parseInt(num[i]);
                if (number[i] % 3 == 0) {
                    System.out.println(number[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Введено некорректное значение!");
        }
    }
}