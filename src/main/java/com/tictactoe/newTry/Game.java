package com.tictactoe.newTry;

import com.tictactoe.SimpleText;

public class Game {

    public void gamePlay(CreatingArrays creatingArrays, Input input, SimpleText simpleText,WinnigChecker winnigChecker) {

        boolean isTie = winnigChecker.getTie();
        boolean isWinner= winnigChecker.isWinner();

        String startingFigure = input.getStartingFigure();

            if (startingFigure.equals("x")) {
                for (int i = 0; !isTie && !winnigChecker.isWinner(); i++) {

                    if (!winnigChecker.isWinner() && !isTie){
                        simpleText.printNextMoveX();
                        creatingArrays.printArrayX(input, simpleText);
                        winnigChecker.winningCheck(input, creatingArrays);
                        isTie = winnigChecker.checkingForTie(creatingArrays);
                    }

                    if (!winnigChecker.isWinner() && !isTie){
                        simpleText.printNextMoveO();
                        creatingArrays.printArrayO(input, simpleText);
                        winnigChecker.winningCheck(input, creatingArrays);
                        isTie = winnigChecker.checkingForTie(creatingArrays);
                    }
                }
            }

            if (startingFigure.equals("o")) {
                for (int i = 0; !isTie && !winnigChecker.isWinner(); i++) {
                    if (!winnigChecker.isWinner()&&!winnigChecker.checkingForTie(creatingArrays)){
                        simpleText.printNextMoveO();
                        creatingArrays.printArrayO(input, simpleText);
                        winnigChecker.winningCheck(input, creatingArrays);
                        isTie = winnigChecker.checkingForTie(creatingArrays);
                    }

                    if (!winnigChecker.isWinner()&&!winnigChecker.checkingForTie(creatingArrays)){
                        simpleText.printNextMoveX();
                        creatingArrays.printArrayX(input, simpleText);
                        winnigChecker.winningCheck(input, creatingArrays);
                        isTie = winnigChecker.checkingForTie(creatingArrays);
                    }
                }
            }
        }

    public void gamePlayComputer(CreatingArrays creatingArrays, Input input, SimpleText simpleText, WinnigChecker winnigChecker){

        boolean isTie = winnigChecker.getTie();

        String startingFigure = input.getStartingFigure();

        if(startingFigure.equals("x")){
            for (int i = 0; !isTie && !winnigChecker.isWinner(); i++){
                if (!winnigChecker.isWinner()){
                    simpleText.printNextMoveX();
                    creatingArrays.printArrayX(input, simpleText);
                    winnigChecker.winningCheck(input, creatingArrays);
                    isTie = winnigChecker.checkingForTie(creatingArrays);
                }

                if (!winnigChecker.isWinner()){
                    simpleText.printNextMoveO();
                    creatingArrays.payingAgainstComputerO();
                    winnigChecker.winningCheck(input, creatingArrays);
                    isTie = winnigChecker.checkingForTie(creatingArrays);
                }
            }
        }

        if(startingFigure.equals("o")){
            for (int i = 0; !isTie && !winnigChecker.isWinner(); i++){
                if (!winnigChecker.isWinner()){
                    simpleText.printNextMoveO();
                    creatingArrays.printArrayO(input, simpleText);
                    winnigChecker.winningCheck(input, creatingArrays);
                    isTie = winnigChecker.checkingForTie(creatingArrays);
                }

                if (!winnigChecker.isWinner()){
                    simpleText.printNextMoveX();
                    creatingArrays.payingAgainstComputerX();
                    winnigChecker.winningCheck(input, creatingArrays);
                    isTie = winnigChecker.checkingForTie(creatingArrays);
                }
            }
        }
    }
}
