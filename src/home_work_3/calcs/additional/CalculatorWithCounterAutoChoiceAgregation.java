package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

//9. Создать класс CalculatorWithCounterAutoChoiceAgregation.
//	9.1 Все методы, объявленные в данных классах НЕ статические - не имеют модификатор static.
//	9.2 В данном классе должны быть следующие варианты конструктора:
//		9.2.1 Принимающий объект типа CalculatorWithOperator
//		9.2.2 Принимающий объект типа CalculatorWithMathCopy
//		9.2.3 Принимающий объект типа CalculatorWithMathExtends
//	9.4 Данные класс также не умеет напрямую считать математику, они умеют делегировать расчёт математики
//	калькулятору который передали в конструктор.
//	9.5 В классах должны присутствовать математические методы:
//		9.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		9.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень
//		из числа).
//	9.6 В классе должен быть метод long getCountOperation() который должен возвращать количество
//	использований данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calcOperator;
    private CalculatorWithMathCopy calcCopy;
    private CalculatorWithMathExtends calcExtends;
    public long count = 0;
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calcOperator) {
        this.calcOperator = calcOperator;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calcCopy) {
        this.calcCopy = calcCopy;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calcExtends) {
        this.calcExtends = calcExtends;
    }
    public double divisionChoice(double dividend, double divisor) {
        count++;
        if (calcOperator != null) {
            return calcOperator.division(dividend, divisor);
        }
        if (calcCopy != null) {
            return calcCopy.division(dividend, divisor);
        }
        if (calcExtends != null) {
            return calcExtends.division(dividend, divisor);
        }
        return 0.0;
    }
    public double multiplicationChoice(double multiplicand, double multiplier) {
        count++;
        if (calcOperator != null) {
            return calcOperator.multiplication(multiplicand, multiplier);
        }
        if (calcCopy != null) {
            return calcCopy.multiplication(multiplicand, multiplier);
        }
        if (calcExtends != null) {
            return calcExtends.multiplication(multiplicand, multiplier);
        }
        return 0.0;
    }

    public double subtractionChoice(double minuend, double subtrahend) {
        count++;
        if (calcOperator != null) {
            return calcOperator.subtraction(minuend, subtrahend);
        }
        if (calcCopy != null) {
            return calcCopy.subtraction(minuend, subtrahend);
        }
        if (calcExtends != null) {
            return calcExtends.subtraction(minuend, subtrahend);
        }
        return 0.0;
    }

    public double summationChoice(double summand1, double summand2) {
        count++;
        if (calcOperator != null) {
            return calcOperator.summation(summand1, summand2);
        }
        if (calcCopy != null) {
            return calcCopy.summation(summand1, summand2);
        }
        if (calcExtends != null) {
            return calcExtends.summation(summand1, summand2);
        }
        return 0.0;
    }

    public double toPositiveChoice(double anyRealNum) {
        count++;
        if (calcOperator != null) {
            return calcOperator.toPositive(anyRealNum);
        }
        if (calcCopy != null) {
            return calcCopy.toPositive(anyRealNum);
        }
        if (calcExtends != null) {
            return calcExtends.toPositive(anyRealNum);
        }
        return 0.0;
    }

    public double squareRootChoice(double underRoot) {
        count++;
        if (calcOperator != null) {
            return calcOperator.squareRoot(underRoot);
        }
        if (calcCopy != null) {
            return calcCopy.squareRoot(underRoot);
        }
        if (calcExtends != null) {
            return calcExtends.squareRoot(underRoot);
        }
        return 0.0;
    }

    public double exponentationChoice(double base, int exponent) {
        count++;
        if (calcOperator != null) {
            return calcOperator.exponentation(base, exponent);
        }
        if (calcCopy != null) {
            return calcCopy.exponentation(base, exponent);
        }
        if (calcExtends != null) {
            return calcExtends.exponentation(base, exponent);
        }
        return 0.0;
    }
    public long getCountOperation() {
        return count;
    }
}

