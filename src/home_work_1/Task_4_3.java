package home_work_1;

import java.util.Scanner;

public class Task_4_3 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tОпределение делимости одного числа на другое");
        Scanner num1 = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        int a = num1.nextInt();
        int b = num1.nextInt();
        System.out.println(checkDivisionWhitoutARemainder(a, b));
    }
    public static boolean checkDivisionWhitoutARemainder(int a, int b) {
        if (b == 0) {
            return false;
        }
        return (a % b) == 0 || (b % a) == 0;
    }
}
