package home_work_1;

import java.util.Scanner;

public class HomeWork_4_3 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tОпределение делимости одного числа на другое");
        Scanner num1 = new Scanner(System.in);
        System.out.println("Введите два целых числа, после ввода каждого из них нажмите клавишу \"Enter\":");
        int a = num1.nextInt();
        int b = num1.nextInt();

        if ((a % b) == 0 || (b % a) == 0){
            System.out.println("Числа " + a + " и " + b + " делятся нацело без остатка");
        }
        else {
            System.out.println("Числа " + a + " и " + b + " не делятся нацело без остатка");
        }
    }
}
