package home_work_1;

import java.util.Scanner;

public class HomeWork_6_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Напишите своё имя с большой буквы и нажмите клавишу \"Enter\":");
        String userName = scn.nextLine();

        switch (userName) {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал.");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал.");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
