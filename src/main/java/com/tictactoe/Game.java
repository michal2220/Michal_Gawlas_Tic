package com.tictactoe;

import java.util.*;

public class Game {

    int realValue;
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

}
