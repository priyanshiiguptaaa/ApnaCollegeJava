import java.util.*;

// code 1 - HOLLOW RECTANGLE
class HollowRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                // Check if it's the first or last row, or the first or last column
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   "); // Print three spaces for non-border cells
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

// code 2 - INVERTED AND ROTATED HALF PYRAMID
class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  "); // Two spaces for each position
            }
            for (int j = i; j < row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// code 3 - 0-1 TRIANGLE
class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

// code 4 - BUTTERFLY PATTERN
class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // for symmetrical patterns just revers ethe outer loop and keep the inner loop
        // same
        for (int i = n; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// code 5 - SOLID RHOMBUS PATTERN
class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// code 6 - HOLLOW RHOMBUS
class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        int n = sc.nextInt();
        int j;
        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= n; j++) {
                // Check if it's the first or last row, or the first or last column
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   "); // Print three spaces for non-border cells
                }
            }
            System.out.println();
        }
    }
}

// code 7 - DIAMOND PATTERN
class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        int n = sc.nextInt();
        int j;
        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * (i - 1) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * (i - 1) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// code 8 - NUMBER PYRAMID
class Pyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

// PALINDROMIC PATTERNS WITH NUMBERS
class PalindromicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// BUTTERFLY NUMBERS PATTERN
class ButterflyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
