
//                              ASSIGNMENT 5 
//                          FUNCTIONS AND METHODS 
import java.util.*;

//Question 1 : Write a Java method to compute the average of three numbers.
class Average1 {
    public static double avg(int a, int b, int c) {
        double avrg = (a + b + c) / 3;
        return avrg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average: " + avg(a, b, c));
    }
}

// Question 2 : Write a method named isEven that accepts an int argument.
// The method should return true if the argument is even,or false otherwise.
class iseven1 {
    public static void OddEven1(int a) {
        boolean isOdd = true;
        if (a % 2 == 0) {
            isOdd = false;
        } else {
            isOdd = true;
        }
        if (isOdd) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        OddEven1(a);
    }
}

// Question 3 : Write a Java program to check if a number is a palindrome in
// Java?
class Palindrome {
    public static void IsPalindrome(int num) {
        int rev = 0;
        int temp = num;
        while (temp > 0) {
            int lastdig = temp % 10;
            rev = rev * 10 + lastdig;
            temp = temp / 10;
        }
        if (rev == num) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you wish to check: ");
        int a = sc.nextInt();
        IsPalindrome(a);
    }
}

// Question 3 : Use the following methods of the Math class in Java
class Mathop {
    public static void main(String[] args) {
        System.out.println(Math.min(5, 4));
        System.out.println(Math.max(5, 4));
        System.out.println(Math.sqrt(5));
        System.out.println(Math.abs(9.8));
        System.out.println(Math.pow(3, 3));
    }
}

// Question 5 : Write a Java method to compute the sum of the digits in an
// integer
class Digisum {
    public static int sumofdig(int num) {
        int sum = 0;
        while (num > 0) {
            int lastdig = num % 10;
            sum += lastdig;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("The sum of digits: " + sumofdig(a));
    }
}
