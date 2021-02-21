package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class DataStructuresTask1 {

    public static void main (String[] args) {

//        List<String> wordsList = Arrays.asList( "Computer", "Plate", "Chair", "Girl",
//                "Boy", "Cat", "Dog", "Shirt", "Determination");
//        ArrayList<String> ListOfWords = new ArrayList<>();
//        ListOfWords.addAll(wordsList);
//        System.out.println(ListOfWords);

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
        System.out.println("Before sorting");
        System.out.println(words);

        Collections.sort(words);
        System.out.println("After sorting");
        System.out.println(words);

    }
}
