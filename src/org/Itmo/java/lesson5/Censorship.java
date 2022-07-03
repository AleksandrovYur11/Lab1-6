package org.Itmo.java.lesson5;


public class Censorship {

    //Метод замены слова бяка на [вырезано цензурой]
    static String badWord(String text) {
        return String.join("[вырезано цензурой]", text.split("бяка"));
    }

    // Метод поиска количества вхождений
    static int countOfOccur(String text, String pattern) {
        int index = 0;
        int count = 0;

        while ((index = text.indexOf(pattern, index)) != -1) {
            System.out.println(pattern + " starts from index: " + String.valueOf(index));
            ++index;
            ++count;
        }
        System.out.print("Number of repetitions: ");
        return count;
    }

    public static void main(String[] args) {
        System.out.println(badWord(" Плохая бяка не может быть хорошей, потому что она бяка!!!"));
        System.out.println();
        System.out.println(countOfOccur("Антаннанариву - настоящая столица Мадагаскара ", "на"));
    }
}
