package org.Itmo.java.lesson4.Part2;

import java.util.Arrays;
import java.util.Scanner;

// Замена местами первого и последнего элемента массива

public class Part2_3 {
    public void arrChange() {
        System.out.print("Array length: ");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        int[] arr1 = new int[x];
        System.out.println("Numbers of array");
        for (int i = 0; i < x; i++) {
            Scanner in = new Scanner(System.in);
            arr1[i] = in.nextInt();
        }
        System.out.println("Array 1: " + Arrays.toString(arr1));

        int[] arr2 = new int[x];
        arr2[0] = arr1[x - 1];
        arr2[x - 1] = arr1[0];
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        Part2_3 test = new Part2_3();
        test.arrChange();
    }
}
