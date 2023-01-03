package com.tictactoe;

import com.tictactoe.newTry.CreatingArrays;
import com.tictactoe.newTry.Game;
import com.tictactoe.newTry.Input;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicTacToeApplication {

    public static void main(String[] args) {
//        Game game1 = new Game();
//        VisualPresentation presentation = new VisualPresentation();
//        MakingSureThatPositionIsNumber makingSure = new MakingSureThatPositionIsNumber();
//        GamePlayClassic gamePlayClassic = new GamePlayClassic();
//
//        makingSure.makingPositionsList();
//        presentation.printEmptyBoard();
//        game1.prepareBoard();
//        game1.computerOrPerson();
//        String opponent = game1.getOpponent();
//
//
//        if (opponent.equals("person")) {
//            game1.enterX_O();
//            gamePlayClassic.gamePlayVsPerson(presentation, game1, makingSure);
//        } else if (opponent.equals("computer")){
//            game1.enterX_O();
//            gamePlayClassic.gamePlayVsComputer(presentation, game1, makingSure);
//        }


//        MakingSureThatPositionInNumberBig makingSure = new MakingSureThatPositionInNumberBig();
//        VisualPresentationBig vB = new VisualPresentationBig();
//        Move bigPlay = new Move();
//        GamePlayBig playBig = new GamePlayBig();
//
//        playBig.play10x10(bigPlay,vB,makingSure);


        CreatingArrays arrays = new CreatingArrays();
        Input input = new Input();
        Game game = new Game();
        SimpleText simpleText = new SimpleText();

        String opponent = input.computerOrPerson();

        if(opponent.equals("computer")){
            input.enterArraySize();
            arrays.createArray(input);
            input.whichStartingFigure();

            game.gamePlayComputer(arrays,input,simpleText);
        } if (opponent.equals("person")){
            input.enterArraySize();
            arrays.createArray(input);
            input.whichStartingFigure();

            game.gamePlay(arrays,input,simpleText);
        }

    }

}
