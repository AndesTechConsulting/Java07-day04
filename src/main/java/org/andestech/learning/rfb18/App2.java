package org.andestech.learning.rfb18;


// работа с исключениями
public class App2 {


    private static boolean isNumber(String s)
    {
        double d = 0;
        try{
            d = Double.parseDouble(s);
            return true;
        }
        catch (NumberFormatException ex)
        {
            return false;
        }

    }

    private static int calcDiv(int a, int b)
    {return a/b;}

    public static void main(String[] s)
    {
       int[] arr = {1,2,3,4,5};
       int arr2[] = {1,2,3,4,5};

        System.out.println(isNumber("12.34")?"Ok!!":"Not number");
        System.out.println(isNumber("A12.34")?"Ok!!":"Not number");
        System.out.println(isNumber("-111112")?"Ok!!":"Not number");
        System.out.println(isNumber("12,34")?"Ok!!":"Not number");

       try {
           arr[2] = -2222;
          // calcDiv(1,0);
          // arr[5] = 123;
         //  double aa = Double.parseDouble("a1");

           arr[0] = 77123;
           System.out.println("end of try...");
       }
      // catch (ArrayIndexOutOfBoundsException | ArithmeticException ex)
      // catch (Exception ex)
       catch (ArrayIndexOutOfBoundsException ex)
        {
           for(StackTraceElement el: ex.getStackTrace())
           {
               System.out.println(el.getFileName());
               System.out.println(el.getLineNumber());
               System.out.println(el.getClassName());
               System.out.println(el.getMethodName());
               System.out.println("-----------------------");

           }
           System.out.println("end of catch...");
           // log event.....

           //throw ex;
       }
       finally{
           //calcDiv(1,0);
           // log
           System.out.println("finally block !");
       }

       System.out.println("end of main..");
    }


}
