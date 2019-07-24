import java.util.Scanner;

public class app{
    public static int[][] board;
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        board = new int[9][9];
        board[0][0] = 1;
        Board paper = new Board(board);

        System.out.println(paper.refresh());
        in.close();
    }
}