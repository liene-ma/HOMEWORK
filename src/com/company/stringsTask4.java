package com.company;

import java.util.Arrays;
import java.util.*;
import java.lang.String;


public class stringsTask4 {

    enum suit {
        HEARTS, DIAMONDS, SPADES, CLUBS
    }

    enum value {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    static String[] TheDeck = cards();

    public static void main (String [] args) {

        System.out.println(Arrays.toString(TheDeck));
        shuffle();
    }

    public static String[] cards() {

        int c = 0;
        String[] TheDeck = new String[52];
        for (suit x : suit.values()) {
            for (value y : value.values()) {
                TheDeck[c] = x.toString() + y.toString();
                c++;
            }
        }
        return TheDeck;
    }

    public static void shuffle() {

        Collections.shuffle(Arrays.asList(TheDeck)); {
            System.out.println(Arrays.toString(TheDeck));
            System.out.println("First card: " + Arrays.toString(Arrays.copyOfRange(TheDeck, 0, 1)));
            System.out.println("The next six cards: " + Arrays.toString(Arrays.copyOfRange(TheDeck, 1, 7)));
        }
    }

}
