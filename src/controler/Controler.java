package controler;

import model.ComplexNumber;
import service.ComplexCalculator;
import view.ComplexCalculatorView;
import view.ComplexNumberView;
import view.Logger;

public class Controler {
    private ComplexNumberView numberView = new ComplexNumberView();
    private ComplexCalculator calculator = new ComplexCalculator();
    private ComplexCalculatorView calculatorView = new ComplexCalculatorView();
    private Logger log = new Logger();

    public ComplexNumber createNumber(float real, float imaginary){
        log.logging("Вы ввели число!");
        ComplexNumber number = new ComplexNumber(real, imaginary);
        numberView.printOnConsole(number);
        System.out.println();
        return number;
    }

    public ComplexNumber takeResultOfSummation(ComplexNumber num1, ComplexNumber num2, String operation){
        log.logging("Вы запустили операцию сложения!");
        ComplexNumber result = calculator.summation(num1, num2);
        log.logging("Получаем результат!");
        calculatorView.showResult(num1, num2, operation, result);
        return calculator.summation(num1, num2);
    }

    public ComplexNumber takeResultOfSubstraction(ComplexNumber num1, ComplexNumber num2, String operation){
        log.logging("Вы запустили операцию вычитания!");
        ComplexNumber result = calculator.substraction(num1, num2);
        log.logging("Получаем результат!");
        calculatorView.showResult(num1, num2, operation, result);
        return calculator.substraction(num1, num2);
    }

    public ComplexNumber takeResultOfMultiplication(ComplexNumber num1, ComplexNumber num2, String operation){
        log.logging("Вы запустили операцию умножения!");
        ComplexNumber result = calculator.multiplication(num1, num2);
        log.logging("Получаем результат!");
        calculatorView.showResult(num1, num2, operation, result);
        return calculator.multiplication(num1, num2);
    }

    public ComplexNumber takeResultOfDivision(ComplexNumber num1, ComplexNumber num2, String operation){
        log.logging("Вы запустили операцию деления!");
        ComplexNumber result = calculator.division(num1, num2);
        log.logging("Получаем результат!");
        calculatorView.showResult(num1, num2, operation, result);
        return calculator.division(num1, num2);
    }

}
