package com.tictactoe;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicTacToeApplication {

    public static void main(String[] args) {
        Game game1 = new Game();
        VisualPresentation presentation = new VisualPresentation();
        MakingSureThatPositionIsNumber makingSure = new MakingSureThatPositionIsNumber();
        GamePlay gamePlay = new GamePlay();

        presentation.printEmptyBoard();
        game1.prepareBoard();
        game1.enterX_O();
        gamePlay.gamePlay(presentation,game1,makingSure);


    }

}
