package Test.home_work_1;

import home_work_1.Task_4_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_4_3Test {
    @Test
    public void divisionWithRemainder() {
        int a = 3;
        int b = 2;
        Assertions.assertFalse(Task_4_3.checkDivisionWhitoutARemainder(a, b));
    }
}
