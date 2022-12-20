package com.tictactoe;

import java.util.*;

public class Game {

    private int valueOfStartinFigure;
    private String x_o;
    String opponent;
    SimpleText simpleText = new SimpleText();
    Scanner scan = new Scanner(System.in);
    List<String> gameList = new ArrayList<>();

    @Override
    public String toString() {
        return "Game{" +
                "x_o='" + x_o + '\'' +
                ", opponent='" + opponent + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        if (valueOfStartinFigure != game.valueOfStartinFigure) return false;
        if (!Objects.equals(simpleText, game.simpleText)) return false;
        return Objects.equals(gameList, game.gameList);
    }

    @Override
    public int hashCode() {
        int result = valueOfStartinFigure;
        result = 31 * result + (simpleText != null ? simpleText.hashCode() : 0);
        result = 31 * result + (gameList != null ? gameList.hashCode() : 0);
        return result;
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

    public String computerOrPerson(){
        simpleText.playingWithComputerOrPerson();
        opponent=scan.nextLine();
        while (!opponent.equals("computer") && !opponent.equals("person")){
            simpleText.typeInCorrectStartinOpponent();
            opponent=scan.nextLine();
        }
        if (opponent.equals("computer")){
            simpleText.playingAgainstComputer();
        } if (opponent.equals("person")){
            simpleText.playingAgainstPerson();
        }
        return opponent;
    }

    public String getOpponent() {
        return opponent;
    }

    public String getX_o() {
        return x_o;
    }

    public String enterX_O() {

        simpleText.startingWithXOrO();
        while (!scan.hasNext("[xoXO]")){
            simpleText.typeInCorrectXOrO();
            x_o=scan.nextLine();
        }
        x_o=scan.nextLine();
        if (x_o.equals("o") || x_o.equals("O")) {
            simpleText.startingWithO();
        } else if (x_o.equals("x") || x_o.equals("X")) {
            simpleText.startingWithX();
        }
        return  x_o;
    }

    public boolean winningCheck(){
        boolean winner=false;
        if (gameList.get(0).equals("x")
                &&gameList.get(1).equals("x")
                &&gameList.get(2).equals("x")){
            simpleText.winnerX();
            winner=true;
        }
        if (gameList.get(3).equals("x")
                &&gameList.get(4).equals("x")
                &&gameList.get(5).equals("x")){
            simpleText.winnerX();
            winner=true;
        }
        if (gameList.get(6).equals("x")
                &&gameList.get(7).equals("x")
                &&gameList.get(8).equals("x")){
            simpleText.winnerX();
            winner=true;
        }
        if (gameList.get(0).equals("x")
                &&gameList.get(4).equals("x")
                &&gameList.get(8).equals("x")){
            simpleText.winnerX();
            winner=true;
        }
        if (gameList.get(2).equals("x")
                &&gameList.get(4).equals("x")
                &&gameList.get(6).equals("x")){
            simpleText.winnerX();
            winner=true;
        }
        if (gameList.get(0).equals("x")
                &&gameList.get(3).equals("x")
                &&gameList.get(6).equals("x")){
            simpleText.winnerX();
            winner=true;
        }
        if (gameList.get(1).equals("x")
                &&gameList.get(4).equals("x")
                &&gameList.get(7).equals("x")){
            simpleText.winnerX();
            winner=true;
        }
        if (gameList.get(2).equals("x")
                &&gameList.get(5).equals("x")
                &&gameList.get(8).equals("x")){
            simpleText.winnerX();
            winner=true;
        }


        if (gameList.get(0).equals("o")
                &&gameList.get(1).equals("o")
                &&gameList.get(2).equals("o")){
            simpleText.winnerO();
            winner=true;
        }
        if (gameList.get(3).equals("o")
                &&gameList.get(4).equals("o")
                &&gameList.get(5).equals("o")){
            simpleText.winnerO();
            winner=true;
        }
        if (gameList.get(6).equals("o")
                &&gameList.get(7).equals("o")
                &&gameList.get(8).equals("o")){
            simpleText.winnerO();
            winner=true;
        }
        if (gameList.get(0).equals("o")
                &&gameList.get(4).equals("o")
                &&gameList.get(8).equals("o")){
            simpleText.winnerO();
            winner=true;
        }
        if (gameList.get(2).equals("o")
                &&gameList.get(4).equals("o")
                &&gameList.get(6).equals("o")){
            simpleText.winnerO();
            winner=true;
        }

        if (gameList.get(0).equals("o")
                &&gameList.get(3).equals("o")
                &&gameList.get(6).equals("o")){
            simpleText.winnerO();
            winner=true;
        }
        if (gameList.get(1).equals("o")
                &&gameList.get(4).equals("o")
                &&gameList.get(7).equals("o")){
            simpleText.winnerO();
            winner=true;
        }
        if (gameList.get(2).equals("o")
                &&gameList.get(5).equals("o")
                &&gameList.get(8).equals("o")){
            simpleText.winnerO();
            winner=true;
        }

        if(!gameList.get(0).equals(" ")&&
                !gameList.get(1).equals(" ")&&
                !gameList.get(2).equals(" ")&&
                !gameList.get(3).equals(" ")&&
                !gameList.get(4).equals(" ")&&
                !gameList.get(5).equals(" ")&&
                !gameList.get(6).equals(" ")&&
                !gameList.get(7).equals(" ")&&
                !gameList.get(8).equals(" ") && winner==false) {
            System.out.println("TIE!!");
            winner=true;
        }

        return winner;
    }
}
