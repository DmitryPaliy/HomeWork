package home_work_2.loops;
//1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
//     Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
//     Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
//1.1.1. Используя только цикл
//1.1.2.* Используя рекурсию

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
}
