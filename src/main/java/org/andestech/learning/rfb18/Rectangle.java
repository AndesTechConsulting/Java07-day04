package org.andestech.learning.rfb18;

public class Rectangle extends Figure2D{

private double a;
    private double b;

   public Rectangle(double a, double b)
   {
       this.a = a;
       this.b = b;
       setRho(1);

   }

    public Rectangle(){
       a=b=1;
    }


    @Override
    public double square() {
        return a * b;
    }

     @Override
    public double perimeter() {
        return (a + b)*2;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
