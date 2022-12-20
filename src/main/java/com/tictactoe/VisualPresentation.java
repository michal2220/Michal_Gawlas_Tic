package com.tictactoe;
import com.tictactoe.Game;

public class VisualPresentation {

    String board;
    public void printEmptyBoard(){
        System.out.println("Welcome to TicTacToe!\n|   |   |   |\n|   |   |   |\n|   |   |   |\n" +
                "Rules are:\n" +
                "-when asked to type in field number please provide number of filed where You want to\n" +
                "set Your figure based on table below:" +
                "\n| 0 | 1 | 2 |\n| 3 | 4 | 5 |\n| 6 | 7 | 8 |\n" +
                "-when asked to type in X or O jest type in the figure you pick\n" +
                "\n" +
                "Exapmle:\n" +
                "field: 3\n" +
                "figure: X\n" +
                "\n|   |   | X |\n|   |   |   |\n|   |   |   |\n" +
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
