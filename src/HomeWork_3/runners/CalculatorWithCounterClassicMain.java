package HomeWork_3.runners;

import HomeWork_3.calcs.additional.CalculatorWithCounterClassic;

// 5.5 Создать класс CalculatorWithCounterClassicMain в котором будет точка входа (main метод). В main методе
// требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из
// задания 1, при каждой математической операции самостоятельно вызывать метод incrementCountOperation() для
// увеличения счётчика. Вывести в консоль результат. (4.1 + 15 * 7 + (28 / 5) ^ 2)
public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calcCounter = new CalculatorWithCounterClassic();
        double numMultiplication = calcCounter.multiplication(15, 7);
        calcCounter.incrementCountOperation();
        double numDivision = calcCounter.division(28, 5);
        calcCounter.incrementCountOperation();
        double numExp = calcCounter.exponentation(numDivision, 2);
        calcCounter.incrementCountOperation();
        double sum1 = calcCounter.summation(4.1, numMultiplication);
        calcCounter.incrementCountOperation();
        double sum2 = calcCounter.summation(numExp, sum1);
        calcCounter.incrementCountOperation();
        System.out.println(sum2);
        System.out.println(calcCounter.getCountOperation());
    }
}
