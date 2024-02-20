package HomeWork1;

import java.util.Scanner;

public class HomeWork_1_3 {
    public static void main(String[] args) {
        double a = 42.5;
        double b = 37.5;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tВычисления с применением оператора \"И\"");
        Scanner numForAnd = new Scanner(System.in);
        System.out.println("Введите целое число:");
        a = numForAnd.nextInt();
        System.out.println(" ");
        System.out.println("Введите второе целое число:");
        b = numForAnd.nextInt();
        //System.out.println("Результат операции:" + a + " & " + b + " = " + (a & b)); //оператор & не может применяться с типом переменных double
    }
}
