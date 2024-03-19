package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

// Создать класс CalculatorWithCounterClassic.
//	5.1 Все методы, объявленные в данном классе НЕ статические - не имеют модификатор static.
//	5.2 Данный класс должен наследовать класс CalculatorWithMathExtends.
//	5.3 В классе должен быть метод void incrementCountOperation() который должен увеличивать внутренний счётчик
//	(поле) в калькуляторе.
//	5.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований
//	данного калькулятора (поле).
public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    long count = 0;
    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }
}
