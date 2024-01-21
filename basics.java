//                                                Basics 
/* how is our code running??
1.source code (.java) 
compiler (compilation)
2. byte class 
java virtual machine (execution)
3. native code 
*/

import java.util.Scanner;
// code 7 
class TypeCasting{
    //explicit type conversion
    public static void main(String[] args){
        float mark = 99.999f;
        int marks = (int) mark;
        System.out.println(marks);
    }
}

// code 6
class TypeConversion{
    //implicit type conversion
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float ab  = sc.nextInt();
        System.out.println(ab);
        // byte < short < int < float < long < double
    }
}

//code 5 
class Area{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        double area = 3.14*r*r;
        System.out.println(area);
    }
}
//code 4 
class Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(x+y);
    }
}

//code 3 
class Variables{
    public static void main(String[] args){
        int a = 10 , b = 20; 
        String name = "Priyanshi";
        System.out.println(a+b);
        System.out.println(name);
    }
}

//code 2 
class Pattern{
    public static void main(String[] args){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
    }
}

//code 1 
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
