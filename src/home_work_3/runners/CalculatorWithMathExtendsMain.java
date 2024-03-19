package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

// 4.4 Создать класс CalculatorWithMathExtendsMain в котором будет точка входа (main метод). В main методе требуется
// создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести
// в консоль результат (4.1 + 15 * 7 + (28 / 5) ^ 2).
public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calcWithExtends = new CalculatorWithMathExtends();
        double numMultiplication = calcWithExtends.multiplication(15, 7);
        double numDivision = calcWithExtends.division(28, 5);
        double numExp = calcWithExtends.exponentation(numDivision, 2);
        System.out.println(calcWithExtends.summation((calcWithExtends.summation(4.1, numMultiplication)), numExp));
    }
}
