package home_work_3.runners;
import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

//9.7 Создать класс CalculatorWithCounterDelegateChoiceAgregationMain в котором будет точка входа
//	(main метод). В main методе требуется:
//		9.7.1 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithOperator и
//		используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты
//		посчитанных выражений и результат метода getCountOperation().
//		9.7.2 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathCopy и
//		используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты
//		посчитанных выражений и результат метода getCountOperation().
//		9.7.3 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathExtends
//		и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль
//		результаты посчитанных выражений и результат метода getCountOperation().
public class CalculatorWithCounterDelegateChoiceAgregationMain {

    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAgregation calcWithOperator = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        double numMultiplication = calcWithOperator.multiplicationChoice(15, 7);
        double numDivision = calcWithOperator.divisionChoice(28,5);
        double numExp = calcWithOperator.exponentationChoice(numDivision, 2);
        double sum1 = calcWithOperator.summationChoice(4.1, numMultiplication);
        double sum2 = calcWithOperator.summationChoice(numExp, sum1);
        System.out.println(sum2);
        System.out.println(calcWithOperator.getCountOperation());

        CalculatorWithCounterAutoChoiceAgregation calcWithMathCopy = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        double multiplicationMath = calcWithMathCopy.multiplicationChoice(15, 7);
        double divisionMath = calcWithMathCopy.divisionChoice(28,5);
        double exp = calcWithMathCopy.exponentationChoice(divisionMath, 2);
        double sumMath = calcWithMathCopy.summationChoice(4.1, multiplicationMath);
        double sum2Math = calcWithMathCopy.summationChoice(exp, sumMath);
        System.out.println(sum2Math);
        System.out.println(calcWithMathCopy.getCountOperation());

        CalculatorWithCounterAutoChoiceAgregation calcWithExtends = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        double multiplicationExtends = calcWithExtends.multiplicationChoice(15, 7);
        double divisionExtends = calcWithExtends.divisionChoice(28,5);
        double expExtends = calcWithExtends.exponentationChoice(divisionExtends, 2);
        double sumExtends = calcWithExtends.summationChoice(4.1, multiplicationExtends);
        double sum2Extends = calcWithExtends.summationChoice(expExtends, sumExtends);
        System.out.println(sum2Extends);
        System.out.println(calcWithMathCopy.getCountOperation());
    }
}
