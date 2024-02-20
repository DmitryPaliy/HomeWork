package HomeWork1;

import java.util.Scanner;

public class HomeWork_4_2 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tОпределение из трёх чисел среднего по значению");
        Scanner num = new Scanner(System.in);
        System.out.println("Введите три числа, после ввода каждого из них нажмите клавишу \"Enter\":");
        double a = num.nextInt();
        double b = num.nextInt();
        double c = num.nextInt();
        double avg;

        if((a > b && b > c)||(c > b && b > a)) {
            avg = b;
        } else if ((b > a && a > c)||(c > a && a > b)) {
            avg = a;
        } else {
            avg = c;
        }
        System.out.println("Средним по значению из трёх чисел является " + avg);
    }
}
