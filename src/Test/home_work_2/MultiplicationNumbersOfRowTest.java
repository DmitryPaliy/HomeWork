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
}
