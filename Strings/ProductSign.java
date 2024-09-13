/** Sign of the Product of an Array
 *Implement a function signFunc(x) that returns:
 * 1 if x is positive.
 * -1 if x is negative.
 * 0 if x is equal to 0.
 * You are given an integer array nums. Let product be the product of all values in the array nums.
 * Return signFunc(product).
 * Example:
 * Input: nums = [-1,-2,-3,-4,3,2,1]
 * Output: 1
 * Explanation: The product of all values in the array is 144, and signFunc(144) = 1
 */
public class ProductSign{
    public static void main(String[] args){
        ProductSignFn ps = new ProductSignFn();
        int[] num = new int[] {-1, -2, -3, -4, 3, 2, 1};
        System.out.println(ps.arraySign(num));
    }
}

class ProductSignFn {
    public int arraySign(int[] nums) {
        int sign = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                return 0;
            } else if(nums[i] < 0){
                sign = -sign;
            }
        }
        return sign;
    }
}
