import java.util.*;

// code 8 
class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
        }
    }
}

// code 7
class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String result = (marks < 33) ? "fail" : "pass";
        System.out.println(result);
    }
}

// code 6
class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String ans = ((a % 2) == 0) ? "even" : "odd";
        System.out.println(ans);
    }
}

// code 5
class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

// code 4
class IncomeTaxCalculator {
    public static void main(String[] args) {
        double tax;
        Scanner sc = new Scanner(System.in);
        double income = sc.nextInt();
        if (income < 1000000) {
            if (income <= 500000) {
                tax = 0;
            } else {
                tax = 20;
            }
        } else {
            tax = 30;
        }
        double addtax = (tax * income) / 100;
        System.out.println(addtax);
    }
}

// code 3
class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}

// code 2
class Larger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a);
        } else if (a == b) {
            System.out.println(" both are equal");
        } else {
            System.out.println(b);
        }
    }
}

// code 1
// if........else
class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("adult: can vote and drive");
        } else {
            System.out.println("not an adult yet");
        }
    }
}
