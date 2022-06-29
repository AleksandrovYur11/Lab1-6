package org.Itmo.java.lesson4.Part1;

// Делятся на 3,5, на 3 и 5

public class Part1_2 {
    public void subArr() {

        System.out.print("Делится на 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(" " + i + " ");
            }
        }

        System.out.println();
        System.out.print("Делится на 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(" " + i + " ");
            }
        }

        System.out.println();
        System.out.print("Делится на 15:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(" " + i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Part1_2 test = new Part1_2();
        test.subArr();
    }

}