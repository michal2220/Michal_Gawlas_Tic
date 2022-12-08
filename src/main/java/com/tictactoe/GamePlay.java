package com.tictactoe;

public class GamePlay {


    private int move = 100;
    private int modulo = 0;
    private String figure;
    SimpleText simpleText = new SimpleText();


    public void gamePlay(VisualPresentation visualPresentation,
                         Game game, MakingSureThatPositionIsNumber sureThatPositionIsNumber) {

        int startingValue = game.getRealValue();
        System.out.println(startingValue);
        sureThatPositionIsNumber.makingPositionsList();
        boolean winner = game.winningCheck();

            if (startingValue % 2 != 0) {
                for (int i = 0; !winner ; i++) {
                    System.out.println("sprawdzanie " + game.winningCheck());
                    System.out.println(game.gameList.get(0)+"p"+
                            game.gameList.get(1)+"p"+
                            game.gameList.get(2));
                    modulo = i % 2;
                    if (modulo == 0) {
                        figure = "o";
                        sureThatPositionIsNumber.makingSureNumber();
                        move = sureThatPositionIsNumber.getMove();
                        game.gameList.remove(move);
                        game.gameList.add(move, figure);
                        visualPresentation.printMove(game);
                        simpleText.printNextMoveX();
                        winner=game.winningCheck();
                    } else if (modulo != 0) {
                        figure = "x";
                        sureThatPositionIsNumber.makingSureNumber();
                        move = sureThatPositionIsNumber.getMove();
                        game.gameList.remove(move);
                        game.gameList.add(move, figure);
                        visualPresentation.printMove(game);
                        simpleText.printNextMoveO();
                        winner=game.winningCheck();
                    }
                }
            }
            if (startingValue % 2 == 0) {
                for (int i = 0; !winner; i++) {
                    modulo = i % 2;
                    if (modulo == 0) {
                        figure = "x";
                        sureThatPositionIsNumber.makingSureNumber();
                        move = sureThatPositionIsNumber.getMove();
                        game.gameList.remove(move);
                        game.gameList.add(move, figure);
                        visualPresentation.printMove(game);
                        simpleText.printNextMoveO();
                        winner=game.winningCheck();

                    } else if (modulo != 0) {
                        figure = "o";
                        sureThatPositionIsNumber.makingSureNumber();
                        move = sureThatPositionIsNumber.getMove();
                        game.gameList.remove(move);
                        game.gameList.add(move, figure);
                        visualPresentation.printMove(game);
                        simpleText.printNextMoveX();
                        winner=game.winningCheck();
                    }
                }

            }
        }
}
