package com.tictactoe;

public class Game {

    public void gamePlay(CreatingArrays creatingArrays, Input input, SimpleText simpleText, WinningChecker winningChecker) {


        String startingFigure = input.getStartingFigure();

            if (startingFigure.equals("x") || startingFigure.equals("X")) {
                while (!winningChecker.checkingForTie(creatingArrays) && !winningChecker.isWinner()) {

                    boolean exceptionOccurred = false;
                    newMethodForX(creatingArrays, input, simpleText, winningChecker, exceptionOccurred);

                    boolean exceptionOccurredForO=false;
                    newMethodForO(creatingArrays, input, simpleText, winningChecker, exceptionOccurredForO);
                }
            }

            if (startingFigure.equals("o") || startingFigure.equals("O")) {
                while (!winningChecker.checkingForTie(creatingArrays) && !winningChecker.isWinner()) {

                    boolean exceptionOccurredForO=false;
                    newMethodForO(creatingArrays, input, simpleText, winningChecker, exceptionOccurredForO);

                    boolean exceptionOccurred = false;
                    newMethodForX(creatingArrays, input, simpleText, winningChecker, exceptionOccurred);
                }
            }
        }

    public void gamePlayComputer(CreatingArrays creatingArrays, Input input, SimpleText simpleText, WinningChecker winningChecker){


        String startingFigure = input.getStartingFigure();

        if(startingFigure.equals("x") || startingFigure.equals("X")){
            while (!winningChecker.checkingForTie(creatingArrays) && !winningChecker.isWinner()) {

                boolean exceptionOccurred = false;
                newMethodForX(creatingArrays, input, simpleText, winningChecker, exceptionOccurred);

                if (!winningChecker.isWinner()){
                    simpleText.printNextMoveO();
                    creatingArrays.payingAgainstComputerO();
                    winningChecker.winningCheck(input, creatingArrays);
                    winningChecker.checkingForTie(creatingArrays);
                }
            }
        }

        if(startingFigure.equals("o") || startingFigure.equals("O")){
            while (!winningChecker.checkingForTie(creatingArrays) && !winningChecker.isWinner()) {

                boolean exceptionOccurredForO=false;
                newMethodForO(creatingArrays, input, simpleText, winningChecker, exceptionOccurredForO);

                if (!winningChecker.isWinner()){
                    simpleText.printNextMoveX();
                    creatingArrays.payingAgainstComputerX();
                    winningChecker.winningCheck(input, creatingArrays);
                    winningChecker.checkingForTie(creatingArrays);
                }
            }
        }
    }

    private static void newMethodForO(CreatingArrays creatingArrays, Input input, SimpleText simpleText, WinningChecker winningChecker, boolean exceptionOccurredForO) {
        while (!exceptionOccurredForO) {
            try {
                if (!winningChecker.isWinner() && !winningChecker.getTie()) {
                    simpleText.printNextMoveO();
                    creatingArrays.printArrayO(input, simpleText);
                    winningChecker.winningCheck(input, creatingArrays);
                    winningChecker.checkingForTie(creatingArrays);
                    exceptionOccurredForO =true;
                }
            } catch (Exception e) {
                System.out.println("Wrong data for O");
                exceptionOccurredForO =false;
            }
        }
    }

    private static void newMethodForX(CreatingArrays creatingArrays, Input input, SimpleText simpleText, WinningChecker winningChecker, boolean exceptionOccurred) {
        while (!exceptionOccurred) {
            try {
                if (!winningChecker.isWinner() && !winningChecker.getTie()) {
                    simpleText.printNextMoveX();
                    creatingArrays.printArrayX(input, simpleText);
                    winningChecker.winningCheck(input, creatingArrays);
                    winningChecker.checkingForTie(creatingArrays);
                    exceptionOccurred=true;
                }
            } catch (Exception e) {
                System.out.println("Wrong data");
                exceptionOccurred = false;
            }
        }
    }
}
