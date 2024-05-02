package service;

import model.ComplexNumber;

public class ComplexCalculator implements Calculator{

    @Override
    public ComplexNumber summation(ComplexNumber firstnum, ComplexNumber secondnum) {
        return new ComplexNumber(firstnum.getRealpart() + secondnum.getRealpart(),
                firstnum.getImaginarypart() + secondnum.getImaginarypart());
    }

    @Override
    public ComplexNumber substraction(ComplexNumber firstnum, ComplexNumber secondnum) {
        return new ComplexNumber(firstnum.getRealpart() - secondnum.getRealpart(),
                firstnum.getImaginarypart() - secondnum.getImaginarypart());
    }

    @Override
    public ComplexNumber multiplication(ComplexNumber firstnum, ComplexNumber secondnum) {
        float real = firstnum.getRealpart() * secondnum.getRealpart() - firstnum.getImaginarypart() * secondnum.getImaginarypart();
        float imaginary = firstnum.getRealpart() * secondnum.getImaginarypart() + firstnum.getImaginarypart() * secondnum.getRealpart();
        return new ComplexNumber(real,imaginary);
    }

    @Override
    public ComplexNumber division(ComplexNumber firstnum, ComplexNumber secondnum) {
        float denominator = secondnum.getRealpart() * secondnum.getRealpart() + secondnum.getImaginarypart() * secondnum.getImaginarypart();
        float real = (firstnum.getRealpart() * secondnum.getRealpart() + firstnum.getImaginarypart() * secondnum.getImaginarypart()) / denominator;
        float imaginary = (firstnum.getImaginarypart() * secondnum.getRealpart() - firstnum.getRealpart() * secondnum.getImaginarypart()) / denominator;
        return new ComplexNumber(real, imaginary);
    }

}
