import java.util.*;

// functions defined inside the class = methods 
// code 1 
class Sum1 {
    public static void calsum() {
        System.out.print("Enter the two numbers: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        calsum();
    }
}

// code 2 
class Sum2 {
public static void calsum(int num1, int num2) { // formal parameters or parameters at function defintion
int c = num1 + num2;
System.out.println(c);
  }
  
  public static int main(String[] args) {
  System.out.print("Enter the two numbers: ");
  Scanner s = new Scanner(System.in);
  int a = s.nextInt();
  int b = s.nextInt();
  calsum(a, b); // arguments or actual parameters at function call
  return 0;
  }
  }
 

// WHAT HAPPENS IN MEMORY ??
// stack call helps in calling functions. The main function is kept in stack
// frame.

// call by value - creates a copy of variable and pass them to funtion
// Java always calls by value

// code 3
class Factorials {
    public static int fact(int num) {
        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = fact(n);
        System.out.println("Factorial= " + a);
    }
}

// code 4
class Binomial {
    public static int fact(int num) {
        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static int Binomials(int n, int r) {
        int a = fact(n);
        int b = fact(r);
        int c = fact(n - r);
        int bin = a / (b * c);
        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        int ans = Binomials(n, r);
        System.out.println("Binomial Coefficient: " + ans);
    }
}

// TYPES OF FUNCTIONS - user-defined and in-built

// FUNCION OVERLOADING - functions with same name but different parameters
// code 5
class Overloading {
    public static float sum(float a, float b) { // overloading using datatypes
        return a + b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) { // overloading using parameters
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3, 5, 6));
        System.out.println(sum(3.5f, 5.5f));
    }
}

// code 6
class IsPrime {
    public static void PrimeCheck(int n) {
        boolean isprime = true;
        for (int i = 2; i < Math.sqrt(n); i++) { // optimized method
            if (n % i == 0) {
                isprime = false;
            } else {
                isprime = true;
            }
        }
        if (isprime == true) {
            System.out.println("prime");
        } else {
            System.out.println("composite");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrimeCheck(n);
    }
}

// code 7
class PrimesInRange {
    public static boolean PrimeCheck(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int num) {
        for (int i = 2; i <= num; i++) {
            if (PrimeCheck(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        printPrimes(n);
    }
}

// code 8
class BinarytoDecimal {
    public static int convert(int bin) {
        int decimal = 0;
        int power = 0;

        while (bin > 0) {
            int lastDigit = bin % 10;
            decimal += lastDigit * Math.pow(2, power);
            bin /= 10;
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int bin = sc.nextInt();
        System.out.println("The decimal conversion: " + convert(bin));
    }
}

// code 9
class DecimalToBinary {
    public static int convert(int dec) {
        int bin = 0;
        int power = 0;
        while (dec > 0) {
            int rem = dec % 2;
            bin += rem * Math.pow(10, power);
            dec /= 2;
            power++;
        }
        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int dec = sc.nextInt();
        System.out.println("The binary conversion: " + convert(dec));
    }
}

// BLOCK OF VARIABLES - Block scope , Method scope
