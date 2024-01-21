//                                           ASSIGNMENT 1 
//Question 1: In a program, input 3 numbers : A ,B and C.You have to output the average of these 3 numbers.
import java.util.*;
class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double avg = (a + b + c)/3 ;
        System.out.println(avg);
    }
}

// Question 2: In a program, input the side of a square. You have to output the area of the square.
class AreaSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double area = side * side ;
        System.out.println(area);
    }
}

//Enter cost of 3 items from the user (using float data type)- a pencil, a pen and an eraser. 
//You have to output the total cost of the items back to the user as their bill.
//Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem.
class Bill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double pencil = sc.nextDouble();
        double pen = sc.nextDouble();
        double eraser = sc.nextDouble();
        double billed = pencil + eraser + pen;
        double bill = billed + 18*billed/100;
        System.out.println(bill);
}
}

// Question 4: What will be the type of result in the following Java code?
//Double 

//Question 5: (Advanced) Will the following statementgive any error in Java?
//int$=24;
//no
