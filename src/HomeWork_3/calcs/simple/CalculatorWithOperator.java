package HomeWork_3.calcs.simple;
//2. Создать класс CalculatorWithOperator.
//	2.1 Все методы, объявленные в данном классе НЕ статические - не имеют модификатор static.
//	2.2 В классе должны присутствовать математические методы:
//		2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение) каждый из этих методов должен
//		принимать два параметра (определитесь с их типами) и должны возвращать результат (определиться с возвращаемым
//		типом результата) при помощи ключевого слово return.
//		2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень
//		из числа).
public class CalculatorWithOperator {

    /**
     * Метод выполняет деление двух вещественных чисел
     * @param dividend делимое число
     * @param divisor число-делитель
     * @return частное двух чисел
     */
    public double division(double dividend, double divisor) {
        return dividend / divisor;
    }

    /**
     * Метод выполняет произведение двух вещественных чисел
     * @param multiplicand множимое число
     * @param multiplier число-множитель
     * @return произведение двух чисел
     */
    public double multiplication(double multiplicand, double multiplier) {
        return multiplicand * multiplier;
    }

    /**
     * Метод выполняет вычитание двух вещественных чисел
     * @param minuend уменьшаемое число
     * @param subtrahend вычитаемое число
     * @return разность двух чисел
     */
    public double subtraction(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    /**
     * Метод выполняет сложение двух вещественных чисел
     * @param summand1 первое слагаемое число
     * @param summand2 второе слагаемое число
     * @return сумма двух чисел
     */
    public double summation(double summand1, double summand2) {
        return summand1 + summand2;
    }

    /**
     * Метод выполняет возведение в целочисленную степень модуля вещественного числа
     * @param base основа (модуль вещественного числа)
     * @param exponent показатель степени (целое число)
     * @return результат возведения в степень
     */
    public double exponentation(double base, int exponent) {
        double positiveBase = (base <= 0.0) ? 0.0 - base : base;
        double result = positiveBase;
        for (int i = 1; i < exponent; i++) {
            result *= positiveBase;
        }
        return result;
    }

    /**
     * Метод приводит отрицательное вещественное число к положительному числу
     * @param anyRealNum вещественное число (может быть как отрицательным, так и положительным)
     * @return положительное число
     */
    public double toPositive(double anyRealNum) {
        return (anyRealNum <= 0.0) ? 0.0 - anyRealNum : anyRealNum;
    }

    /**
     * Метод извлекает квадратный корень из вещественного числа
     * @param underRoot число, из которого извлекается квадратный корень
     * @return результат извлечения квадратного корня из числа
     */
    public double squareRoot(double underRoot) {
        double result = 0.0;
        double fullSquare = 0.0;
        if (underRoot < 0.0) {
            System.out.println(0);
        } else if (underRoot < 1) {
            for (fullSquare = 0.0; fullSquare * fullSquare <= underRoot; ) {
                result = fullSquare * fullSquare;
                fullSquare = fullSquare + 0.1;
            }
            fullSquare = fullSquare - 0.1;
        } else {
            for (fullSquare = 1.0; fullSquare * fullSquare <= underRoot; fullSquare++) {
                result = fullSquare * fullSquare;
            }
            --fullSquare;
        }
        double average1 = (underRoot / fullSquare + result / fullSquare) / 2.0;
        double average2 = underRoot / average1;
        result = (average1 + average2) / 2.0;
        return result;
    }
}
