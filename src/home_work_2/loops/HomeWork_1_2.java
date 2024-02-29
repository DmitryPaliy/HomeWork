package home_work_2.loops;
//1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход
// вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое, то выдать сообщение о том что
// пользователь ввёл некорректные данные.
//		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
//		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
//		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
import java.util.Scanner;

public class HomeWork_1_2 {

    public static void main(String[] args) {
        String n;
        int length;
        char k = 0;
        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите целое число");
            n = scn.nextLine();
            length = n.length();
            for (int i = 0; i < length; i++) {
                k = n.charAt(i);
                if (!Character.isDigit(k) && k != 46 && k != 44) {
                    System.out.println("Введено не число");
                    break;
                }
                if (k == 46 || k == 44) {
                    System.out.println("Введено не целое число");
                    break;
                }
            }
        } while (!Character.isDigit(k));

        char[] charArray = n.toCharArray();
        int[] intArray = new int [length];
        for (int j = 0; j < length; j++) {
            intArray[j] = Integer.parseInt(String.valueOf(charArray[j]));
        }

        for (int j = 0; j < length; j++) {
            if (j < (length - 1)) {
                System.out.print(intArray[j] + " * ");
            } else {
                System.out.print(intArray[j] + " = ");
            }
        }

        long product = 1;
        for (int i = 0; i < length; i++) {
            product *= intArray[i];
        }
        System.out.print(product);
    }
}
