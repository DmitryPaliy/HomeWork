package home_work_2.loops;
//1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число, которое мы
// будем возводить. Второе число это степень в которую возводят первое число. Степень - только положительная
// и целая. Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
//		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
//		1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25

public class ExpOfANumber {
    public static String expNumber(double number, int degree) throws ArithmeticException {
        if (degree < 0) {
            throw new ArithmeticException ("Не умею возводить числа в отрицательную степень");
        }
        double temp = 1;
        for (int i = 0; i < degree; i++) {
            temp *= number;
            if(temp == Double.POSITIVE_INFINITY ) {
                throw new ArithmeticException("Слишком большое число");
            } else if(temp == Double.NEGATIVE_INFINITY) {
                throw new ArithmeticException("Слишком маленькое число");
            }
        }
        String result = String.format("%.2f", temp);
        return number + " ^ " + degree + " = " + result;
    }
}
