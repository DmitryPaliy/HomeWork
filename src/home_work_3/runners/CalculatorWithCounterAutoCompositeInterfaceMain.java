package home_work_3.runners;
//11.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод).
//	В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать
//	выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface agregationInterface = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        double numMultiplication = agregationInterface.multiplication(15, 7);
        double numDivision = agregationInterface.division(28, 5);
        double numExp = agregationInterface.exponentation(numDivision, 2);
        double sum1 = agregationInterface.summation(4.1, numMultiplication);
        double sum2 = agregationInterface.summation(numExp, sum1);
        System.out.println(sum2);
        System.out.println(agregationInterface.getCountOperation());
    }
}
