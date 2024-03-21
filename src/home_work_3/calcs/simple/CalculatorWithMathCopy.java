package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

//3. Создать класс CalculatorWithMathCopy.
//	3.1 Все методы, объявленные в данном классе НЕ статические - не имеют модификатор static.
//	3.2 В классе должны присутствовать математические методы:
//		3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение). Скопировать базовые
//		математические операции из CalculatorWithOperator.
//		3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//		Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
public class CalculatorWithMathCopy implements ICalculator {

    public double division(double dividend, double divisor) {
        return dividend / divisor;
    }

    public double multiplication(double multiplicand, double multiplier) {
        return multiplicand * multiplier;
    }

    public double subtraction(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    public double summation(double summand1, double summand2) {
        return summand1 + summand2;
    }

    public double toPositive(double anyRealNum) {
        return Math.abs(anyRealNum);
    }

    public double squareRoot(double underRoot) {
        return Math.sqrt(underRoot);
    }

    public double exponentation(double base, int exponent) {
        return Math.pow(base, exponent);
    }

}
