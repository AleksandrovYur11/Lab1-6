package org.Itmo.java.lesson4.Part2;

import java.util.Arrays;
import java.util.Scanner;

// Считывание с клавиатуры длины массива, а также ввод чисел

public class Part2_2 {
    public void arrResult() {
        System.out.print("Array length: ");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        int[] arr = new int[x];
        System.out.println("Numbers of array");
        for (int i = 0; i < x; i++) {
            Scanner in = new Scanner(System.in);
            arr[i] = in.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Part2_2 test = new Part2_2();
        test.arrResult();
    }
}
