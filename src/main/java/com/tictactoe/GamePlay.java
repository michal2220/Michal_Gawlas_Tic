package com.tictactoe;

public class GamePlay {


    private int move = 100;
    private int modulo = 0;
    private String figure;
    SimpleText simpleText = new SimpleText();

    public void gamePlayVsPerson(VisualPresentation visualPresentation,
                                 Game game, MakingSureThatPositionIsNumber sureThatPositionIsNumber) {

        sureThatPositionIsNumber.makingPositionsList();
        boolean winner = game.winningCheck();
        while(!winner) {
            if (game.getX_o().equals("o") || game.getX_o().equals("O")) {
                for (int i = 0; !winner; i++) {

                    modulo = i % 2;
                    if (modulo == 0) {
                        figure = "o";
                        sureThatPositionIsNumber.makingSureNumber();
                        move = sureThatPositionIsNumber.getMove();
                        game.gameList.remove(move);
                        game.gameList.add(move, figure);
                        visualPresentation.printMove(game);
                        winner = game.winningCheck();
                        if(!winner) {
                            simpleText.printNextMoveX();
                        }
                    } else if (modulo != 0) {
                        figure = "x";
                        sureThatPositionIsNumber.makingSureNumber();
                        move = sureThatPositionIsNumber.getMove();
                        game.gameList.remove(move);
                        game.gameList.add(move, figure);
                        visualPresentation.printMove(game);
                        winner = game.winningCheck();
                        if(!winner) {
                            simpleText.printNextMoveO();
                        }
                    }
                }
            }
            if (game.getX_o().equals("x") || game.getX_o().equals("X")) {
                for (int i = 0; !winner; i++) {
                    modulo = i % 2;
                    if (modulo == 0) {
                        figure = "x";
                        sureThatPositionIsNumber.makingSureNumber();
                        move = sureThatPositionIsNumber.getMove();
                        game.gameList.remove(move);
                        game.gameList.add(move, figure);
                        visualPresentation.printMove(game);
                        winner = game.winningCheck();
                        if(!winner) {
                            simpleText.printNextMoveO();
                        }

                    } else if (modulo != 0) {
                        figure = "o";
                        sureThatPositionIsNumber.makingSureNumber();
                        move = sureThatPositionIsNumber.getMove();
                        game.gameList.remove(move);
                        game.gameList.add(move, figure);
                        visualPresentation.printMove(game);
                        winner = game.winningCheck();
                        if(!winner) {
                            simpleText.printNextMoveX();
                        }
                    }
                }

            }
        }
    }

    public void gamePlayVsComputer (VisualPresentation visualPresentation, Game game,
                                    MakingSureThatPositionIsNumber sureThatPositionIsNumber){

        sureThatPositionIsNumber.makingPositionsList();
        boolean winner = game.winningCheck();
        while(!winner) {
            if (game.getX_o().equals("o") || game.getX_o().equals("O")) {
                for (int i = 0; !winner; i++) {

                    modulo = i % 2;
                    if (modulo == 0) {
                        figure = "o";
                        sureThatPositionIsNumber.makingSureNumber();
                        move = sureThatPositionIsNumber.getMove();
                        game.gameList.remove(move);
                        game.gameList.add(move, figure);
                        visualPresentation.printMove(game);
                        winner = game.winningCheck();
                        if(!winner) {
                            simpleText.printNextMoveX();
                        }
                    } else if (modulo != 0) {
                        figure = "x";
                        sureThatPositionIsNumber.computerMove();
                        move = sureThatPositionIsNumber.getMove();
                        game.gameList.remove(move);
                        game.gameList.add(move, figure);
                        visualPresentation.printMove(game);
                        winner = game.winningCheck();
                        if(!winner) {
                            simpleText.printNextMoveO();
                        }
                    }
                }
            }
            if (game.getX_o().equals("x") || game.getX_o().equals("X")) {
                for (int i = 0; !winner; i++) {
                    modulo = i % 2;
                    if (modulo == 0) {
                        figure = "x";
                        sureThatPositionIsNumber.makingSureNumber();
                        move = sureThatPositionIsNumber.getMove();
                        game.gameList.remove(move);
                        game.gameList.add(move, figure);
                        visualPresentation.printMove(game);
                        winner = game.winningCheck();
                        if(!winner) {
                            simpleText.printNextMoveO();
                        }

                    } else if (modulo != 0) {
                        figure = "o";
                        sureThatPositionIsNumber.computerMove();
                        move = sureThatPositionIsNumber.getMove();
                        game.gameList.remove(move);
                        game.gameList.add(move, figure);
                        visualPresentation.printMove(game);
                        winner = game.winningCheck();
                        if(!winner) {
                            simpleText.printNextMoveX();
                        }
                    }
                }

            }
        }
    }
}
