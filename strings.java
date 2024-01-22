//STRINGS - words sentences paragraphs 

import java.util.Scanner;

// code 1 
class Strings {
    public static void printletters(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str2 = new String("xyz");
        // STRINGS ARE IMMUTABLE

        // Input and Output Strings
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        // calculate the length of the length of the string
        System.out.println(name.length());
        // string concatenation
        String firstname = "Priyanshi ";
        String lastname = "Gupta";
        String fullname = firstname + lastname;
        System.out.println(fullname);
        // access index at a certain index
        System.out.println(name.charAt(0));
        // print all letters
        printletters(name);
    }
}

// code 2 - check if the string is palindrome
class CheckPalindrome {
    public static boolean checkpalin(String name) {
        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkpalin(str));
    }
}

// code 3 - SHORTEST PATH

class ShortestPath {
    public static double calcshortpath(int x, int y) {
        double dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return dist;
    }

    public static double checkcoordinates(String s) {
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'N') {
                y++;
            } else if (s.charAt(i) == 'S') {
                y--;
            } else if (s.charAt(i) == 'E') {
                x++;
            } else if (s.charAt(i) == 'W') {
                x--;
            }
        }
        return calcshortpath(x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string of directions: ");
        String str = sc.nextLine();
        double result = checkcoordinates(str);
        System.out.println("Shortest path distance: " + result);
    }
}

// CODE 4 - COMPARE FUNCTION

class Compare {
    public static void main(String[] args) {
        String str = "Priyanshi";
        String str2 = "Priyanshi";
        String str3 = new String("Priyanshi");
        if (str == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are unequal");
        }
        if (str == str3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are unequal");
        }
        if (str.equals(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are unequal");
        }
        if (str.equals(str3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are unequal");
        }
    }
}

// code 5 - STRING FUNCTIONS
class Functions {
    public static void main(String[] args) {
        String str = "Priyanshi";
        // printing substring of a string
        System.out.println(str.substring(0, 5));
        // print largest string in lexicographic way ignoring the case - O(x*n)
        String fruits[] = { "apple", "banana", "pineapple" };
        String largest = fruits[0];
        for (int i = 0; i < 3; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) > 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}

// WHY ARE STRINGS IMMUTABLE - they follow interning (heap)- thus wastes a lot
// of time in loops

// code 6 - STRING BUILDER
class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch); // way to add elements add the end of a string builder
        }
        System.out.println(sb);
        // time complexity - O(26)
    }
}

// code 7 - CONVERT LETTERS TO UPPERCASE
class Uppercase {
    public static void Upper(String s) {
        StringBuilder sb = new StringBuilder("");
        // uppercase function
        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i < s.length() - 1) {
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Upper(str);
    }
}

// code 8 - STRING COMPRESSION
class StringCompression {
    public static void Compresion(String s) {
        String newstr = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += s.charAt(i);
            if (count > 1) {
                newstr += count;
            }
        }
        System.out.println(newstr);
    }

    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Compresion(str);
    }
}
