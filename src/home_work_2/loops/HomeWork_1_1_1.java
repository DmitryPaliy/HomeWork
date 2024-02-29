package home_work_2.loops;
//1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
//     Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
//     Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
//1.1.1. Используя только цикл
import java.util.Scanner;

public class HomeWork_1_1_1 {
    public static void main(String[] args) {
        int n;
        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите число от 1 до 10");
            n = scn.nextInt();
            if (1 > n | n > 10) {
                System.out.println("Число не входит в требуемый диапазон");
            }
        } while (1 > n | n > 10);

        int[] arr = new int[n];
        arr[0] = 1;
        System.out.print(arr[0] + " * ");
        for (int i = 1; i < n; i++) {
            if (i < (n - 1)) {
                arr[i] = i + 1;
                System.out.print(arr[i] + " * ");
            } else {
                arr[i] = i + 1;
                System.out.print(arr[i] + " = ");
            }
        }

        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }
        System.out.print(product);
    }
}
