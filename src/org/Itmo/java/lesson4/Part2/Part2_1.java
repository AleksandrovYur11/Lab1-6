package org.Itmo.java.lesson4.Part2;

import java.util.Scanner;

// Проверка массива на сортировку

public class Part2_1 {
    public void checkSort() {
        int[] arr = new int[3];
        boolean flag = false;
        System.out.println("Введите 3 числа:");
        for (int i = 0; i < 3; i++) {
            Scanner in = new Scanner(System.in);
            arr[i] = in.nextInt();
        }

        for (int k = 1; k < arr.length; k++) {
            if (arr[k - 1] > arr[k]) {
                System.out.println("Please, try again");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("OK");
        }
    }

    public static void main(String[] args) {
        Part2_1 test = new Part2_1();
        test.checkSort();
    }
}
