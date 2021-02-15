package com.company;
import java.util.Scanner;



public class switchTask {

    public static void main(String[] args) {
        Assignment2_1();
        Assignment2_2();
        Assignment2_3();

    }
    static void Assignment2_1() {
        System.out.println("The first assignment");
        Scanner input = new Scanner(System.in);
        {
            System.out.println("Enter day number");
        }
        int dayNr = input.nextInt();
        switch (dayNr) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a working day!");
                break;
            case 6:
            case 7:
                System.out.println("It is a holiday!");
                break;
            default:
                System.out.println("Enter day of the week 1 - 7");
        }

    }

    static void Assignment2_2() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Grade!");
        char grade = input.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Perfect! You are so clever!");
                break;
            case 'B':
            case 'C':
                System.out.println("Good! But You can do better!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good! You should study!");
            case 'F':
                System.out.println("Fail! You need to repeat the exam!");
            default:
                System.out.println("Grades from A to F");
                return;

        }

    }
    static void Assignment2_3() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first variable");
        int x = input.nextInt();
        System.out.println("Enter second variable");
        int y = input.nextInt();
        System.out.println("Choose the operation: ");
        System.out.println("a = ‘+’ sum of both elements;");
        System.out.println("b = ’-’ do subtraction;");
        System.out.println("c = ’/’ do dividing;");
        System.out.println("d = ‘*’ do multiplication; ");
        System.out.println("e = ‘%’ get remainder when the first element is divided by the second element;");
        System.out.println("f = ‘p’ print out both elements;");
        System.out.println("g = ‘b’ verify which element is bigger; ");
        System.out.println("h = ‘s’ verify which element is smaller;");
        char operation = input.next().charAt(0);

        switch (operation) {
            case 'a':
                System.out.println("Sum is: " + (x+y));
                break;
            case 'b':
                System.out.println("Subtraction is: " + (x-y));
                break;
            case 'c':
                System.out.println("Division is: " + (x/y));
                break;
            case 'd':
                System.out.println("Multiplication is: " + (x*y));
                break;
            case 'e':
                System.out.println("Remainder is: " + (x % y));
                break;
            case 'f':
                System.out.println("Both variables are: " + x + " and " + y);
                break;
            case 'g':
                System.out.println("The biggest variable is: " + Math.max(x,y));
                break;
            case 'h':
                System.out.println("The smallest variable is: " + Math.min(x,y));
                break;
            default:
                System.out.println("Please choose one of the available operations!");
                return;
        }

    }

}


