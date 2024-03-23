package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

//2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод).
// В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
// посчитать выражения из задания 1. Вывести в консоль результат. (4.1 + 15 * 7 + (28 / 5) ^ 2)
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calcOperator = new CalculatorWithOperator();
        double operMultiplication = calcOperator.multiplication(15, 7);
        double operDivision = calcOperator.division(28, 5);
        double operExp = calcOperator.exponentation(operDivision, 2);
        System.out.println(calcOperator.summation(operExp, (calcOperator.summation(4.1, operMultiplication))));
    }
}
