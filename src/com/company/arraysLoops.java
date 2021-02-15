package com.company;
import java.util.Arrays;
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

        double sum = 0;
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

        byte[] gradeArray = new byte [10];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 grades from 0 to 10");
        for (int i = 0; i < gradeArray.length; i++) {
            while (!input.hasNextByte()) {
                System.out.println("Please enter valid number");
                input.next();
            }

            byte grades = input.nextByte();

            if (grades < 0 || grades > 10) {
                System.out.println("Enter valid grades in the range from 0 tp 10");
                i--;
            } else
                gradeArray[i] = grades;
        }
        System.out.println(Arrays.toString(gradeArray));

        int fail = 0;
        int best = 0;

        for (int p : gradeArray) {
            if (p < 4) {
                fail++;
            }
            if (p == 10) {
                best++;
            }
        }
        System.out.println(best++ + " got A \n"  + fail++ +" failed");

        int [] histogram = new int[11];
        int counter;

        for (int i = 0; i < gradeArray.length; i++) {
            counter = 0;
            for (int j = 0; j < gradeArray.length; j++) {
                if (i == gradeArray[j]) {
                    counter++;
                }
            }
            histogram[i] = counter;
        }
        for(int i = 0; i < histogram.length; i++) {
            System.out.println(histogram[i] + " students with the grade " + i);
        }

    }

}
