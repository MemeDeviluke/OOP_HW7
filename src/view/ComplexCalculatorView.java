package view;

import model.ComplexNumber;

public class ComplexCalculatorView {
    private ComplexNumberView numberView = new ComplexNumberView();
    public void showResult(ComplexNumber num1, ComplexNumber num2, String operation, ComplexNumber result){
        numberView.printOnConsole(num1);
        System.out.print(" " + operation + " ");
        numberView.printOnConsole(num2);
        System.out.print(" = ");
        numberView.printOnConsole(result);
        System.out.println();
    }
}
