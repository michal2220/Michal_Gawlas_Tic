package com.tictactoe;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicTacToeApplication {

    public static void main(String[] args) {


        CreatingArrays creatingArrays = new CreatingArrays();
        Input input = new Input();
        Game game = new Game();
        WinningChecker winningChecker = new WinningChecker();
        SimpleText simpleText = new SimpleText();
        ForScanning forScanning = new ForScanning();


        String opponent = input.computerOrPerson();
        if (opponent.equals("computer") || opponent.equals("COMPUTER")) {

            try {
                input.enterArraySize(forScanning);
            } catch (Exception e) {
                input.wrongInputForArray();
            }

            creatingArrays.createArray(input);
            input.whichStartingFigure();
            game.gamePlayComputer(creatingArrays, input, simpleText, winningChecker);
        }

        if (opponent.equals("person") || opponent.equals("PERSON")) {

            try {
                input.enterArraySize(forScanning);
            } catch (Exception e) {
                input.wrongInputForArray();
            }

            creatingArrays.createArray(input);
            input.whichStartingFigure();
            game.gamePlay(creatingArrays, input, simpleText, winningChecker);
        }
    }
}
