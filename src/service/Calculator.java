package service;

import model.ComplexNumber;

public interface Calculator {
    ComplexNumber summation(ComplexNumber firstnum, ComplexNumber secondnum);
    ComplexNumber substraction(ComplexNumber firstnum, ComplexNumber secondnum);
    ComplexNumber multiplication(ComplexNumber firstnum, ComplexNumber secondnum);
    ComplexNumber division(ComplexNumber firstnum, ComplexNumber secondnum);
}
