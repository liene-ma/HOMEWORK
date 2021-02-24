package com.company;

public class stringsTask5 {
//    static String test = "Mom";
//    static String test = "Was it a car or a cat I saw?";
//    static String test = "Madam, in Eden, I'm Adam.";
//    static String test = "Yo, banana boy!";
//    static String test = "Amor a Roma";
//    static String test = "A veces perderse no es una perdida de tiempo";
    static String test = "Kam lemts lidot, tas nerapos";


    public static void main (String[] args) {

        System.out.println(test); //print out the sentence

        String letters = justLetters(); //the new string with just letters
        System.out.println(letters);

        StringBuffer lettersRev = new StringBuffer(letters); //reverse the letters using StringBuffer
        lettersRev.reverse();
        System.out.println(lettersRev);

        String reverse = lettersRev.toString(); //StringBuffer to String

        System.out.println("It is a palindrome: " + letters.equals(reverse)); //check if it is a palindrome

    }

    public static String justLetters() { //method to convert string sentence to just letters
        test = test.toLowerCase();
        String letters = test.replaceAll("[^a-z]", "");
        return letters;
    }

}