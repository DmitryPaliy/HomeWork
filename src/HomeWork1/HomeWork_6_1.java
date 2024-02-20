package HomeWork1;

import java.util.Scanner;

public class HomeWork_6_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Напишите своё имя и нажмите клавишу \"Enter\":");
        String userName = scn.nextLine();
        String vasia = "Вася";
        String nastia = "Анастасия";

        if (vasia.equalsIgnoreCase(userName)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал.");
        }
        if (nastia.equalsIgnoreCase(userName)) {
            System.out.println("Я тебя так долго ждал.");
        }
        if ((vasia.equalsIgnoreCase(userName)) == (nastia.equalsIgnoreCase(userName))) {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
