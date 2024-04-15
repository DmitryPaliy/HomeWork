package Test.home_work_2;

import home_work_2.loops.ExpOfANumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExpOfANumberTest {
    @Test
    public void addNegativeDegree() {
        double a = 10.0;
        int b = -5;
         Assertions.assertEquals(ExpOfANumber.expNumber(a, b), "Не умею возводить числа в отрицательную степень");
    }
    @Test
    public void checkResult() {
        double a = 7.5;
        int b = 2;
        Assertions.assertEquals(ExpOfANumber.expNumber(a, b), "7.5 ^ 2 = 56,25");
    }
    @Test
    public void overflowMin() {
        double a = -0.0000000000000000001;
        int b = 2;
        Assertions.assertEquals(ExpOfANumber.expNumber(a, b),
                "Не могу отобразить результат. Слишком большое или слишком маленькое число.");
    }
    @Test
    public void overflowMax() {
        double a = 10;
        int b = 309;
        Assertions.assertEquals(ExpOfANumber.expNumber(a, b),
                "Не могу отобразить результат. Слишком большое или слишком маленькое число.");
    }
}
