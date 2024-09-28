/**
 * https://leetcode.com/problems/roman-to-integer/?envType=study-plan-v2&envId=programming-skills
 * */

import java.util.HashMap;

public class RomanCalc {
    public static int romanToInt(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }

        HashMap<Character, Integer> roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int sum = 0;
        int preValue = 0;

        for(int i = s.length()-1; i>=0; i--){
            int value = roman.get(s.charAt(i));

            if(value < preValue){
                sum -= value;
            } else {
                sum += value;
            }

            preValue = value;
        }
        return sum;
    }

    public static void main(String[] args) {
        String input = "LVIII";
        System.out.println(romanToInt(input));
    }
}

