/**
 * https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/description/?envType=study-plan-v2&envId=programming-skills
 */
public class TicTacWinner {
    public static String tictactoe(int[][] moves) {

        //make a grid to know what player has made want move
        int[][] grid = new int[3][3];
        boolean isPlayerA = true;

        for(int[] move : moves){
            int row = move[0];
            int col = move[1];
            grid[row][col] = isPlayerA ? 1 : -1;
            isPlayerA = !isPlayerA;
        }

        if(TicTacWinner.checkWinner(grid, 1)) return "A";
        if(TicTacWinner.checkWinner(grid, -1)) return "B";

        return moves.length == 9 ? "Draw" : "Pending";
    }

    private static boolean checkWinner(int[][] grid, int player){
        //for rows and coloumns
        for(int i = 0; i < 3; i++){
            //col
            if(grid[i][0] == player && grid[i][1] == player && grid[i][2] == player) return true;
            //row
            if(grid[0][i] == player && grid[1][i] == player && grid[2][i] == player) return true;
        }

        if(grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) return true;
        if(grid[0][2] == player && grid[1][1] == player && grid[2][0] == player) return true;

        return false;
    }

    public static void main(String[] args) {
        int[][] moves = {{0,0}, {2,0}, {1,1}, {2,1}, {2,2}};
        System.out.println(tictactoe(moves));
    }
}
