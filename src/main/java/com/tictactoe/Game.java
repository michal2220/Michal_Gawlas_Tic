package com.tictactoe;

import java.util.*;

public class Game {

    private int realValue;
    SimpleText simpleText = new SimpleText();
    List<String> gameList = new ArrayList<>();

    public int enterX_O() {
        String x_o;
        Scanner scan = new Scanner(System.in);
        simpleText.startingWithXOrO();
        while (!scan.hasNext("[xoXO]")){
            simpleText.typeInCorrectXOrO();
            scan.next();
        }
        x_o = scan.nextLine();
        if (x_o.equals("o") || x_o.equals("O")) {
            realValue = 1;
            simpleText.startingWithO();
        } else if (x_o.equals("x") || x_o.equals("X")) {
            realValue = 2;
            simpleText.startingWithX();
        }
        return realValue;
    }

    public int getRealValue() {
        return realValue;
    }

    public void prepareBoard() {
        gameList.add(" ");
        gameList.add(" ");
        gameList.add(" ");
        gameList.add(" ");
        gameList.add(" ");
        gameList.add(" ");
        gameList.add(" ");
        gameList.add(" ");
        gameList.add(" ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        if (realValue != game.realValue) return false;
        if (!Objects.equals(simpleText, game.simpleText)) return false;
        return Objects.equals(gameList, game.gameList);
    }

    @Override
    public int hashCode() {
        int result = realValue;
        result = 31 * result + (simpleText != null ? simpleText.hashCode() : 0);
        result = 31 * result + (gameList != null ? gameList.hashCode() : 0);
        return result;
    }

    public boolean winningCheck(){
        boolean winner=false;
        if (gameList.get(0).equals("x")
                &&gameList.get(1).equals("x")
                &&gameList.get(2).equals("x")){
            simpleText.winner();
            winner=true;
        }

        return winner;
    }
}
