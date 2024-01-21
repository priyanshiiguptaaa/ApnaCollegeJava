
//                           ASSIGNMENT 4 
// Question 1 :How many times 'Hello' is printed?
// ans - two
import java.util.*;

// Question 2: Write a program that reads a set of integers, and then prints the sum of the even and odd integers
class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of integers you want: ");
        int num = sc.nextInt();
        int i = 0, evensum = 0, oddsum = 0;
        while (i < num) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                evensum = evensum + n;
            } else
                oddsum = oddsum + n;
        }
        System.out.println("even sum");
        System.out.println(evensum);
        System.out.println("odd  sum");
        System.out.println(oddsum);
    }
}

// Question 3 :Write a program to find the factorial of any number entered by
// the user
class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENter a number: ");
        int n = s.nextInt();
        int fact = 1;
        if (n == 0 || n == 1) {
            fact = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }
        System.out.println(fact);
    }
}

// Question 4: Write a program to print the multiplication table of a number N,
// entered by the user.
class Multiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(n);
            System.out.print(" * ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(n * i);

        }
    }
}

// Question 5 : What is wrong in the following program?
// ans : Scope of variable is referred to the part of the program where the
// variable can be used.
// Scope of i is limited to the for loop only that is between {and} of the for
// loop.
// There is a display statement after the for loop where i is used outof scope.
// This leads to compilation errors.
// The program will not run and give an error instead. To correct the program,
// the variable i needs to be declared outside the for loop.
