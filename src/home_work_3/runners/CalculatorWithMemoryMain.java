package home_work_3.runners;
//12.8 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод). В main методе требуется
//	создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
//	(4.1 + 15 * 7 + (28 / 5) ^ 2)
//	Вывести в консоль результат. В мэйне запрещается использование переменных для хранения значений участвующих
//	в просчёте, вместо них необходимо использовать метод save, а также результатов работы методов калькулятора,
//	можно использовать только литералы и метод получения из памяти записанного значения. Пример:
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

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calcMem = new CalculatorWithMemory(new CalculatorWithOperator());
        calcMem.division(28, 5);
	    calcMem.save();
        calcMem.exponentation(calcMem.load(), 2);
        calcMem.save();
        calcMem.summation(4.1, calcMem.load());
        calcMem.save();
        calcMem.summation(calcMem.load(), calcMem.multiplication(15, 7));
        calcMem.save();
        System.out.printf("%.2f%n", calcMem.load()); // 140.46
    }
}
