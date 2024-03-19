package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

//7.7 Создать класс CalculatorWithCounterDelegateCompositeMain в котором будет точка входа (main метод). В main
//	методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения
//	из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
//	(4.1 + 15 * 7 + (28 / 5) ^ 2)
public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calcComposite = new CalculatorWithCounterAutoComposite();
        double numMultiplication = calcComposite.multiplicationComposite(15, 7);
        double numDivision = calcComposite.divisionComposite(28,5);
        double numExp = calcComposite.exponentationComposite(numDivision, 2);
        double sum1 = calcComposite.summationComposite(4.1, numMultiplication);
        double sum2 = calcComposite.summationComposite(numExp, sum1);
        System.out.println(sum2);
        System.out.println(calcComposite.getCountOperation());
    }
}
