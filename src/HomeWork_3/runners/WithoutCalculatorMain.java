package HomeWork_3.runners;
//1. Создать класс WithoutCalculatorMain в котором необходимо посчитать следующие выражения:
//	1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль.
public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double result;
        double power = Math.pow(28.0 / 5.0, 2); //результат: 31,36
        result = 4.1 + 15 * 7 + power; //результат: 140.45999999999998
        System.out.println(result);
    }
}
