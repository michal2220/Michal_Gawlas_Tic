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
        game1.computerOrPerson();
        String opponent = game1.getOpponent();


        if (opponent.equals("person")) {
            game1.enterX_O();
            gamePlay.gamePlayVsPerson(presentation, game1, makingSure);
        } else if (opponent.equals("computer")){
            game1.enterX_O();
            gamePlay.gamePlayVsComputer(presentation, game1, makingSure);
        }

    }

}
