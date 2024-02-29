package home_work_2.loops;
//1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число, которое мы
// будем возводить. Второе число это степень в которую возводят первое число. Степень - только положительная
// и целая. Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
//		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
//		1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
import java.util.Scanner;

public class HomeWork_1_3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите вещественное число для возведения в степень:");
        double doubleNum = scn.nextDouble();
        System.out.println("Введите положительное целое число - показатель степени:");
        int degree = scn.nextInt();

        double exp = 1;
        double[] doubleArray = new double[degree];
        for (int i = 0; i < degree; i++) {
            doubleArray[i] = doubleNum;
            exp *= doubleArray[i];
        }
        String result = String.format("%.2f",exp);
        System.out.println(doubleNum + " ^ " + degree + " = " + result);
    }
}
