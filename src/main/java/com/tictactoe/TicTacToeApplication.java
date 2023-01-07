package com.tictactoe;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicTacToeApplication {

    public static void main(String[] args) {

        CreatingArrays creatingArrays = new CreatingArrays();
        Input input = new Input();
        Game game = new Game();
        WinnigChecker winnigChecker = new WinnigChecker();
        SimpleText simpleText = new SimpleText();
        ForScanning forScanning = new ForScanning();


        String opponent = input.computerOrPerson();
        if (opponent.equals("computer")) {
            input.enterArraySize(forScanning);
            creatingArrays.createArray(input);
            input.whichStartingFigure();

            game.gamePlayComputer(creatingArrays, input, simpleText, winnigChecker);
        }
        if (opponent.equals("person")) {
            input.enterArraySize(forScanning);
            creatingArrays.createArray(input);
            input.whichStartingFigure();

            game.gamePlay(creatingArrays, input, simpleText, winnigChecker);
        }

        }
    }
