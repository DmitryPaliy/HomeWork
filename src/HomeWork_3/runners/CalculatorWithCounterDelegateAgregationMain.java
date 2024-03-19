package HomeWork_3.runners;

import HomeWork_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import HomeWork_3.calcs.simple.CalculatorWithMathCopy;

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
