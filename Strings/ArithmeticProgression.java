/**
 * A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
 * Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.
 *
 * Example:
 * Input: arr = [3,5,1]
 * Output: true
 * Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
 * */

import java.util.Arrays;

public class ArithmeticProgression {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
        boolean result = canMakeArithmeticProgression(arr);
        System.out.println("Can make arithmetic progression: " + result);
    }

    static boolean canMakeArithmeticProgression(int[] arr) {
        // Sorting the array
        Arrays.sort(arr);

        // Common difference
        int diff = arr[1] - arr[0];

        // Check the difference between consecutive elements
        for (int i = 1; i < arr.length - 1; i++) {
            if ((arr[i+1] - arr[i]) != diff) {
                return false;  // Not an arithmetic progression
            }
        }
        return true;  // It's an arithmetic progression
    }
}