package com.mypractice.search_in_stroke;

public class search_in_stroke {
    public static void main(String[] args) {
        String string = "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание.";
        String word = "код";
        int indexFromFirstWord = getIndexFromFirstWord(string, word);
        int indexFromLastWord = getIndexFromLastWord(string, word);
        System.out.println("Индекс первого символа первого слова \"" + word + "\" равен - " + indexFromFirstWord);
        System.out.println("Индекс первого символа последнего слова \"" + word + "\" равен - " + indexFromLastWord);
    }

    public static int getIndexFromFirstWord(String string, String word) {
        int firstWord = string.indexOf(word); //40
        return firstWord;
    }

    public static int getIndexFromLastWord(String string, String word) {
        int secondWord = string.lastIndexOf(word); //58
        return string.lastIndexOf(word);
    }
}
//Метод lastIndexOf() используется именно для того, чтобы найти последнее вхождение подстроки в строке.
