package Test.home_work_1;

import home_work_1.Task_4_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_4_2Test {
    @Test
    public void inputSameNumbers() {
        double a = 0;
        double b = 0;
        double c = 0;
        Assertions.assertEquals(Task_4_2.averageOfThreeNumber(a, b, c), "Нет среднего значения");
    }
    @Test
    public void inputTwoSameNumbers() {
        double a = 0;
        double b = 0;
        double c = 1;
        Assertions.assertEquals(Task_4_2.averageOfThreeNumber(a, b, c), "Нет среднего значения");
    }
}
