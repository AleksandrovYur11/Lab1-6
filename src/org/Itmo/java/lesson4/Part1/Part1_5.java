package org.Itmo.java.lesson4.Part1;

import java.util.Scanner;

// Число 3 как первый и последний элемент массива

public class Part1_5 {
    public void checkArr() {
        int[] arr = new int[3];
        System.out.println("Введите 3 числа:");
        for (int i = 0; i < 3; i++) {
            Scanner in = new Scanner(System.in);
            arr[i] = in.nextInt();
        }

        System.out.println("array" + arr[0] + ", " + arr[1] + ", " + arr[2]);
        if (arr[0] == 3 || arr[2] == 3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        Part1_5 test = new Part1_5();
        test.checkArr();
    }
}
