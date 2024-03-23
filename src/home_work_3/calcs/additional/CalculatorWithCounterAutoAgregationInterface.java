package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

//11. Создать класс CalculatorWithCounterAutoAgregationInterface.
//	11.1 Внутри класса нельзя создавать объекты (использовать new), можно пользоваться только тем что передал вам
//	пользователь вашего класса.
//	11.2 Все методы, объявленные в данном классе НЕ статические - не имеют модификатор static.
//	11.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
//	11.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору
//	который передали в конструктор
//	11.5 В классе должны присутствовать все методы объявленные в интерфейсе.
//	11.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований
//	данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
public class CalculatorWithCounterAutoAgregationInterface {
    ICalculator iCalculator;
    private long count = 0;
    public CalculatorWithCounterAutoAgregationInterface(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }
        public double division ( double dividend, double divisor){
            count++;
            return iCalculator.division(dividend, divisor);
        }
        public double multiplication ( double multiplicand, double multiplier){
            count++;
            return iCalculator.multiplication(multiplicand, multiplier);

        }
        public double subtraction ( double minuend, double subtrahend){
            count++;
            return iCalculator.subtraction(minuend, subtrahend);
        }
        public double summation ( double summand1, double summand2){
            count++;
            return iCalculator.summation(summand1, summand2);
        }
        public double exponentation ( double base, int exponent){
            count++;
            return iCalculator.exponentation(base, exponent);
        }
        public double toPositive ( double anyRealNum){
            count++;
            return iCalculator.toPositive(anyRealNum);
        }
        public double squareRoot ( double underRoot){
            count++;
            return iCalculator.squareRoot(underRoot);
        }
    public long getCountOperation() {
        return count;
    }
}
