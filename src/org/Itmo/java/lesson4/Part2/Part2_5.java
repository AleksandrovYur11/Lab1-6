package org.Itmo.java.lesson4.Part2;

import java.util.Arrays;
import java.util.Random;

// Сортировка слиянием для массива с случайными числами

public class Part2_5 {

    static int[] randomArray() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    // Метод объединения 2 подмассивов
    static void merge(int[] arr, int l, int m, int r) {
        // Размер 2 подмассивов
        int n1 = m - l + 1;
        int n2 = r - m;

        //  Создание 2 подмассивов
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Копирование данных из 1 массива в 2 подмассива
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        // Инициализация индексов для сортировки подмассивов
        int i = 0, j = 0;

        // Сортировка 2 соседних подмассиов, а также запись данных в основной массив
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Копирование оставшихся элементов из 1 массива
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Копирование оставшихся элементов из 2 массива
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Основной метод сортировки слиянием
    static int[] sort(int[] arr, int l, int r) {
        if (l < r) {

            int m = (l + r) / 2;

            sort(arr, l, m);            // Сортировка 1 половины
            sort(arr, m + 1, r);      // Сортировка 2 половины
            merge(arr, l, m, r);       // Объединение половинок
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = randomArray();
        System.out.println(Arrays.toString(sort(arr, 0, 9)));

    }
}
