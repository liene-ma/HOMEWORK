package com.company;
import java.util.Scanner;
import java.util.Calendar;


public class Branching1 {

    public static void main (String[] args) {
        Assignment1_1();
        Assignment1_2();
        Assignment1_3();
        Assignment1_4();
        Assignment1_5();
    }

        static void Assignment1_1() {
            System.out.println("First task");

            short X = 2871;
            short Y = -1984;
            if (X > Y) {
                System.out.println(X + " is the largest variable");
                System.out.println(Y + " is the smallest variable");
            } else {
                System.out.println(Y + " is the largest variable");
                System.out.println(X + " is the smallest variable");
            }
            if (X == Y) {
                System.out.println("The variables are equal");
            } else {
                System.out.println("The variables are not equal");
            }
            if (X % 2 == 0) {
                System.out.println(X + " is even");
            } else {
                System.out.println(X + " is odd");
            }
            if (Y % 2 == 0) {
                System.out.println(Y + " is even");
            } else {
                System.out.println(Y + " is odd");
            }
            if (X > 0) {
                System.out.println(X + " is a positive number");
            } else {
                System.out.println(X + " is a negative number");
            }
            if (Y > 0) {
                System.out.println(Y + " is a positive number");
            } else {
                System.out.println(Y + " is a negative number");
            }
            if (X < 100) {
                System.out.println(X + " is less than 100");
            }
            else if (Y < 100) {
                System.out.println(Y + " is less than 100");
            } else {
                System.out.println(X + " no numbers are less than 100");
            }
        }

        static void Assignment1_2() {
            System.out.println("Second task");

            Scanner input = new Scanner(System.in); {
            System.out.println("Please enter time");}
            int time = input.nextInt();

            if (time <= 12) {
                System.out.println("Good Morning Sunshine!");
            }
            else if (time >= 13 && time <= 19) {
                System.out.println("Good Afternoon! Work hard!");
            }
            else if (time >= 20 && time <= 24) {
                System.out.println("Good Evening, Get some rest!");
            }
            else {
                System.out.println("Please choose a valid time between 1 and 24 hours!");
            }

        }


        static void Assignment1_3() {
            System.out.println("Third task");

            Scanner input = new Scanner(System.in);
            {
                System.out.println("Please enter the day: ");
            }
            int day = input.nextInt();
            {
                System.out.println("Please enter the month: ");
            }
            int month = input.nextInt();
            {
                System.out.println("Please enter the year: ");
            }
            int year = input.nextInt();
            {
                System.out.println("Please select date format: 1 - YYYY/MM/DD 2 - YYYY.MM.DD");
            }
            int format = input.nextInt();

            if (day <= 0 || day > 31 || month <= 0 || month > 12 || year <= 0) {
                System.out.println("The date is not valid!");
            } else if (month == 2 && day > 28) {
                System.out.println("The date is not valid!");
            } else if (month == 4 || month == 6 || month == 9 || month == 11 && day > 30) {
                System.out.println("The date is not valid!");
            } else if (year < 0) {
                System.out.println("The date is not valid!");
            } else {
                if (format == 1) {
                    System.out.println("Your Date is: " + year + "/" + month + "/" + day);
                } else {
                    System.out.println("Your Date is: " + year + "." + month + "." + day);
                }
            }

        }
        static void Assignment1_4() {
            System.out.println("Fourth task");

            Scanner input = new Scanner(System.in);
            System.out.println("The day number is: ");
            int day = input.nextInt();
            if(day < 1 || day > 365) {
                System.out.println("Please enter number from 1 to 365!");
            }
            else {
                Calendar c = Calendar.getInstance();
                c.set(Calendar.DAY_OF_YEAR, day);
                int monthNum = c.get(Calendar.MONTH);
                {
                    System.out.println("The month is: " + monthNum);
                }
            }
        }

        static void Assignment1_5() {
            System.out.println("Fifth task");

            Scanner input = new Scanner(System.in); {
                System.out.println("How many hours have you worked?");}
            int workingHoursInDay = input.nextInt();

            if (workingHoursInDay <=0 && workingHoursInDay > 24) {
                System.out.println("Invalid hours. Enter 1 to 24");
            }
            else if (workingHoursInDay >= 1 && workingHoursInDay <= 8) {
                System.out.println("Your salary is: " + (workingHoursInDay * 10) + " Eur");
            }
            else if (workingHoursInDay > 8) {
                System.out.println("Your salary is: " + (80 + (workingHoursInDay - 8) * 15) + " Eur");
            }

        }

    }

