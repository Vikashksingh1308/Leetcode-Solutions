/**
 * https://leetcode.com/problems/richest-customer-wealth/description/
 */
public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int sum = Integer.MIN_VALUE;

        for(int person = 0; person < accounts.length; person++) {
            int wealth = 0;
            for(int account = 0; account < accounts[person].length; account++){

                wealth = wealth + accounts[person][account];
            }
            if(wealth > sum){
                sum = wealth;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
}
