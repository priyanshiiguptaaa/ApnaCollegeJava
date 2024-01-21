//                           ASSIGNMENT 3 

import java.util.*;

// Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative.
class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}

// Question 2 : Finish the following code so that it prints
// You have a fever if your temperature is above 100 and otherwise prints You
// don't have a fever.
class Fever {
    public static void main(String[] args) {
        double temp = 103.5;
        if (temp > 100) {
            System.out.println("Fever");
        } else {
            System.out.println("No Fever");
        }
    }
}

// Question 3 : Write a Java program to input week number (1-7) and print day of
// week name using switch case.
class Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                break;
        }
    }
}

// Question 4 :What will be the value of x & y in the following program
// ans = x : false , y : 63

// Question 5 : Write a Java program that takes a year from the user and print
// whether that year is a leap year or not.
class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}
