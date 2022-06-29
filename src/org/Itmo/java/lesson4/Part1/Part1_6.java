package org.Itmo.java.lesson4.Part1;

import java.util.Scanner;

// Провекра содержания в массиве числа 3

public class Part1_6 {
    public void checkNum() {
        boolean flag = false;
        int[] arr = new int[3];
        System.out.println("Введите 3 числа:");
        for (int i = 0; i < 3; i++) {
            Scanner in = new Scanner(System.in);
            arr[i] = in.nextInt();
        }

        System.out.println("array " + arr[0] + ", " + arr[1] + ", " + arr[2]);

        for (int i : arr) {
            if (i == 3 || i == 1) {
                System.out.println("true");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        Part1_6 test = new Part1_6();
        test.checkNum();
    }
}


