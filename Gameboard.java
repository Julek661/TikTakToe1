package TikTakeToe;

import java.util.Arrays;

public class Gameboard extends Introduction {
    String[][] board = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
    };

    @Override
    public String toString() {
        return "Gameboard{" +
                "board=" + Arrays.toString(board) +
                '}';
    }

    public Gameboard() {

    }

    public void showBoard() {

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(board[j][j] + "|");
//            }
//            System.out.println(board[i][i]);
//        }

        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }

    public static void main(String[] args) {

    }

}
