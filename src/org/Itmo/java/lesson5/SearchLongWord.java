package org.Itmo.java.lesson5;

public class SearchLongWord {

    // Метод поиска самого сдлинного слова
    static void searchWord(String text) {
        String[] arr = text.split(" ");
        int max = arr[0].length();
        String result = null;
        for (int j = 0; j < arr.length; j++)
            if (max <= arr[j].length()) {
                max = arr[j].length();
                result = arr[j];
            }
        System.out.println("Longer word: " + result);
    }

    public static void main(String[] args) {
        searchWord("Я люблю спать и купаться");
    }
}
