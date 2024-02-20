package home_work_1;

import java.util.Scanner;

public class HomeWork_4_6 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tОпределение високосного года");
        Scanner num4 = new Scanner(System.in);
        System.out.println("Введите год и нажмите клавишу \"Enter\":");
        int a = num4.nextInt();

        if ((a % 4) == 0){
            System.out.println("Год " + a + " - високосный");
        } else {
            System.out.println("Этот год не високосный");
        }
    }
}
