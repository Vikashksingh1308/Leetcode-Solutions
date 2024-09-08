import java.util.Arrays;
/**
 * Valid Anagram
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * using all the original letters exactly once.
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 */

public class Anagram {
    public static void main(String[] args) {
        String w1 = "silent";
        String w2 = "listen";
        CheckAnagram checkAnagram = new CheckAnagram();
        System.out.println(checkAnagram.isAnagram(w1, w2));
    }
}

class CheckAnagram {
    public static Boolean isAnagram(String s, String t) {
        char[] sortS = s.toCharArray();
        char[] sortT = t.toCharArray();
        Arrays.sort(sortS);
        Arrays.sort(sortT);

        if(s.length() != t.length()){
            return false;
        } else {
            return Arrays.equals(sortS, sortT);
        }
    }
}