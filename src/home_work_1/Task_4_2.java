package home_work_1;

import java.util.Scanner;

public class Task_4_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите три числа");
        double a = num.nextInt();
        double b = num.nextInt();
        double c = num.nextInt();
        System.out.println(Task_4_2.averageOfThreeNumber(a, b, c));
    }
    public static String averageOfThreeNumber(double a, double b, double c) {
        if ((a > b && b > c)||(c > b && b > a)) {
            return Double.toString(b);
        }
        if ((b > a && a > c)||(c > a && a > b)) {
            return Double.toString(a);
        }
        if ((b > c && c > a)||(a > c && c > b)) {
            return Double.toString(c);
        }
        return "Нет среднего значения";
    }
}
