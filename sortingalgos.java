
//                                                 SORTING TECHNIQUES
//                                                     BUBBLE SORT 
// IDEA - large elements come to end of array by swapping adjacent elements 
import java.util.*;

class BubbleSort {
    public static void bubble(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { // n times
            // for optimization create a variable called swap and increment it everytime
            // inside loop
            // it will help make the complexity of sorted array O(N)
            for (int j = 0; j < n - 2 - i; j++) { // n-1 times
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The entered  array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble(arr);
    }
}
// TIME COMPLEXITY -
// best , worst , average - O(n2)

// SELECTION SORT
// pick the smallest from array and push it in the beginning
class SelectionSort {
    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[minpos];
                    arr[minpos] = temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The entered  array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selection(arr);
    }
}
// TIME COMPLEXITY - O(n2) , lesser complex

// INSERTION SORT
// puts all elements of the array at their current places (just like a deck of
// cards)
class InsertionSort {
    public static void insertion(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int curr = i;
            int prev = i - 1;
            // finding out the correct position
            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion at its position
            arr[prev + 1] = arr[curr];
        }
        System.out.println("The sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The entered  array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertion(arr);
    }
}
// TIME COMPLEXITY - O(n2)

// INBUILT SORT
// import java.util.Arrays;
// Arrays.sort(arr); - by default in ascending order - can also mention si and
// ei
/*
 * for descending order -
 * import java.util.Collections;
 * Arrays.sort(arr , si , ei , Collections.ReverseOrder())
 * it doesnt work on primitive data types
 * create an object Integer to implement
 */
// TIME COMPLEXITY - O(n log n)

// COUNTING SORT
// positive numbers
// min-max range is not too large
// count array stores the frequency of elements
class CountingSort {
    public static void counting(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        // making count array
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // sorting now
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.println("The sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The entered  array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        counting(arr);
    }
}
// TIME COMPLEXITY - O(n + range) - linear in best case
