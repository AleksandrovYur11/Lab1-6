package org.Itmo.java.lesson2;

public class Calculator {
    // Sum
    public static double sum(int x, int y){
        return  x + y;
    }

    public static double sum(double x, double y){
        return  x + y;
    }

    public static double sum(long x, long y ){
        return  x + y;
    }

    //Subtraction
    public static double sub(int x, int y ){
        return  x - y;
    }

    public static double sub(double x, double y ){
        return  x - y;
    }

    public static double sub(long x, long y ){
        return  x - y;
    }

    //Multiplication
    public static double mul(int x, int y ){
        return  x * y;
    }

    public static double mul(double x, double y ){
        return  x * y;
    }

    public static double mul(long x, long y ){
        return  x * y;
    }

    //Division
    public static double div(int x, int y ){
        return (double) x / y;
    }

    public static double div(double x, double y ){
        return  x / y;
    }

    public static double div(long x, long y ){
        return  (double) x / y;
    }



    public static void main(String[] arg){

        System.out.println("Division");
        System.out.println(div(-231,5));
        System.out.println(div(-231.3D,5.4D));
        System.out.println(div(-231.33535,5.4213));

        System.out.println("Multiplication");
        System.out.println(mul(41,2));
        System.out.println(mul(41.34D,3D));
        System.out.println(mul(41.241,2.436));

        System.out.println("Sum");
        System.out.println(sum(451,-14));
        System.out.println(sum(-154.34D,41D));
        System.out.println(sum(-1234.3452354,2.536));

        System.out.println("Subtraction");
        System.out.println(sub(-511,2));
        System.out.println(sub(55.54D,3D));
        System.out.println(sub(41.241,2.436));
    }
}
