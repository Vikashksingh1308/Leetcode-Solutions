/**
 * https://leetcode.com/problems/robot-return-to-origin/description/
 */
public class RobotReturn {
    public static boolean judgeCircle(String moves) {
        int updown = 0;
        int leftright = 0;

        for(char c: moves.toCharArray()){
            if(c == 'U'){
                updown = updown + 1;
            } else if(c == 'D'){
                updown = updown - 1;
            } else if(c == 'R'){
                leftright = leftright + 1;
            } else {
                leftright = leftright - 1;
            }
        }

        return updown == 0 && leftright == 0;
    }

    public static void main(String[] args) {
        String moves = "UDUDUDLLRR";
        System.out.println(judgeCircle(moves));
    }
}
