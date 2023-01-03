package com.tictactoe.newTry;

import com.tictactoe.SimpleText;

public class Game {

    public void gamePlay(CreatingArrays creatingArrays, Input input, SimpleText simpleText) {

        String startingFigure = input.getStartingFigure();

            if (startingFigure.equals("x")) {
                for (int i = 0; !creatingArrays.isEveryPositionOccupied() && !creatingArrays.isWinner(); i++) {

                    if (!creatingArrays.isWinner()){
                        System.out.println("moves X");
                        creatingArrays.printArrayX(input, simpleText);
                        creatingArrays.winningCheck(input);
                    }

                    if (!creatingArrays.isWinner()){
                        System.out.println("moves O");
                        creatingArrays.printArrayO(input, simpleText);
                        creatingArrays.winningCheck(input);
                    }
                }
            }

            if (startingFigure.equals("o")) {
                for (int i = 0; !creatingArrays.isEveryPositionOccupied() && !creatingArrays.isWinner(); i++) {
                    if (!creatingArrays.isWinner()){
                        System.out.println("moves O");
                        creatingArrays.printArrayO(input, simpleText);
                        creatingArrays.winningCheck(input);
                    }

                    if (!creatingArrays.isWinner()){
                        System.out.println("moves X");
                        creatingArrays.printArrayX(input, simpleText);
                        creatingArrays.winningCheck(input);
                    }
                }
            }
        }

    public void gamePlayComputer(CreatingArrays creatingArrays, Input input, SimpleText simpleText){

        String startingFigure = input.getStartingFigure();

        if(startingFigure.equals("x")){
            for (int i = 0; !creatingArrays.isEveryPositionOccupied() && !creatingArrays.isWinner() ; i++){
                if (!creatingArrays.isWinner()){
                    System.out.println("moves X");
                    creatingArrays.printArrayX(input, simpleText);
                    creatingArrays.winningCheck(input);
                }

                if (!creatingArrays.isWinner()){
                    System.out.println("moves O");
                    creatingArrays.payingAgainstComputerO();
                    creatingArrays.winningCheck(input);
                }
            }
        }

        if(startingFigure.equals("o")){
            for (int i = 0; !creatingArrays.isEveryPositionOccupied() && !creatingArrays.isWinner() ; i++){
                if (!creatingArrays.isWinner()){
                    System.out.println("moves O");
                    creatingArrays.printArrayO(input, simpleText);
                    creatingArrays.winningCheck(input);
                }

                if (!creatingArrays.isWinner()){
                    System.out.println("moves X");
                    creatingArrays.payingAgainstComputerX();
                    creatingArrays.winningCheck(input);
                }
            }
        }
    }
}
