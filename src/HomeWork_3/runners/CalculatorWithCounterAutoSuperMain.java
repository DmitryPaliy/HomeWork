package HomeWork_3.runners;

//	6.5 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод). В main методе
//	требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
// Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
import HomeWork_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calcCounter = new CalculatorWithCounterAutoSuper();
        double numMultiplication = calcCounter.multiplication(15, 7);
        double numDivision = calcCounter.division(28, 5);
        double numExp = calcCounter.exponentation(numDivision, 2);
        double sum1 = calcCounter.summation(4.1, numMultiplication);
        double sum2 = calcCounter.summation(numExp, sum1);
        System.out.println(sum2);
        System.out.println(calcCounter.getCountOperation());
    }
}
