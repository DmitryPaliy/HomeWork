package home_work_3.calcs.api;
//10. Создать интерфейс ICalculator. Данный интерфейс создайте в пакете calcs.api. Можете прогуглить
// слово API, оно очень универсально. Такие пакеты обычно содержат интерфейсы, перечисления и в некоторых
// случаях абстрактные классы.
//	10.1 В данном интерфейсе должны быть объявлены методы:
//		10.1.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		10.1.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень
//		из числа).
//	10.2 На данный момент данный интерфейс вы должны прописать во всех классах калькуляторов созданных
//	нами в пакетах calcs.simple
public interface ICalculator {
    double division(double dividend, double divisor);
    double multiplication(double multiplicand, double multiplier);
    double subtraction(double minuend, double subtrahend);
    double summation(double summand1, double summand2);
    double exponentation(double base, int exponent);
    double toPositive(double anyRealNum);
    double squareRoot(double underRoot);
}
