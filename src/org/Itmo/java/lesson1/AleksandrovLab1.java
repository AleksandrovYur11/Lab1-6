package org.Itmo.java.lesson1;
import java.util.Scanner;

public class AleksandrovLab1 {
    public static void main(String[] arg) {
// 1.
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

//2.
        double x = (46 + 10) * ((double) (10 / 3));
        System.out.println(x);
        int y = (29) * (4) * (-15);
        System.out.println(y);

//3.
        double number = 10500;
        System.out.println((number / 10) / 10);

//4.
        double result = 3.6d * 4.1d * 5.9d;
        System.out.println(result);

//5.
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1 number: ");
        int a1 = in.nextInt();
        System.out.print("Input 2 number: ");
        int a2 = in.nextInt();
        System.out.print("Input 3 number: ");
        int a3 = in.nextInt();

//6.
        System.out.print("Input 4 number: ");
        int b = in.nextInt();
        if (b > 100 && b % 2 == 0) {
            System.out.print("Going out of range");
        } else if (b % 2 != 0) {
            System.out.print("Not Even");
        } else {
            System.out.print("Even");
        }
    }
}


