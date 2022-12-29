package com.tictactoe;
import com.tictactoe.Game;

public class VisualPresentation {

    String board;
    public void printEmptyBoard(){
        System.out.println("Welcome to TicTacToe!\n|   |   |   |\n|   |   |   |\n|   |   |   |\n" +
                "Rules are:\n" +
                "You pick if You want to play with computer or person\n"+
                "Next You pick if You want to start with X or O\n"+
                "When asked to type in field number please provide number of filed where You want to\n" +
                "set Your figure based on table below:" +
                "\n| 1 | 2 | 3 |\n| 4 | 5 | 6 |\n| 7 | 8 | 9 |\n" +
                "ENJOY! :)" +
                "\n\n");
    }

    public void printMove(Game game){
        board=("\n| "+game.gameList.get(0)+" | "+game.gameList.get(1)+" | "+game.gameList.get(2)+" |\n" +
                "| "+game.gameList.get(3)+" | "+game.gameList.get(4)+" | "+game.gameList.get(5)+" |\n"+
                "| "+game.gameList.get(6)+" | "+game.gameList.get(7)+" | "+game.gameList.get(8)+" |\n");
        System.out.println(board);

    }

}
