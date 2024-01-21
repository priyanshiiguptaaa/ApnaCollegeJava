
// ARRAY - List of elements of same datatype placed in contiguous memory location
import java.util.*;

// code 1 - array as a function parameter 
class ArrayFunction {
    public static void update(int marks[]) {
        for (int i = 0; i <= marks.length - 1; i++) {
            marks[i] += 1;
            System.out.print(marks[i] + " ");
        }
    }

    public static void main(String[] args) {
        int marks[] = { 25, 30, 45, 56 };
        update(marks);
    }
}

// code 2 - LINEAR SEARCH
class LinearSearch {
    public static void main(String[] args) {
        int arr[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The entered array is: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the element you wish to search: ");
        int key = sc.nextInt();
        int index = -1;
        for (int i = 1; i <= n; i++) {
            if (arr[i] == key) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("The value is found at positon: " + index);
        }
    }
}

// code 3
class Largest {
    public static void main(String[] args) {
        int arr[] = new int[50];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The entered array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Ensure n is greater than 0 before finding the largest
        if (n > 0) {
            int largest = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
            System.out.println("The largest element in the array is: " + largest);
        } else {
            System.out.println("Array is empty.");
        }
    }
}

// code 4 - BINARY SEARCH
class BinarySearch {
    public static int Search(int arr[], int key) {
        int beg = 0, end = arr.length - 1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return -1;
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

        System.out.print("The entered array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the element you wish to search: ");
        int key = sc.nextInt();
        System.out.println("The element is found at the index: " + Search(arr, key));
    }
}

// code 5 - REVERSING AN ARRAY
class Reverse {
    public static void Rev(int arr[]) {
        int beg = 0, end = arr.length - 1;
        while (beg <= end) {
            int temp = arr[beg];
            arr[beg] = arr[end];
            arr[end] = temp;
            beg++;
            end--;
        }
        System.out.print("The reversed array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
        System.out.print("The original array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Rev(arr);
    }
}

// code 6 - PAIRS IN ARRAY
class ArrayPairs {
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
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.println("(" + i + " , " + j + ")");
            }
        }
    }
}

// code 7 - SUB-ARRAYS
class SubArrays {
    public static void printsubarray(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total number of sub-arrays: " + ts);
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
        printsubarray(arr);
    }
}

// code 8 - MAX SUB-ARRAY SUM - BRUTE FORCE ALGO - Worst time complexity - o(n3)
class MaxSum {
    public static void maxx(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum += arr[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("The maximum sum of sub-array: " + maxsum);
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
        maxx(arr);
    }
}

// code 9 - MAX SUM - PREFIX SUM
class PrefixSum {
    public static int prefixsum(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        // Prefix sum
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("The maximum sum of sub-array: " + maxsum);
        return maxsum; // If you want to return the maxsum value
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

        System.out.print("The entered array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int result = prefixsum(arr);
        // If you want to use the returned value, you can do something with 'result'
    }
}

// code 10 - MAX SUM - KADANE'S ALGORITHM
class KadaneAlgo {
    public static void Kadane(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if (currsum < 0) {
                currsum = 0;
            }
            if (maxsum < currsum) {
                maxsum = currsum;
            }
        }
        System.out.println("The maximum sum of sub-array: " + maxsum);
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
        Kadane(arr);
    }
}
