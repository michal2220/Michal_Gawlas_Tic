package com.tictactoe;

import java.util.*;

public class Game {

    int realValue;

    List<String> gameList = new ArrayList<>();

    public int enterX_O() {
        String x_o;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please select if You want to start with X or O");

        while (!scan.hasNext("[xoXO]")){
            System.out.println("Please type in x or o or X or O!");
            scan.next();
        }

        x_o = scan.nextLine();
        if (x_o.equals("o") || x_o.equals("O")) {
            realValue = 1;
            System.out.println(x_o + " is starting");
        } else if (x_o.equals("x") || x_o.equals("X")) {
            realValue = 2;
            System.out.println(x_o + " is starting");
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
