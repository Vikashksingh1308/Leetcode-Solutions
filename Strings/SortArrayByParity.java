import java.util.Arrays;

public class SortArrayByParity {
    public static void moveEvensToFront(int[] nums) {
        int i = 0; // Pointer from the start
        int j = nums.length - 1; // Pointer from the end

        // While i is less than j, we try to swap even and odd elements
        while (i < j) {
            // Move i to the right until an odd number is found
            while (i < j && nums[i] % 2 == 0) {
                i++;
            }
            // Move j to the left until an even number is found
            while (i < j && nums[j] % 2 != 0) {
                j--;
            }
            // Swap odd number at i with even number at j
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Test case: Array with both even and odd numbers
        int[] nums = {3, 1, 2, 4, 5, 8, 6};
        System.out.println("Original array: " + Arrays.toString(nums));

        // Move all evens to the front
        moveEvensToFront(nums);

        // Output the result
        System.out.println("Array after sorting evens and odds: " + Arrays.toString(nums));
    }
}
