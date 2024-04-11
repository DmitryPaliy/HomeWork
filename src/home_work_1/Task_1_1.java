package home_work_1;

import java.util.Scanner;

public class Task_1_1 {
    public static void main(String[] args) {
        Scanner numForAnd = new Scanner(System.in); // читает каждое новое введённое пользователем число
        System.out.println("Введите целое число:");
        int a = numForAnd.nextInt(); // например число 53 (0011 0101 в двоичном коде)
        System.out.println(" ");
        System.out.println("Введите второе целое число:");
        int b = numForAnd.nextInt(); // например число 28 (или 0001 1100 в двоичном коде)
        System.out.println("Результат операции:" + a + " & " + b + " = " + (a & b)); // результат применения оператора & к числам 53 и 28

        Scanner numForOr = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int c = numForOr.nextInt(); // например число 53 (или 0011 0101 в двоичном коде)
        System.out.println(" ");
        System.out.println("Введите второе целое число:");
        int d = numForOr.nextInt(); // например число 28 (или 0001 1100 в двоичном коде)
        System.out.println("Результат операции:" + c + " | " + d + " = " + (c | d)); // результат применения оператора | к числам 53 и 28
    }
}
