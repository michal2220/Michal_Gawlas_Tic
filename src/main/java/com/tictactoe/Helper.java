package com.tictactoe;

public class Helper {


    int move=100;
    int modulo = 0;
    String figure;


    public void gamePlay(VisualPresentation visualPresentation, Game game, MakingSureThatPositionIsNumber sureThatPositionIsNumber) {

        int startingValue = game.getRealValue();
        System.out.println(startingValue);
        sureThatPositionIsNumber.makingPositionsList();

        if(startingValue%2!=0){
            for (int i = 0; i<9; i++) {

                modulo = i % 2;
                if (modulo == 0) {
                    figure = "o";
                    sureThatPositionIsNumber.makingSureNumber();
                    move = sureThatPositionIsNumber.getMove();
                    game.gameList.remove(move);
                    game.gameList.add(move, figure);
                    visualPresentation.printMove(game);
                    System.out.println("Now moves: x");

                } else if (modulo != 0) {
                    figure = "x";
                    sureThatPositionIsNumber.makingSureNumber();
                    move = sureThatPositionIsNumber.getMove();
                    game.gameList.remove(move);
                    game.gameList.add(move, figure);
                    visualPresentation.printMove(game);
                    System.out.println("Now moves: o");
                }
            }
        }  if (startingValue%2==0) {
            for (int i = 0; i<9; i++) {
                modulo = i % 2;
                if (modulo == 0) {
                    figure = "x";
                    sureThatPositionIsNumber.makingSureNumber();
                    move = sureThatPositionIsNumber.getMove();
                    game.gameList.remove(move);
                    game.gameList.add(move, figure);
                    visualPresentation.printMove(game);
                    System.out.println("Now moves: o");

                } else if (modulo != 0) {
                    figure = "o";
                    sureThatPositionIsNumber.makingSureNumber();
                    move = sureThatPositionIsNumber.getMove();
                    game.gameList.remove(move);
                    game.gameList.add(move, figure);
                    visualPresentation.printMove(game);
                    System.out.println("Now moves: x");
                }
            }

        }
    }
}
