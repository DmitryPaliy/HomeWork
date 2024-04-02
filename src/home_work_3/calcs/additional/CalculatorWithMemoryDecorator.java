package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private ICalculator iCalculator;
    private double memory;
    private double saveNow;
    public CalculatorWithMemoryDecorator(ICalculator iCalculator) {
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
        double givenSave = saveNow;
        saveNow = 0;
        return givenSave;
    }
    public ICalculator getCalculator() {
        return iCalculator;
    }
}
