package com.tictactoe;

public class Game {

    public void gamePlay(CreatingArrays creatingArrays, Input input, SimpleText simpleText,WinnigChecker winnigChecker) {


        String startingFigure = input.getStartingFigure();

            if (startingFigure.equals("x")) {
                while (!winnigChecker.checkingForTie(creatingArrays) && !winnigChecker.isWinner()) {

                    boolean exceptionOccurred = false;
                    newMethodForX(creatingArrays, input, simpleText, winnigChecker, exceptionOccurred);

                    boolean exceptionOccurredForO=false;
                    newMethodForO(creatingArrays, input, simpleText, winnigChecker, exceptionOccurredForO);
                }
            }

            if (startingFigure.equals("o")) {
                while (!winnigChecker.checkingForTie(creatingArrays) && !winnigChecker.isWinner()) {

                    boolean exceptionOccurredForO=false;
                    newMethodForO(creatingArrays, input, simpleText, winnigChecker, exceptionOccurredForO);

                    boolean exceptionOccurred = false;
                    newMethodForX(creatingArrays, input, simpleText, winnigChecker, exceptionOccurred);
                }
            }
        }

    public void gamePlayComputer(CreatingArrays creatingArrays, Input input, SimpleText simpleText, WinnigChecker winnigChecker){


        String startingFigure = input.getStartingFigure();

        if(startingFigure.equals("x")){
            while (!winnigChecker.checkingForTie(creatingArrays) && !winnigChecker.isWinner()) {

                boolean exceptionOccurred = false;
                newMethodForX(creatingArrays, input, simpleText, winnigChecker, exceptionOccurred);

                if (!winnigChecker.isWinner()){
                    simpleText.printNextMoveO();
                    creatingArrays.payingAgainstComputerO();
                    winnigChecker.winningCheck(input, creatingArrays);
                    winnigChecker.checkingForTie(creatingArrays);
                }
            }
        }

        if(startingFigure.equals("o")){
            while (!winnigChecker.checkingForTie(creatingArrays) && !winnigChecker.isWinner()) {

                boolean exceptionOccurredForO=false;
                newMethodForO(creatingArrays, input, simpleText, winnigChecker, exceptionOccurredForO);

                if (!winnigChecker.isWinner()){
                    simpleText.printNextMoveX();
                    creatingArrays.payingAgainstComputerX();
                    winnigChecker.winningCheck(input, creatingArrays);
                    winnigChecker.checkingForTie(creatingArrays);
                }
            }
        }
    }

    private static void newMethodForO(CreatingArrays creatingArrays, Input input, SimpleText simpleText, WinnigChecker winnigChecker, boolean exceptionOccurredForO) {
        while (!exceptionOccurredForO) {
            try {
                if (!winnigChecker.isWinner() && !winnigChecker.getTie()) {
                    simpleText.printNextMoveO();
                    creatingArrays.printArrayO(input, simpleText);
                    winnigChecker.winningCheck(input, creatingArrays);
                    winnigChecker.checkingForTie(creatingArrays);
                    exceptionOccurredForO =true;
                }
            } catch (Exception e) {
                System.out.println("Wrong data for O");
                exceptionOccurredForO =false;
            }
        }
    }

    private static void newMethodForX(CreatingArrays creatingArrays, Input input, SimpleText simpleText, WinnigChecker winnigChecker, boolean exceptionOccurred) {
        while (!exceptionOccurred) {
            try {
                if (!winnigChecker.isWinner() && !winnigChecker.getTie()) {
                    simpleText.printNextMoveX();
                    creatingArrays.printArrayX(input, simpleText);
                    winnigChecker.winningCheck(input, creatingArrays);
                    winnigChecker.checkingForTie(creatingArrays);
                    exceptionOccurred=true;
                }
            } catch (Exception e) {
                System.out.println("Wrong data");
                exceptionOccurred = false;
            }
        }
    }
}
