package org.Itmo.java.lesson4.Part2;

import java.util.Scanner;

// Поиск уникального числа в массиве

public class Part2_4 {
    public void uniqueNumberArray() {
        System.out.print("Array length: ");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        int[] arr = new int[x];
        System.out.println("Numbers of array");
        for (int i = 0; i < x; i++) {
            Scanner in = new Scanner(System.in);
            arr[i] = in.nextInt();
        }


        for (int j = 0; j < arr.length; j++) {
            boolean flag = true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[j] == arr[k] && j != k) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Unique number: " + arr[j]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Part2_4 test = new Part2_4();
        test.uniqueNumberArray();
    }
}
