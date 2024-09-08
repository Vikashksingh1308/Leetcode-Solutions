/**
 * Find the Index of the First Occurrence in a String
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 *
 * Example 1:
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 */

public class SearchString {
    public static void main(String[] args) {
        String haystack = "sabutsad", needle = "sad";
        Find find = new Find();
        System.out.println(find.strStr(haystack, needle));

    }
}

class Find {
    public static int strStr(String s1, String s2) {
        return s1.indexOf(s2);
    }
}
