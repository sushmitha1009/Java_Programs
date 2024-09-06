import java.util.*;

public class SubarrayRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Print all subarrays
        printSubarrays(arr, 0, 0);
    }
    
    public static void printSubarrays(int[] arr, int start, int end) {
        // Base case: If we have reached the end of the array
        if (end == arr.length) {
            return;
        }
        // If we have reached the end of the subarray
        else if (start > end) {
            // Move to the next starting point
            printSubarrays(arr, 0, end + 1);
        } else {
            // Print the current subarray
            printArray(arr, start, end);
            // Move to the next subarray
            printSubarrays(arr, start + 1, end);
        }
    }
    
    public static void printArray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
