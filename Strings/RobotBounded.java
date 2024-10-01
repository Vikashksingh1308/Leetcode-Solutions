/**
 * https://leetcode.com/problems/robot-bounded-in-circle/description/
 */
public class RobotBounded {
    public static boolean isRobotBounded(String instructions) {
        int x = 0;
        int y = 0;
        int direction = 0;

        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};

        for(char c : instructions.toCharArray()){
            if(c == 'G'){
                x = x + directions[direction][0];
                y = y + directions[direction][1];
            } else if (c == 'L'){
                direction = (direction + 3) % 4;
            } else if (c == 'R'){
                direction = (direction + 1) % 4;
            }
        }

        return (x == 0 && y == 0) || direction != 0;
    }

    public static void main(String[] args) {
        String instruction = "GGLLGG";
        System.out.println(isRobotBounded(instruction));
    }
}
