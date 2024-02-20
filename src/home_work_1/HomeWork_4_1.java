package home_work_1;

import java.util.Scanner;

public class HomeWork_4_1 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tОпределение чётности или нечётности числа");
        Scanner num = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int a = num.nextInt();
        if ((a % 2) == 0){
            System.out.println("Число " + a + " четное ");
        } else {
            System.out.println("Число " + a + " нечетное ");
        }
    }
}
