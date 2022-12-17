package TikTakeToe;

import TikTakeToe.Gameboard;

import java.util.InputMismatchException;
import java.util.Scanner;

public class gameLogic extends Gameboard implements player {
    Scanner scanner = new Scanner(System.in);
    Gameboard gameboard = new Gameboard();
    Introduction introduction = new Introduction();
    int row;
    int column;

    boolean playerAWins = false;
    boolean playerBWins = false;


    public void playerMove() {
        boolean playerABMove=true;
        while (!playerAWins && !playerBWins) {
            if (playerABMove) {
                System.out.println(name);
                choseRow();
                playerABMove = false;
            } else {
                System.out.println(name2);
                choseRow();
                playerABMove = true;
            }
        }
    }

    @Override
    public void choseRow() {
        boolean choseRow = true;
        System.out.println("please chose row number between 1-3");
        gameboard.showBoard();

        while (choseRow) {
            try {
                row = Integer.parseInt(scanner.next());
                if (row >= 1 && row <= 3) {
//                    System.out.println("woo");
//                    System.out.println(row);
                    choseRow = false;

                } else {
                    System.out.println("Incorrect input: please chose row number between 1-3");
                }
            } catch (Exception exception) {
                System.out.println("Incorrect input: please chose row number between 1-3");
            }
        }


    }

    @Override
    public void choseColumn() {
        System.out.println("please column row number between 1-3");
        gameboard.showBoard();
        column = scanner.nextInt();

        if (column == 1 || column == 2 || column == 3) {
            System.out.println("woooo");
            System.out.println(column);
        } else {
            while (column != 1 && column != 2 && column != 3) {
                System.out.println(" incorrect response chose row number between 1-3");
                gameboard.showBoard();
                row = scanner.nextInt();
                System.out.println(column);
            }
        }

    }


}
