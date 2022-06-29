package org.Itmo.java.lesson4.Part1;

import java.util.Scanner;

//Если 2 число больше 1 числа, а 3 число больше 2, то true

public class Part1_4 {
    public void checkCondition() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = in.nextInt();
        System.out.print("Введите второе число: ");
        int y = in.nextInt();
        System.out.print("Введите второе число: ");
        int j = in.nextInt();

        if (x < y && y < j) {
            System.out.print("Результат: true");
        } else {
            System.out.print("Результат: false");
        }

    }

    public static void main(String[] args) {
        Part1_4 test = new Part1_4();
        test.checkCondition();
    }
}
