package Test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Task_7.createPhoneNumber;
import static home_work_1.Task_7.incorrect;

public class Task_7Test {
    @Test
    public void passedLargeArray() {
        int[] a = new int[11];
        Assertions.assertEquals(createPhoneNumber(a), incorrect());
    }
    @Test
    public void passedSmallArray() {
        int[] a = new int[9];
        Assertions.assertEquals(createPhoneNumber(a), incorrect());
    }
    @Test
    public  void passedNull() {
        Assertions.assertEquals(createPhoneNumber(null), incorrect());
    }
    @Test
    public void passedArrayWithNegativeNumbers() {
        int[] a = {1, 2, 3, 4, 5, -6, 7, 8, -9, 0};
        Assertions.assertEquals(createPhoneNumber(a), incorrect());
    }
}
