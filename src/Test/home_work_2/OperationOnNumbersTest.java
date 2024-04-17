package Test.home_work_2;

import home_work_2.loops.OperationOnNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Integer.MAX_VALUE;

public class OperationOnNumbersTest {
    @Test
    public void maxDigitNegativeNumTest() {
        long number = -9223372036854775808L;
        Assertions.assertEquals(OperationOnNumbers.maxDigit(number), 9);
    }
    @Test
    public void definiteOfProbabilityNegativeQuantityTest() {
        int quantityOfNumbers = -100;;
        int maxValue = 200;
        System.out.println(OperationOnNumbers.definiteOfProbability(quantityOfNumbers, maxValue));
    }
    @Test
    public void definiteOfProbabilityNegativeNumbersTest() {
        int quantityOfNumbers = 100;;
        int maxValue = -200;
        System.out.println(OperationOnNumbers.definiteOfProbability(quantityOfNumbers, maxValue));
    }
    @Test
    public void definiteOfProbabilityNegativeMaxQuantityTest() {
        int maxValue = 200;
        System.out.println(OperationOnNumbers.definiteOfProbability(MAX_VALUE, maxValue));
    }
    @Test
    public void definiteOfProbabilityNegativeMaxValueTest() {
        int quantityOfNumbers = 100;;
        System.out.println(OperationOnNumbers.definiteOfProbability(quantityOfNumbers, MAX_VALUE));
    }
    @Test
    public void countEvenOddResultTest() {
        int number = 123456789;
        Assertions.assertEquals(OperationOnNumbers.countEvenOdd(number),
                "Чётных цифр: " + 4 + "; " + "Нечётных цифр: " + 5);
    }

    @Test
    public void countEvenOddZeroTest() {
        int number = 0;
        Assertions.assertEquals(OperationOnNumbers.countEvenOdd(number),
                "Чётных цифр: " + 1 + "; " + "Нечётных цифр: " + 0);
    }

    @Test
    public void rowFibonacciOverflowTest() {
        System.out.println(OperationOnNumbers.rowFibonacci(MAX_VALUE));
    }
}
