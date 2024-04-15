package home_work_2.loops;
//1.5. Задачи в презентации. На сайте есть пояснения по каждой из этих задач.
// Все задачи в одном классе, в отдельных методах.
//    	1.5.1. Найти наибольшую цифру натурального числа
//    	1.5.2. Вероятность четных случайных чисел
//    	1.5.3. Посчитать четные и нечетные цифры числа
//    	1.5.4. Ряд Фибоначчи
//    	1.5.5. Вывести ряд чисел в диапазоне с шагом
//    	1.5.6. Переворот числа

import java.util.Random;
import java.util.Scanner;

public class OperationOnNumbers {
    public static int maxDigit(int number) {
        int maxDigit = 0;
        int temp;
        do {
            temp = number % 10;
            number = number / 10;
            if (temp > maxDigit) {
                maxDigit = temp;
            }
        } while (number != 0);
        return maxDigit;
    }

    public static int definiteOfProbability(int quantityNum, int maxValue) {
         Random rnd = new Random();
         int temp;
         int count = 0;
         for (int i = 0; i < quantityNum; i++) {
             temp = rnd.nextInt(maxValue);
             if (temp % 2 == 0) {
                 ++count;
             }
         }
        return 100 * count / quantityNum;
     }

    public static String countEvenOdd(int n) {
        int even = 0;
        int odd = 0;
        do {
            if (n % 2 == 0) {
                ++even;
            } else {
                ++odd;
            }
            n = n /10;
        } while (n != 0);
        return "Чётных цифр: " + even + "; " + "Нечётных цифр: " + odd;
    }

    public static void countRowFibonacci() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество элементов ряда Фибоначчи для вывода на экран:");
        int n = scn.nextInt();
        int a, b, c;
        if (n == 1) {
            System.out.println("Первый элемент ряда Фибоначчи это: 0");
        } else {
            a = 0;
            b = 1;
            System.out.print("Первые " + n + " элемента(ов) ряда Фибоначчи это: " + a + " " + b + " ");
            for (int i = 1; i < n - 1; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }
        System.out.println(" ");
    }

    public static void showRowWithStep() {
        String naturalNum1;
        int length;
        char k = 0;
        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите целое положительное число - начало диапазона (минимум):");
            naturalNum1 = scn.nextLine();
            length = naturalNum1.length();
            for (int i = 0; i < length; i++) {
                k = naturalNum1.charAt(i);
                if (!Character.isDigit(k)) {
                    System.out.println("Введены некорректные данные");
                    break;
                }
            }
        } while (!Character.isDigit(k));

        String naturalNum2;
        int length2;
        char k2 = 0;
        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите целое положительное число - конец диапазона (максимум):");
            naturalNum2 = scn.nextLine();
            length2 = naturalNum2.length();
            for (int i = 0; i < length2; i++) {
                k2 = naturalNum2.charAt(i);
                if (!Character.isDigit(k2)) {
                    System.out.println("Введены некорректные данные");
                    break;
                }
            }
        } while (!Character.isDigit(k2));

        String naturalStep;
        int lengthStep;
        char k3 = 0;
        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите целое положительное число - шаг:");
            naturalStep = scn.nextLine();
            lengthStep = naturalStep.length();
            for (int i = 0; i < lengthStep; i++) {
                k3 = naturalStep.charAt(i);
                if (!Character.isDigit(k3)) {
                    System.out.println("Введены некорректные данные");
                    break;
                }
            }
        } while (!Character.isDigit(k3));

        int start = Integer.parseInt(naturalNum1);
        int end = Integer.parseInt(naturalNum2);
        int step = Integer.parseInt(naturalStep);
        System.out.print("Получен ряд чисел: " + start + " ");
        while (start < end) {
            start = start + step;
                System.out.print(start + " ");
        }
        System.out.println(" ");
    }

    public static void turnNumber_1_5_6() {
        String n;
        int length;
        char k = 0;
        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите целое положительное число");
            n = scn.nextLine();
            length = n.length();
            for (int i = 0; i < length; i++) {
                k = n.charAt(i);
                if (!Character.isDigit(k)) {
                    System.out.println("Введены некорректные данные");
                    break;
                }
            }
        } while (!Character.isDigit(k));

        int a = Integer.parseInt(n);
        int turnNum;
        while (a > 0) {
            turnNum = a % 10;
            a = a / 10;
            System.out.print(turnNum);
        }
    }
}



