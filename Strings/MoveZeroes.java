/**
 * Move Zeroes
 * Given an integer array nums, move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 *
 * Example:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args){
        MoveZero moveZero = new MoveZero();
        int[] arr = new int[]{0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(moveZero.moveZeroes(arr)));


    }
}

class MoveZero {
    public int[] moveZeroes(int[] nums) {
        int nonZeroPos = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[nonZeroPos];
                nums[nonZeroPos] = nums[i];
                nums[i] = temp;
                nonZeroPos+=1;
            }
        }
        return nums;
    }
}