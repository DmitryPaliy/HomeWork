package home_work_2.loops;
//1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
//     Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
//     Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
//1.1.1. Используя только цикл
//1.1.2.* Используя рекурсию
//1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход
// вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое, то выдать сообщение о том что
// пользователь ввёл некорректные данные.
//		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
//		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
//		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
public class MultiplicationNumbers{
    public static String multiplicationNumbersOfRow(int n) {

        if (n < 1 | n > 12) {
           return "Число не входит в требуемый диапазон";
        }

        StringBuilder stringResult = new StringBuilder();
        int result = 1;
        int temp;
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                temp = i + 1;
                result *= (temp + 1);
                stringResult.append(temp).append(" * ");
            } else {
                temp = i + 1;
                stringResult.append(temp).append(" = ");
                stringResult.append(result);
            }
        }
        return stringResult.toString();
    }

    public static String multiplicationNumbersOfAnyRow(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != 46 && str.charAt(i) != 44) {
                return "Введено не число";
            }
            if (str.charAt(i) == 46 || str.charAt(i) == 44) {
                return "Введено не целое число";
            }
        }
        long result = 1;
        int nextNumber;
        StringBuilder stringResult = new StringBuilder();
        for (int j = 0; j < length; j++) {
            nextNumber = Integer.parseInt(String.valueOf(str.charAt(j)));
            result *= nextNumber;
            if (j < (length - 1)) {
                stringResult.append(nextNumber).append(" * ");
            } else {
                stringResult.append(nextNumber).append(" = ");
                stringResult.append(result);
            }
        }
        return stringResult.toString();
    }
}
