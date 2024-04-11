package Test.home_work_1;

import home_work_1.Task_4_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_4_1Test {
    @Test
    public void inputZero() {
        int a = 0;
        Assertions.assertEquals(Task_4_1.evenNumOddNum(a), " четное ");
    }
}
