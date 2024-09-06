/**
 * Problem: Merge Strings Alternately
 *
 * Given two strings, word1 and word2, merge them alternately, starting with word1. 
 * If a string is longer, append the additional characters to the end of the merged string.
 *
 * Example:
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 *
 * Approach:
 * - Use two pointers to iterate through both strings simultaneously.
 * - Append characters alternately from both strings.
 * - If one string is longer, append the remaining characters.
 * - Time Complexity: O(n), where n is the sum of the lengths of word1 and word2.
 * - Space Complexity: O(n) for the result string.
 */

public class MergeStringAlternately {
    public static void main(String[] args) {
        // Test case
        Solution solution = new Solution();
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(solution.mergeAlternately(word1, word2)); // Output: "apbqcr"
    }
}

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        int len1 = word1.length();
        int len2 = word2.length();

        // Merge strings alternately
        while (i < len1 || j < len2) {
            if (i < len1) {
                result.append(word1.charAt(i));
                i++;
            }
            if (j < len2) {
                result.append(word2.charAt(j));
                j++;
            }
        }
        return result.toString();
    }
}
