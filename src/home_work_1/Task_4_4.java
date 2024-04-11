package home_work_1;

import java.util.Scanner;

public class Task_4_4 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tПеревод байтов в килобайты");
        Scanner num2 = new Scanner(System.in);
        System.out.println("Введите число для перевода, после ввода нажмите клавишу \"Enter\":");
        double bytes = num2.nextInt();
        double kbytes = bytes / 1024;
        System.out.println(bytes + " B = " + kbytes + " KB");
    }
}