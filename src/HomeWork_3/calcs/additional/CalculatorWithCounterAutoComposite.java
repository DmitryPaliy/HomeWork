package HomeWork_3.calcs.additional;

import HomeWork_3.calcs.simple.CalculatorWithMathCopy;

// 7. Создать класс CalculatorWithCounterAutoComposite.
//	7.1 Все методы и поля, объявленные в данном классе НЕ статические - не имеют модификатор static.
//	7.2 Внутри класса мы должны создавать поле, хранящее объект класса калькулятор. Для примера можно использовать любой
//	тип калькулятора. Я возьму для примера CalculatorWithMathCopy
//	7.3 Инициализировать данное поле созданным (использовать new) внутри данного класса объектом калькулятора.
//	7.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору который
//	сохранён в его поле.
//	7.5 В классах должны присутствовать математические методы:
//		7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//	7.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного
//	калькулятора. При вызове данного метода счётчик учёта не увеличивается.

public class CalculatorWithCounterAutoComposite{
    private long count = 0;
    private CalculatorWithMathCopy calcAutoComposite;
    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calcAutoComposite) {
        this.calcAutoComposite = calcAutoComposite;
    }
    public double divisionComposite(double dividend, double divisor) {
        count++;
        return calcAutoComposite.division(dividend, divisor);
    }
    public double multiplicationComposite(double multiplicand, double multiplier) {
        count++;
        return calcAutoComposite.multiplication(multiplicand, multiplier);
    }

    public double subtractionComposite(double minuend, double subtrahend) {
        count++;
        return calcAutoComposite.subtraction(minuend, subtrahend);
    }

    public double summationComposite(double summand1, double summand2) {
        count++;
        return calcAutoComposite.summation(summand1, summand2);
    }

    public double toPositiveComposite(double anyRealNum) {
        count++;
        return calcAutoComposite.toPositive(anyRealNum);
    }

    public double squareRootComposite(double underRoot) {
        count++;
        return calcAutoComposite.squareRoot(underRoot);
    }

    public double exponentationComposite(double base, int exponent) {
        count++;
        return calcAutoComposite.exponentation(base, exponent);
    }
    public long getCountOperation() {
        return count;
    }
}
