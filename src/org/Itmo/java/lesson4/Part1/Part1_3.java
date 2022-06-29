package org.Itmo.java.lesson4.Part1;

import java.util.Scanner;

// Если сумма равна 3 числу, то true

public class Part1_3 {
    public void CheckSum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = in.nextInt();
        System.out.print("Введите второе число: ");
        int y = in.nextInt();
        System.out.print("Введите второе число: ");
        int j = in.nextInt();

        if (x + y == j) {
            System.out.print("Результат: true");
        } else {
            System.out.print("Результат: false");
        }
    }

    public static void main(String[] args) {
        Part1_3 test = new Part1_3();
        test.CheckSum();
    }
}
