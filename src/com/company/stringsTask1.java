package com.company;

import java.util.Arrays;

public class stringsTask1 {

    static String[] stringArr = new String[]{"Computer", "Plate", "Chair", "Girl", "Boy",
            "Cat", "Dog", "Shirt", "Determination"};
    
    public static void main(String[] args) {

        System.out.println(Arrays.toString(stringArr));
        System.out.println("How many words start with 'C'? " + startWithC());
        System.out.println("How many words end with 'e'? " + endWithE());
        System.out.println("How many words are with length 5? " + lengthOf5());
        System.out.println("How many words contain the character 'e'? " + containsE());
        System.out.println("There are words in the array containing substring 'te'. " + containsTE());
        histogram();

    }

    public static int startWithC() {
        int count = 0;
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].startsWith("C")) {
                count++;
            }
        }
        return count;
    }

    public static int endWithE() {
        int count = 0;
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].endsWith("e")) {
                count++;
            }
        }
        return count;
    }

    public static int lengthOf5() {
        int count = 0;
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].length() == 5) {
                count++;
            }
        }
        return count;
    }

    public static int containsE() {
        int count = 0;
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].contains("e")) {
                count++;
            }
        }
        return count;
    }

    public static boolean containsTE() {
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].contains("te")) {
                return true;
            }
        }
        return false;
    }

    public static void histogram () {
        int[] newArray = new int[20];
        for (int i = 0; i < newArray.length; i++) {
            int count = 0;
            for (String str : stringArr) {
                if (i == str.length()) {
                    count++;
                }
            }
            newArray[i] = count;
            if (count != 0) {
                System.out.println(newArray[i] + " words contain " + i + " letters");
            }
        }

    }

}
