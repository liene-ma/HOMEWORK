package com.company;
import java.util.Arrays;

public class stringsTask2 {

    static String quote = "Climb mountains not so the world can see you, but so you can see the world";
    static String[] words = quote.split("\\s+");

    public static void main (String[] args) {
        System.out.println(quote);
        System.out.println();
        System.out.println(Arrays.toString(words));
        System.out.println();
        System.out.println("How many words are there in this sentence? " + wordCount());
        System.out.println();
        System.out.println("How many 'the' words are there in the sentence? " + countThe());
        System.out.println();
        System.out.println("How many words contain the letter 's'? " + countWordsWithS());
        System.out.println();
        System.out.println("These are the duplicates: ");
        multipleWords();
        System.out.println();
        capitalizeYou();
    }

    public static int wordCount () {
        int count = words.length;
        return count;
    }

    public static int countThe () {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("the")) {
                count++;
            }
        }
        return count;
    }

    public static int countWordsWithS() {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("s")) {
                count++;
                System.out.println(words[i]);
            }
        }
        return count;
    }

    public static void multipleWords () {
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            for (int j = i+1; j < words.length; j++) {
                String temp2 = words[j];
                if (temp.equals(temp2)) {
                    System.out.println(temp2);
                }
            }
        }
    }

    public static void capitalizeYou () {
        String capitalize = quote.replaceAll("you", "YOU"); {
            System.out.println(capitalize);
        }
    }

}
