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
        System.out.println("Введите номер:");
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
        System.out.println("Введите числа:");
        try {
            String numbers = console.nextLine();
            int[] number = new int[numbers.length()];
            for (int i = 0; i < numbers.length(); i++) {
                number[i] = Integer.parseInt(numbers.substring(i, i + 1));
                if (number[i] == 3) {
                    System.out.print(number[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Введено некорректное значение!");
        }
    }
}