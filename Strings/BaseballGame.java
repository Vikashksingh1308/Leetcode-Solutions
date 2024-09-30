/**
 *https://leetcode.com/problems/baseball-game/description/?envType=study-plan-v2&envId=programming-skills
 */

import java.util.Stack;

public class BaseballGame {
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("C")){
                if(!stack.isEmpty()){
                    stack.pop();
                }

            } else if(operations[i].equals("D")){
                if(!stack.isEmpty()){
                    stack.push(stack.peek()*2);
                }
            } else if(operations[i].equals("+")) {
                if(!stack.isEmpty()){
                    stack.push(stack.peek() + stack.get(stack.size() - 2));
                }
            } else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        int score = 0;
        for(int element: stack){
            score = score + element;
        }
        return score;
    }

    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        System.out.println(calPoints(ops));
    }
}
