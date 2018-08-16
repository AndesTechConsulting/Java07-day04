package org.andestech.learning.rfb18;

public class Circle extends Figure2D {

    private double r;

    public Circle(double r) {
        this.r = r;
        setRho(1);
    }


    @Override
    public double square() {
        return Math.PI*r*r;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*r;}

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
