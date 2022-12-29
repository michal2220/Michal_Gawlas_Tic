package com.tictactoe;

public class GamePlayClassic {


    private int move = 100;
    private int modulo = 0;
    private String figure;
    SimpleText simpleText = new SimpleText();
    boolean positonsAvailable = false;
    boolean winner = false;
    
    public void gamePlayVsPerson(VisualPresentation visualPresentation,
                                 Game game, MakingSureThatPositionIsNumber sureThatPositionIsNumber) {

        positonsAvailable = sureThatPositionIsNumber.positionCheck();
        winner = game.winningCheck();

        while(!winner && !positonsAvailable) {
            if (game.getX_o().equals("o") || game.getX_o().equals("O")) {
                for (int i = 0; !positonsAvailable && !winner; i++) {

                    modulo = i % 2;
                    if (modulo == 0) {
                        movingForX("o", sureThatPositionIsNumber, game, visualPresentation, positonsAvailable, winner);

                        if(!winner) {
                            simpleText.printNextMoveX();
                        }

                    } else if (modulo != 0) {
                        movingForX("x", sureThatPositionIsNumber, game, visualPresentation, positonsAvailable, winner);

                        if(!winner) {
                            simpleText.printNextMoveO();
                        }
                    }
                }
            }
            if (game.getX_o().equals("x") || game.getX_o().equals("X")) {
                for (int i = 0; !positonsAvailable && !winner; i++) {
                    modulo = i % 2;
                    if (modulo == 0) {
                        movingForX("x", sureThatPositionIsNumber, game, visualPresentation, positonsAvailable, winner);

                        if(!winner) {
                            simpleText.printNextMoveO();
                        }

                    } else if (modulo != 0) {
                        movingForX("o", sureThatPositionIsNumber, game, visualPresentation, positonsAvailable, winner);

                        if(!winner) {
                            simpleText.printNextMoveX();
                        }
                    }
                }
            }
        }
    }

    private void movingForX(String o, MakingSureThatPositionIsNumber sureThatPositionIsNumber, Game game, VisualPresentation visualPresentation, boolean positonsAvailable, boolean winner) {
        figure = o;
        sureThatPositionIsNumber.makingSureNumber();
        move = sureThatPositionIsNumber.getMove();
        game.gameList.remove(move);
        game.gameList.add(move, figure);
        visualPresentation.printMove(game);
        positonsAvailable = sureThatPositionIsNumber.positionCheck();
        winner = game.winningCheck();
    }

    public void gamePlayVsComputer (VisualPresentation visualPresentation, Game game,
                                    MakingSureThatPositionIsNumber sureThatPositionIsNumber){

        boolean positonsAvailable = sureThatPositionIsNumber.positionCheck();
        boolean winner = game.winningCheck();

        while(!winner && !positonsAvailable) {
            if (game.getX_o().equals("o") || game.getX_o().equals("O")) {
                for (int i = 0; !positonsAvailable && !winner; i++) {

                    modulo = i % 2;
                    if (modulo == 0) {
                        figure = "o";
                        sureThatPositionIsNumber.makingSureNumber();
                        move = sureThatPositionIsNumber.getMove();
                        game.gameList.remove(move);
                        game.gameList.add(move, figure);
                        visualPresentation.printMove(game);
                        positonsAvailable=sureThatPositionIsNumber.positionCheck();
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
                        positonsAvailable=sureThatPositionIsNumber.positionCheck();
                        winner = game.winningCheck();

                        if(!winner) {
                            simpleText.printNextMoveO();
                        }

                    }
                }
            }
            if (game.getX_o().equals("x") || game.getX_o().equals("X")) {
                for (int i = 0; !positonsAvailable && !winner; i++) {
                    modulo = i % 2;
                    if (modulo == 0) {
                        figure = "x";
                        sureThatPositionIsNumber.makingSureNumber();
                        move = sureThatPositionIsNumber.getMove();
                        game.gameList.remove(move);
                        game.gameList.add(move, figure);
                        visualPresentation.printMove(game);
                        positonsAvailable=sureThatPositionIsNumber.positionCheck();
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
                        positonsAvailable=sureThatPositionIsNumber.positionCheck();
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
