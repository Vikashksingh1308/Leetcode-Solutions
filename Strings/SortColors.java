/**
 * https://leetcode.com/problems/sort-colors/description/
* */

import java.util.Arrays;

public class SortColors {
        public static void sortColors(int[] nums) {
            int left = 0;
            int right = nums.length-1;
            int move = 0;

            while(move <= right){
                if(nums[move] == 0){
                    int temp = nums[move];
                    nums[move] = nums[left];
                    nums[left] = temp;
                    left++;
                    move++;
                } else if(nums[move] == 2){
                    int temp = nums[move];
                    nums[move] = nums[right];
                    nums[right] = temp;
                    right--;
                } else move++;
            }
        }

    public static void main(String[] args) {
        int[] num = {1,0,2,1,2,2,0,0};
        sortColors(num);
        System.out.println(Arrays.toString(num));
    }
}
