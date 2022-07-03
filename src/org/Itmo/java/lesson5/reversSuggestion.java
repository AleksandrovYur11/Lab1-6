package org.Itmo.java.lesson5;

public class reversSuggestion {

    // Метод, который инвертирует слова в предложении
    static void suggestionRevers(String text) {
        System.out.println("This is a test string: " + text);
        String[] arr = text.split(" ");
        String result = "";
        for (int j = 0; j < arr.length; j++) {
            StringBuilder str = new StringBuilder(arr[j]);
            arr[j] = str.reverse().toString();
            result = String.join(" ", arr);
        }
        System.out.println("The string reversed word by word is: " + result);
    }

    public static void main(String[] args) {
        suggestionRevers("Без труда не выловишь рыбку из пруда");
    }
}
