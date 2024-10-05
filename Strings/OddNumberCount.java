/**
 * https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/
 */
public class OddNumberCount {
    public static int countOdds(int low, int high) {
        return (high + 1)/2 - low/2;
    }

    public static void main(String[] args) {
        int low = 2;
        int high = 1001;

        System.out.println(countOdds(low, high));
    }
}
