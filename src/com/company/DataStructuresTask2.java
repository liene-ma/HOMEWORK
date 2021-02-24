package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class DataStructuresTask2 {

    //    static String test = "Mom";
    //    static String test = "Was it a car or a cat I saw?";
    //    static String test = "Madam, in Eden, I'm Adam.";
    static String test = "Yo, banana boy!";
    //    static String test = "Amor a Roma";
    //    static String test = "A veces perderse no es una perdida de tiempo";
    //    static String test = "Kam lemts lidot, tas nerapos";

    public static void main(String[] args) {
        //   Stack();
        Queue();

    }

    public static void Stack() {

        System.out.println(test);

        Stack<Character> palindrome = new Stack<>();

        test = test.toLowerCase().replaceAll("[^a-z]", "");

        for (int i = 0; i < test.length(); i++) {
            palindrome.push(test.charAt(i));
        }

        String reverseTest = "";

        while (!palindrome.isEmpty()) {
            reverseTest = reverseTest + palindrome.pop();
        }
        System.out.println(test);
        System.out.println(reverseTest);

        if (test.equals(reverseTest))
            System.out.println("This is a palindrome");
        else
            System.out.println("This is not a palindrome");

    }

    public static void Queue() {

        System.out.println(test);
        test = test.toLowerCase().replaceAll("[^a-z]", "");

        Queue<Character> queue = new LinkedList<>();

        for (int i = test.length() - 1; i >= 0; i--) {
            queue.add(test.charAt(i));
        }

        String reverseTest = "";

        while (!queue.isEmpty()) {
            reverseTest = reverseTest + queue.remove();
        }
        System.out.println(test);
        System.out.println(reverseTest);

        if (test.equals(reverseTest)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }


}
