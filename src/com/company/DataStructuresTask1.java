package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class DataStructuresTask1 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Computer");
        words.add("Plate");
        words.add("Chair");
        words.add("Girl");
        words.add("Boy");
        words.add("Cat");
        words.add("Dog");
        words.add("Shirt");
        words.add("Determination");

//        List<String> wordsList = Arrays.asList( "Computer", "Plate", "Chair", "Girl",
//                "Boy", "Cat", "Dog", "Shirt", "Determination");
//        ArrayList<String> ListOfWords = new ArrayList<>();
//        ListOfWords.addAll(wordsList);
//        System.out.println(ListOfWords);


        System.out.println("Before sorting");
        System.out.println(words);
        System.out.println();//empty line
        Collections.sort(words);
        System.out.println("After sorting");
        System.out.println(words);
        System.out.println();//empty line
        System.out.println("Elements starting with C: " + countC(words));
        System.out.println();//empty line
        System.out.println("Elements ending with e: " + endE(words));
        System.out.println();//empty line
        System.out.println("Elements with 5 letters: " + length5(words));
        System.out.println();//empty line
        System.out.println("Elements contain letter e: " + containE(words));
        System.out.println();//empty line
        System.out.println("There are elements containing substring TE: " + containTE(words));

//        System.out.println(words.get(5));
//        words.set(0, "Apple");

    }

    public static int countC(ArrayList<String> words) {
        int countC = 0;
        for (String c : words) {
            if (c.startsWith("C")) {
                countC++;
                System.out.println(c);
            }
        }
        return countC;
    }

    public static int endE(ArrayList<String> words) {
        int countE = 0;
        for (String e : words) {
            if (e.endsWith("e")) {
                countE++;
                System.out.println(e);
            }
        }
        return countE;
    }

    public static int length5(ArrayList<String> words) {
        int count5 = 0;
        for (String five : words) {
            if (five.length() == 5) {
                count5++;
                System.out.println(five);
            }
        }
        return count5;
    }

    public static int containE(ArrayList<String> words) {
        int cE = 0;
        for (String containE : words) {
            if (containE.contains("e")) {
                cE++;
                System.out.println(containE);
            }
        }
        return cE;
    }

    public static boolean containTE(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            if (words.stream().anyMatch((a) -> a.contains("te"))) {
                return true;
            }
        }
        return false;
    }

}
