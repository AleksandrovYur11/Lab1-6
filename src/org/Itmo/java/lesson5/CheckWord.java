package org.Itmo.java.lesson5;

import java.util.Locale;

public class CheckWord {

    // Метод поиска полиндрома в предложении
    static void checkPalindrome(String text) {
        String[] arr = text.toUpperCase(Locale.ROOT).split(" ");
        StringBuilder str = new StringBuilder(text.toUpperCase(Locale.ROOT));
        String revers = str.reverse().toString();
        String[] arrRevers = revers.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                if (arr[i].equals(arrRevers[j])) {
                    res.append(arr[i].toLowerCase(Locale.ROOT)).append(" ");
                }
        }

        System.out.println("Слово(а) палиндром(ы): " + res.toString());
    }

    public static void main(String[] args) {
        checkPalindrome("Дед скАзаЛ соорудить  шАлаШ");
    }
}
