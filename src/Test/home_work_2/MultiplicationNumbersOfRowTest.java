package Test.home_work_2;

import home_work_2.loops.MultiplicationNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicationNumbersOfRowTest {
    @Test
    public void checkResult() {
        int toNumber = 5;
        int fromNumber = 1;
        for (int i = 1; i < toNumber; i++) {
            fromNumber = fromNumber * (i + 1);
        }
        String result = "1 * 2 * 3 * 4 * 5 = " + fromNumber;
        Assertions.assertEquals(MultiplicationNumbers.multiplicationNumbersOfRow(toNumber), result);
    }

    @Test
    public void passLessThenOne() {
        int toNumber = 0;
        MultiplicationNumbers.multiplicationNumbersOfRow(toNumber);
    }

    @Test
    public void overflow() {
        int toNumber = 1_000_000_000;
        MultiplicationNumbers.multiplicationNumbersOfRow(toNumber);
    }
    @Test
    public void addDouble() {
        String str = "99.2";
        MultiplicationNumbers.multiplicationNumbersOfAnyRow(str);
    }
    @Test
    public void checkResultAnyRow() {
        int number = 181232375;
        long result = 1;
        int nextNumber;
        for (int j = 0; j < 9; j++) {
            nextNumber = number % 10;
            number = number / 10;
            result *= nextNumber;
        }
        String stringResult = "1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = " + result;
        Assertions.assertEquals(MultiplicationNumbers.multiplicationNumbersOfAnyRow("181232375"), stringResult);
    }
    @Test
    public void AddNotNumber() {
        String str = "Привет";
        MultiplicationNumbers.multiplicationNumbersOfAnyRow(str);
    }
}
