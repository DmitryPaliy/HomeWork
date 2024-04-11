package home_work_1;

import java.util.Scanner;

public class Task_4_5 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tОпределение символ, буква или цифра");
        Scanner num3 = new Scanner(System.in);
        System.out.println("Введите целое число от 0 до 127, после ввода нажмите клавишу \"Enter\":");
        int a = num3.nextInt();

        if((a >= 65 && a <= 90)||(a >= 97 && a <= 122)) {
            System.out.println("порядковый номер " + a + " в таблице ASCII соответствует букве английского алфавита");
        } else if ((a >= 30 && a <= 39)) {
            System.out.println("порядковый номер " + a + " в таблице ASCII соответствует цифре");
        } else {
            System.out.println("порядковый номер " + a + " в таблице ASCII соответствует символу");
        }
    }
}
