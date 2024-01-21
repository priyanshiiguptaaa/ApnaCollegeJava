
//for trapping rainwater number of bars > 2 
// in case of ascending or descending order - no water is stored 
// VOLUME OF WATER TRAPPED : (water level - height of bar) * width 
// water level : min (max left , max right)
// to calculate max left and max right we use : AUXILLIARY ARRAYS
import java.util.*;

public class trappingrainwater {
    public static int trapwater(int height[]) {
        int n = height.length;
        // calculate left max boundary
        int MaxLeft[] = new int[n];
        MaxLeft[0] = height[0];
        for (int i = 1; i < n; i++) {
            MaxLeft[i] = Math.max(MaxLeft[i - 1], height[i]);
        }
        // calculate right max boundary
        int MaxRight[] = new int[n];
        MaxRight[n - 1] = height[n - 1]; // fix the index
        for (int i = n - 2; i >= 0; i--) {
            MaxRight[i] = Math.max(MaxRight[i + 1], height[i]);
        }
        // calculate water level
        int trappedwater = 0;
        for (int i = 1; i < n - 1; i++) {
            int waterlevel = Math.min(MaxLeft[i], MaxRight[i]);
            // calculate volume of water level
            trappedwater += waterlevel - height[i]; // fix the calculation
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bars: ");
        int n = sc.nextInt();
        System.out.println("Enter the heights of bars: ");
        int height[] = new int[n];
        for (int i = 0; i < n; i++) { // fix the loop condition
            height[i] = sc.nextInt();
        }
        System.out.print("Enter the width of bars: ");
        int width = sc.nextInt();
        int volume = trapwater(height) * width;
        System.out.println(volume);
    }
}
