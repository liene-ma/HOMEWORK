package com.company;
import java.util.Scanner;

public class arraysLoops {

    public static void main(String[] args) {
        nr1();
        nr2();
        nr3();
    }

    static void nr1() {
        int [] myArray = {5, 3, 7, 6, 2, 8};

        System.out.println("This is For Loop:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        System.out.println("This is For Each Loop:");
        for (int tempArray : myArray) {
            System.out.println(tempArray);
        }

        System.out.println("This is While Loop:");
        int i = 0;
        while (i < myArray.length) {
            System.out.println(myArray[i]);
            i++;
        }

        System.out.println("This is Do While Loop:");
        i = 0;
        do {
            System.out.println(myArray[i]);
            i++;
        } while (i < myArray.length);

        System.out.println("For Each Loop is the best in this case");

    }

    static void nr2() {

        int [] myArray2 = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};

        System.out.println("Second task. From the array 10, 4, -4, 7, 0, 9, 1, 3, 7, -5");

        System.out.println("Negative numbers");
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray2[i] < 0) {
                System.out.println(myArray2[i]);
            }
        }

        System.out.println("Odd numbers");
        for (int i : myArray2) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        int odd = 0;
        for (int i : myArray2) {
            if (i % 2 != 0) {
                odd++;
            }
        }
        System.out.println("There are " + odd + " odd numbers");

        for(int i = 0; i < myArray2.length; i++) {
            for(int j = i+1; j < myArray2.length; j++) {
                if(myArray2[i]==myArray2[j]) {
                    System.out.println("The elements that duplicate: " + myArray2[i]);
                }
            }
        }

        System.out.println("Each second element: ");
        for (int i = 0; i < myArray2.length; i = i+2) {
            System.out.println(myArray2[i]);
        }

        int sum = 0;
        for (int i = 0; i < myArray2.length; i++)
            sum = sum + myArray2[i];
        double average = sum / myArray2.length;
        System.out.println("The average value of the array is: " + average);

        int counter = 0;
        for (int i : myArray2) {
            if (i < average) {
                counter++;
            }
        }
        System.out.println(counter + " elements are smaller than average " + average);

    }

    static void nr3() {
        /*Write a program to do multiple actions with a grade array:
        ● Create a byte array with length 10. The grades will be stored in the array.
        ● Use the Scanner class that allows the user to fill the array with user input data from the console.
        a. Do verification of the type of each input value. Input values should be as numbers.
        The function hasNextShort() can be used from the Scanner class.
        b. Do verification of the number range of each input value. Input values need to be in range 0 to +10. */
        byte[] myArray3 = new byte[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter grades from 0 to 10");
        byte myArray3 = input.nextByte() {
            int i  = 0;
            while (i < 10) {
                System.out.println("Enter your grade");
            }
        }
        if (myArray3 < 0 || myArray3 > 10) {
            System.out.println("Enter valid grades in the range from 0 tp 10");
        }
       /* ● Do calculations how many students failed (the grade is smaller than 4).
        ● Do calculations how many students got an “A”(the grade is 10).
        ● Create a histogram of number frequencies in the grade array. */


    }
}
