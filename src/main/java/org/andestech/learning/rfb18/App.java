package org.andestech.learning.rfb18;




public class App 
{
    public static double calcMass(Figure2D f2d)
    {

        return f2d.square()*f2d.getRho();
    }

    public static Double calcMass2(Object f2d)
    {
        if( f2d instanceof Figure2D  ){

        return ((Figure2D)f2d).square()*
                ((Figure2D)f2d).getRho();}
        return null;
    }

    public static void main( String[] args )
    {


        // test аргументов cmd
        int N = args.length;
        double r=1, a=1, b=1;
        switch (N){
            //case 0: break;
            case 1: r = Double.parseDouble(args[0]);
                System.out.println("circle try...");
             break;
            case 2:
                a = Double.parseDouble(args[0]);
                b = Double.parseDouble(args[1]);
                System.out.println("rectangle try...");
                break;


        }

        System.out.println("----------------");
        for(String s: args) System.out.println(s);
        System.out.println("----------------");

        Circle c1 = new Circle(r);
        System.out.println(c1.getSP());
        Rectangle r1 = new Rectangle(a,b);
        System.out.println(r1.getSP());

        //-------------

        calcMass(c1);

        Object o1 = c1;
       // System.out.println(o1.getSP());


    }
}
