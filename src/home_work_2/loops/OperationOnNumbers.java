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

    public static String countRowFibonacci(int countElementsOfRow) {
        int a = 0, b = 1, c;
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < countElementsOfRow; i++) {
            if (i == 0) {
                row.append(a).append(" ");
            } else if (i == 1) {
                row.append(b).append(" ");
            }else {
                c = a + b;
                a = b;
                b = c;
                row.append(c).append(" ");
            }
        }
        return row.toString();
    }

    public static String rowWithStep(int start, int end, int step) {
        StringBuilder stringRow = new StringBuilder();
        while (start < end) {
            start = start + step;
                stringRow.append(start).append(" ");
        }
        return stringRow.toString();
    }

    public static int turnNumber(int a) {
        int turnNum = 0;
        while (a > 0) {
            turnNum = a % 10;
            a = a / 10;
        }
        return turnNum;
    }
}



