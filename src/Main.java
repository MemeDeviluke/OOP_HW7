import controler.Controler;
import model.ComplexNumber;
import view.Logger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        while (true){
            Scanner operationInput = new Scanner(System.in);
            Logger.logging("Выберите операцию: 1 -> Сложение, 2 -> Вычитание, 3 -> Умножение, 4 -> Деление, 0 -> Выход");
            int operationChoice = operationInput.nextInt();
            if(operationChoice == 0) break;

            Scanner firstRealInput = new Scanner(System.in);
            Logger.logging("Введите реальную часть первого числа: ");
            float firstReal = firstRealInput.nextFloat();
            Scanner firstImaginaryInput = new Scanner(System.in);
            Logger.logging("Введите мнимую часть первого числа: ");
            float firstImaginary = firstImaginaryInput.nextFloat();

            ComplexNumber firstNum = controler.createNumber(firstReal, firstImaginary);

            Scanner secondRealInput = new Scanner(System.in);
            Logger.logging("Введите реальную часть второго числа: ");
            float secondReal = secondRealInput.nextFloat();
            Scanner secondImaginaryInput = new Scanner(System.in);
            Logger.logging("Введите мнимую часть второго числа: ");
            float secondImaginary = secondImaginaryInput.nextFloat();

            ComplexNumber secondNum = controler.createNumber(secondReal, secondImaginary);


            switch (operationChoice) {
                case 1 -> controler.takeResultOfSummation(firstNum, secondNum, "+");
                case 2 -> controler.takeResultOfSubstraction(firstNum, secondNum, "-");
                case 3 -> controler.takeResultOfMultiplication(firstNum, secondNum, "*");
                case 4 -> controler.takeResultOfDivision(firstNum, secondNum, "/");
            }
        }
    }
}