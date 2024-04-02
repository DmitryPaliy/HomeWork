package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

//13*. Создать класс CalculatorWithCounterAutoDecorator и CalculatorWithMemoryDecorator
//	13.1 Отличие от предыдущих CalculatorWithCounterAutoAgregationInterface и CalculatorWithMemory в том что данные
//	классы будут реализовывать интерфейс ICalculator.
//	13.2 Данный подход позволяет назвать данные классы "Декораторами". Декоратор - это популярный паттерн который
//	позволяет комбинировать и дополнять новыми возможностями объекты (в нашем случае калькуляторы) не меняя код в
//	их классе. Тем самым мы приходим к тому что мы не наследуем классы для их расширения и не привязываемся к
//	реализации конкретного калькулятора. Советую начать гуглить слово "паттерн".
//	13.3. О декораторах можно прочитать по ссылкам:
//	13.4 Добавить в эти классы метод ICalculator getCalculator() который будет возвращать вложенный в них калькулятор.
//	13.5 Создать класс CalculatorDecoratorMain в котором будет точка входа (main метод). Создать переменную типа
//	ICalculator calc записав в неё новый экземпляр класса CalculatorWithCounterAutoDecorator, которому в конструктор
//	был передан новый экземпляр класса CalculatorWithMemoryDecorator, с переданным в конструктор новым
//	экземпляром класса CalculatorWithMathExtends. Используя созданную переменную посчитать выражения из задания 1.
//	Вывести в консоль.
//	13.6 Вывести количество использований калькулятора.
//	13.7** Получить перечисленные далее сведения требуется из калькулятора который вам вернёт метод getCalculator().
//	Данный пункт вам очень поможет выполнить оператор instanceof который нужно использовать в main.
//		13.7.1 Выполнить метод сохранения последнего расчёта и вывести сохранённое значение.
//		13.7.2 Изменить calc путём изменения создаваемого экземпляра на CalculatorWithCounterClassic. Сделать выводы
//		в комментариях зачем нужен instanceof.
public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private ICalculator iCalculator;
    private long count = 0;
    public CalculatorWithCounterAutoDecorator(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }
    public double division(double dividend, double divisor) {
        count++;
        return iCalculator.division(dividend, divisor);
    }
    public double multiplication(double multiplicand, double multiplier) {
        count++;
        return iCalculator.multiplication(multiplicand, multiplier);
    }
    public double subtraction(double minuend, double subtrahend) {
        count++;
        return iCalculator.subtraction(minuend, subtrahend);
    }
    public double summation(double summand1, double summand2) {
        count++;
        return iCalculator.summation(summand1, summand2);
    }
    public double exponentation(double base, int exponent) {
        count++;
        return iCalculator.exponentation(base, exponent);
    }
    public double toPositive(double anyRealNum) {
        count++;
        return iCalculator.toPositive(anyRealNum);
    }
    public double squareRoot(double underRoot) {
        count++;
        return iCalculator.squareRoot(underRoot);
    }
    public long getCountOperation() {
        return count;
    }
    public ICalculator getCalculator() {
        return iCalculator;
    }
}
