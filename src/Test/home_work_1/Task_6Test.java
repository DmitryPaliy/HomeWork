package Test.home_work_1;

import home_work_1.Task_6_1;
import home_work_1.Task_6_2;
import home_work_1.Task_6_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_6Test {
    @Test
    public void velcomeRun6_1() {
        Task_6_1 a = new Task_6_1();
        Assertions.assertEquals(a.welcom("Вася"), "Привет!/n" + "Я тебя так долго ждал.");
        Assertions.assertEquals(a.welcom("Анастасия"), "Я тебя так долго ждал.");
        Assertions.assertEquals(a.welcom("Иван"), "Добрый день, а вы кто?");
    }

    @Test
    public void velcomeRun6_2() {
        Task_6_2 a = new Task_6_2();
        Assertions.assertEquals(a.welcom("Вася"), "Привет!/n" + "Я тебя так долго ждал.");
        Assertions.assertEquals(a.welcom("Анастасия"), "Я тебя так долго ждал.");
        Assertions.assertEquals(a.welcom("Иван"), "Добрый день, а вы кто?");
    }

    @Test
    public void velcomeRun6_3() {
        Task_6_3 a = new Task_6_3();
        Assertions.assertEquals(a.welcom("Вася"), "Привет!/n" + "Я тебя так долго ждал.");
        Assertions.assertEquals(a.welcom("Анастасия"), "Я тебя так долго ждал.");
        Assertions.assertEquals(a.welcom("Иван"), "Добрый день, а вы кто?");
    }
}
