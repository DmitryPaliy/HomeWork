package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

//Создать класс CalculatorWithCounterAutoAgregation.
//	8.1 Все методы и поля, объявленные в данном классе НЕ статические - не имеют модификатор static.
//	8.2 Внутри класса мы должны создавать поле хранящее объект класса калькулятор. Для примера можно использовать
//	любой тип калькулятора. Я возьму для примера CalculatorWithMathCopy
//	8.3 Для инициализации данного поля требуется использовать конструктор в который будут передавать
//	CalculatorWithMathCopy.
//	8.4 Данный класс напрямую не умеют считать математику, он умеет делегировать расчёт математики калькулятору
//	который сохранён в его поле.
//	8.5 В классах должны присутствовать математические методы:
//		8.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		8.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//	8.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного
//	калькулятора. При вызове данного метода счётчик учёта не увеличивается.
//	8.7 Создать класс CalculatorWithCounterDelegateAgregationMain в котором будет точка входа (main метод). В main
//	методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из
//	задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
public class CalculatorWithCounterAutoAgregation {
    CalculatorWithMathCopy calcAgregation;
    private long count;
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calcAgregation) {
        this.calcAgregation = calcAgregation;
    }
    public double divisionAgregation(double dividend, double divisor) {
        count++;
        return calcAgregation.division(dividend, divisor);
    }
    public double multiplicationAgregation(double multiplicand, double multiplier) {
        count++;
        return calcAgregation.multiplication(multiplicand, multiplier);
    }

    public double subtractionAgregation(double minuend, double subtrahend) {
        count++;
        return calcAgregation.subtraction(minuend, subtrahend);
    }

    public double summationAgregation(double summand1, double summand2) {
        count++;
        return calcAgregation.summation(summand1, summand2);
    }

    public double toPositiveAgregation(double anyRealNum) {
        count++;
        return calcAgregation.toPositive(anyRealNum);
    }

    public double squareRootAgregation(double underRoot) {
        count++;
        return calcAgregation.squareRoot(underRoot);
    }

    public double exponentationAgregation(double base, int exponent) {
        count++;
        return calcAgregation.exponentation(base, exponent);
    }
    public long getCountOperation() {
        return count;
    }
    }


