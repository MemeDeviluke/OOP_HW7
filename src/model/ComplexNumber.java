package model;

public class ComplexNumber {
    private float realpart;
    private float imaginarypart;

    public ComplexNumber(float realpart, float imaginarypart){
        this.realpart = realpart;
        this.imaginarypart = imaginarypart;
    }

    public float getRealpart() {
        return realpart;
    }

    public float getImaginarypart() {
        return imaginarypart;
    }
}
