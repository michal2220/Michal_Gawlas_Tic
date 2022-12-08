package com.tictactoe;

public class GamePlay {


    int move=100;
    int modulo = 0;
    String figure;
    SimpleText simpleText = new SimpleText();


    public void gamePlay(VisualPresentation visualPresentation, Game game, MakingSureThatPositionIsNumber sureThatPositionIsNumber) {

        int startingValue = game.getRealValue();
        System.out.println(startingValue);
        sureThatPositionIsNumber.makingPositionsList();
        //petla sprawdzajaca czy jest wygrana
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
                    simpleText.printNextMoveX();

                } else if (modulo != 0) {
                    figure = "x";
                    sureThatPositionIsNumber.makingSureNumber();
                    move = sureThatPositionIsNumber.getMove();
                    game.gameList.remove(move);
                    game.gameList.add(move, figure);
                    visualPresentation.printMove(game);
                    simpleText.printNextMoveO();
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
                    simpleText.printNextMoveO();

                } else if (modulo != 0) {
                    figure = "o";
                    sureThatPositionIsNumber.makingSureNumber();
                    move = sureThatPositionIsNumber.getMove();
                    game.gameList.remove(move);
                    game.gameList.add(move, figure);
                    visualPresentation.printMove(game);
                    simpleText.printNextMoveX();
                }
            }

        }
    }
}
