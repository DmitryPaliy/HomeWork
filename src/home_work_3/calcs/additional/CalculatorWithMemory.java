package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

//12*. Создать CalculatorWithMemory используя аналогичные принципы построения класса
// CalculatorWithCounterAutoAgregationInterface.
//	12.1 Данный калькулятор предназначен для того, чтобы расширить возможности калькулятора и обеспечить
//	его дополнительной функцией памяти. В принципе работает как калькулятор из реальной жизни.
//	12.2 Все методы, объявленные в данном классе НЕ статические - не имеют модификатор static.
//	12.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
//	12.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору,
//	который передали в конструктор
//	12.5 В классе должны присутствовать математические методы:
//		12.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		12.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//	12.6 Функция памяти работает через методы:
//		12.6.1 Записать в память результат выполнения последнего вызванного метода. У данного метода не должно
//		быть параметров. Данный метод вызывается непосредтвенно пользователем, а не автоматический. Пример
//		void save();
//		12.6.2 Получить из памяти записанное значение. При получении записи из памяти память стирается, при записи
//		нового значения память перезаписывается. Данный метод вызывается непосредтвенно пользователем, а не
//		автоматический. Пример double load();
//	12.7 В этом калькуляторе НЕТ ФУНКЦИИ ПОДСЧЁТА количества использований
//	12.8 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод). В main методе требуется
//	создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
//	Вывести в консоль результат. В мэйне запрещается использование переменных для хранения значений участвующих
//	в просчёте, вместо них необходимо использовать метод save, а также результатов работы методов калькулятора,
//	можно использовать только литералы и метод получения из памяти записанного значения. Пример:
//		/**
//	        CalculatorWithOperator calcOperator = new CalculatorWithOperator();
//	        CalculatorWithMemory calcMemory = new CalculatorWithMemory(calcOperator);
//	        calcMemory.division(28, 5);
//	        calcMemory.save();
//	        calcMemory.pow(calcMemory.load(), 2);
//	        calcMemory.save();
//	        calcMemory.addition(4.1, calcMemory.load());
//	        calcMemory.save();
//	        calcMemory.addition(calcMemory.load(), calcMemory.multiplication(15, 7));
//	        System.out.printf("%.2f%n", calcMemory.load()); // 140.46
//		*/
public class CalculatorWithMemory {
    private ICalculator iCalculator;
    private double memory;
    private double saveNow;
    private double givenSave;
    public CalculatorWithMemory(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }
    public double division(double dividend, double divisor) {
        memory = iCalculator.division(dividend, divisor);
        return memory;
    }
    public double multiplication(double multiplicand, double multiplier) {
        memory = iCalculator.multiplication(multiplicand, multiplier);
        return memory;
    }
    public double subtraction(double minuend, double subtrahend) {
        memory = iCalculator.subtraction(minuend, subtrahend);
        return memory;
    }
    public double summation(double summand1, double summand2) {
        memory = iCalculator.summation(summand1, summand2);
        return memory;
    }
    public double exponentation(double base, int exponent) {
        memory = iCalculator.exponentation(base, exponent);
        return memory;
    }
    public double toPositive(double anyRealNum) {
        memory = iCalculator.toPositive(anyRealNum);
        return memory;
    }
    public double squareRoot(double underRoot) {
        memory = iCalculator.squareRoot(underRoot);
        return memory;
    }
    public void save() {
        saveNow = memory;
    }
    public double load() {
        givenSave = saveNow;
        saveNow = 0;
        return givenSave;
    }
}
