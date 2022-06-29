package org.Itmo.java.lesson4.Part1;

// Нечетные числа от 1 до 99

public class Part1_1 {
    public void arr() {
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                count++;
                System.out.println("Число номер " + count + " равняется " + i);
            }
        }
    }

    public static void main(String[] args) {
        Part1_1 test = new Part1_1();
        test.arr();
    }
}