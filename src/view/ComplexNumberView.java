package view;

import model.ComplexNumber;

public class ComplexNumberView {
    public void printOnConsole(ComplexNumber complexNumber){
        if(complexNumber.getImaginarypart() >= 0)
            System.out.print(complexNumber.getRealpart() + " + " + complexNumber.getImaginarypart() + "i");
        else
            System.out.print(complexNumber.getRealpart() + " " + complexNumber.getImaginarypart() + "i");
    }
}
