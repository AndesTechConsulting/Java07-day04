package org.andestech.learning.rfb18;

public abstract class Figure2D {

    private double rho;
   // private int rgb;

    // color
    // position
    // velocity
    // vorticity
    // .....

    public abstract double square();

    public abstract double perimeter();


    public double getRho() {
        return rho;
    }

    public void setRho(double rho) {
        this.rho = rho;
    }
}
