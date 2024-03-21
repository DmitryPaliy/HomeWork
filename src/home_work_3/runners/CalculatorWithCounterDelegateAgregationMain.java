package home_work_3.runners;
//8.7 Создать класс CalculatorWithCounterDelegateAgregationMain в котором будет точка входа (main метод). В main
//	методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из
//	задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregation calc2 = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        double numMultiplication = calc2.multiplicationAgregation(15, 7);
        double numDivision = calc2.divisionAgregation(28, 5);
        double numExp = calc2.exponentationAgregation(numDivision, 2);
        double sum1 = calc2.summationAgregation(4.1, numMultiplication);
        double sum2 = calc2.summationAgregation(numExp, sum1);
        System.out.println(sum2);
        System.out.println(calc2.getCountOperation());
    }
}
