/**
 * https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=programming-skills
 */
public class LastWordLength {
        // Not optimized
        /* Here's why:
            Space complexity: split() method creates a new array of words. This requires extra space proportional to the number of words in the string.
            Time complexity: split() internally processes the entire string, which is unnecessary since we only care about the last word.
         */
        public static int lengthOfLastWord(String s) {
            String[] lastWord = s.split(" ");
            return lastWord[lastWord.length-1].length();
        }

        // Optimized version
        public static int lenOfLastWord(String s) {
            int length = 0;
            int i = s.length()-1;

            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }

            while(i>= 0 && s.charAt(i) != ' '){
                length++;
                i--;
            }
            return length;
        }


    public static void main(String[] args) {
        String input = "I want to learn backend development";
        System.out.println(lengthOfLastWord(input));
    }

}
