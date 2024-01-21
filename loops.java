import java.util.*;

// code 8 
class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        for (int i = 2; i < n; i++) {
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
}

// code 7
// continue - used to skip an iteration
class Continuee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

// code 6
class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your number: ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
            System.out.println(num);
        } while (true);
    }
}

// code 5
class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while (num > 0) {
            int lastdig = num % 10;
            rev = rev * 10 + lastdig;
            num = num / 10;
        }
        System.out.println(rev);
    }
}

// code 4
class Pattern1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("****");
        }
    }
}

// code 3
class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1, sum = 0;
        while (count <= n) {
            sum = sum + count;
            count++;
        }
        System.out.println(sum);
    }
}

// code 2
class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        while (count <= n) {
            System.out.println(count);
            count++;
        }
    }
}

// code 1
class Count {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 100) {
            System.out.println(count);
            count++;
        }
    }
}
