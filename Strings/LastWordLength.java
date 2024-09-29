/**
 * https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=programming-skills
 */
public class LastWordLength {
        public static int lengthOfLastWord(String s) {
            String[] lastWord = s.split(" ");
            return lastWord[lastWord.length-1].length();
        }

    public static void main(String[] args) {
        String input = "I want to learn backend development";
        System.out.println(lengthOfLastWord(input));
    }

}
