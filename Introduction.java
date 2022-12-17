package TikTakeToe;

import java.util.Scanner;

public class Introduction {
    Scanner scanner = new Scanner(System.in);
    public static String name = "";
    public static String name2 = "";


    public Introduction() {

    }

    public final void introductionMessage() {
        System.out.println("Welcome to tik tak toe game");
    }

    public final void enterName1() {
        System.out.println("player1 enter your name");
        name = scanner.nextLine();
    }

    public final void enterName2() {
        System.out.println("player2 enter your name");
        name2 = scanner.nextLine();
    }

    public static String enterNameResponse() {
        return "Hello " + name + " and " + name2 + "!";

    }

    public final String playerOneFirst() {
        return name + " you go first";
    }


    public static void main(String[] args) {

//        Introduction introduction = new Introduction();
//        introduction.introductionMessage();
//        introduction.enterName1();
//        introduction.enterName2();
//        System.out.println(Introduction.enterNameResponse());
//        gameLogic gameLogic = new gameLogic();
//        gameLogic.playerMove();
        Gameboard gameboard = new Gameboard();
        gameboard.showBoard();

//        gameLogic.choseColumn();

    }
}
