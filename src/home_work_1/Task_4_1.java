package home_work_1;

import java.util.Scanner;

public class Task_4_1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = num.nextInt();
        System.out.println("Число " + a + evenNumOddNum(a));
    }
    public static String evenNumOddNum(int a) {
        if ((a % 2) == 0) {
            return " четное ";
        }
        return " нечетное ";
    }
}
