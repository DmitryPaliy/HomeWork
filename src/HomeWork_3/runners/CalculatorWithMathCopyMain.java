package HomeWork_3.runners;
// 3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод). В main методе требуется
// создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
// (4.1 + 15 * 7 + (28 / 5) ^ 2)
// Вывести в консоль результат.

import HomeWork_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        double numMultiplication = calc.multiplication(15, 7);
        double numDivision = calc.division(28, 5);
        double numExp = calc.exponentation(numDivision, 2);
        System.out.println(calc.summation((calc.summation(4.1, numMultiplication)), numExp));
    }
}
