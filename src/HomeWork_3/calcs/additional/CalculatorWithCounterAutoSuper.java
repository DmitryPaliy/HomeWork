package HomeWork_3.calcs.additional;

import HomeWork_3.calcs.simple.CalculatorWithMathExtends;

//Создать класс CalculatorWithCounterAutoSuper.
// 6.1 Все методы и поля, объявленные в данном классе НЕ статические - не имеют модификатор static.
//	6.2 Данный класс наследует класс CalculatorWithMathExtends.
//	6.3 Данный класс переопределяет все методы полученные в результате наследования и в этих методах должен
//	быть реализован механизм учёта их использования (учёт общий для всех методов класса), а вместо реализации
//	математики при помощи ключевого слова super вызывает данный метод у родителя. Например вызвали метод plus(7, 3)
//	который должен сложить два числа и вернуть результат сложения. Внутри метода plus() пишем реализацию учета, а
//	после делаем вызов super.plus(7, 3). Использование super позволит вызвать реализацию из родительского класса.
//	6.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований
//	данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
//	6.5 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод). В main методе
//	требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
// Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    long count = 0;
    @Override
    public double toPositive(double anyRealNum) {
        count++;
        return super.toPositive(anyRealNum);
    }

    @Override
    public double squareRoot(double underRoot) {
        count++;
        return super.squareRoot(underRoot);
    }

    @Override
    public double exponentation (double base, int exponent) {
        count++;
        return super.exponentation(base, exponent);
    }

    @Override
    public double division(double dividend, double divisor) {
        count++;
        return super.division(dividend, divisor);
    }

    @Override
    public double multiplication(double multiplicand, double multiplier) {
        count++;
        return super.multiplication(multiplicand, multiplier);
    }

    @Override
    public double subtraction(double minuend, double subtrahend) {
        count++;
        return super.subtraction(minuend, subtrahend);
    }

    @Override
    public double summation(double summand1, double summand2) {
        count++;
        return super.summation(summand1, summand2);
    }

    public long getCountOperation () {
            return count;
    }
}
