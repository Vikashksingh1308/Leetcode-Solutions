public class RepeatedSubstring {
    public static void main(String[] args){
    RepeatedSubstringPattern r = new RepeatedSubstringPattern();
    System.out.println(RepeatedSubstringPattern.repeatedSubstringPattern("abab"));
    }
}

class RepeatedSubstringPattern{
    public static boolean repeatedSubstringPattern(String s){
        // Concatenate string to itself
        String ss = s + s;

        // Remove the first and last characters and check if the original string is in the modified concatenated string

        return ss.substring(1, ss.length() - 1).contains(s);
    }
}