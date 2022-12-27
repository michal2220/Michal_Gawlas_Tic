package com.tictactoe;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Assertions;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class TicTacToeTestSuite {
    VisualPresentation visualPresentation = new VisualPresentation();

    @Test
    void testWinningOInFirstRow(){
        //Given
        Game game = new Game();

        //When
        List<String> test = game.gameList;
        game.gameList.add("o");
        game.gameList.add("o");
        game.gameList.add("o");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        boolean result = game.winningCheck();

        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }
    @Test
    void testWinningOInSecondRow() {
        //Given
        Game game = new Game();

        //When
        List<String> test = game.gameList;
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("o");
        game.gameList.add("o");
        game.gameList.add("o");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        boolean result = game.winningCheck();

        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }
    @Test
    void testWinningOInThirdRow() {
        //Given
        Game game = new Game();
        //When
        List<String> test = game.gameList;
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("o");
        game.gameList.add("o");
        game.gameList.add("o");
        boolean result = game.winningCheck();
        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }
    @Test
    void testWinningOInFirstColumn() {
        //Given
        Game game = new Game();
        //When
        List<String> test = game.gameList;
        game.gameList.add("o");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("o");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("o");
        game.gameList.add("");
        game.gameList.add("");
        boolean result = game.winningCheck();
        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }
    @Test
    void testWinningOInSecondColumn() {
        //Given
        Game game = new Game();
        //When
        List<String> test = game.gameList;
        game.gameList.add("");
        game.gameList.add("o");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("o");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("o");
        game.gameList.add("");
        boolean result = game.winningCheck();
        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }
    @Test
    void testWinningOInThirdColumn() {
        //Given
        Game game = new Game();
        //When
        List<String> test = game.gameList;
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("o");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("o");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("o");
        boolean result = game.winningCheck();
        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }
    @Test
    void testWinningODiagonallyOne() {
        //Given
        Game game = new Game();
        //When
        List<String> test = game.gameList;
        game.gameList.add("o");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("o");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("o");
        boolean result = game.winningCheck();
        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }
    @Test
    void testWinningODiagonallyTwo() {
        //Given
        Game game = new Game();
        //When
        List<String> test = game.gameList;
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("o");
        game.gameList.add("");
        game.gameList.add("o");
        game.gameList.add("");
        game.gameList.add("o");
        game.gameList.add("");
        game.gameList.add("");
        boolean result = game.winningCheck();
        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }

    @Test
    void testWinningXInFirstRow(){
        //Given
        Game game = new Game();

        //When
        List<String> test = game.gameList;
        game.gameList.add("x");
        game.gameList.add("x");
        game.gameList.add("x");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        boolean result = game.winningCheck();

        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }
    @Test
    void testWinningXInSecondRow() {
        //Given
        Game game = new Game();

        //When
        List<String> test = game.gameList;
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("x");
        game.gameList.add("x");
        game.gameList.add("x");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        boolean result = game.winningCheck();

        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }
    @Test
    void testWinningXInThirdRow() {
        //Given
        Game game = new Game();
        //When
        List<String> test = game.gameList;
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("x");
        game.gameList.add("x");
        game.gameList.add("x");
        boolean result = game.winningCheck();
        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }
    @Test
    void testWinningXInFirstColumn() {
        //Given
        Game game = new Game();
        //When
        List<String> test = game.gameList;
        game.gameList.add("x");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("x");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("x");
        game.gameList.add("");
        game.gameList.add("");
        boolean result = game.winningCheck();
        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }
    @Test
    void testWinningXInSecondColumn() {
        //Given
        Game game = new Game();
        //When
        List<String> test = game.gameList;
        game.gameList.add("");
        game.gameList.add("x");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("x");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("x");
        game.gameList.add("");
        boolean result = game.winningCheck();
        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }
    @Test
    void testWinningXInThirdColumn() {
        //Given
        Game game = new Game();
        //When
        List<String> test = game.gameList;
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("x");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("x");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("x");
        boolean result = game.winningCheck();
        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }
    @Test
    void testWinningXDiagonallyOne() {
        //Given
        Game game = new Game();
        //When
        List<String> test = game.gameList;
        game.gameList.add("x");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("x");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("x");
        boolean result = game.winningCheck();
        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }
    @Test
    void testWinningXDiagonallyTwo() {
        //Given
        Game game = new Game();
        //When
        List<String> test = game.gameList;
        game.gameList.add("");
        game.gameList.add("");
        game.gameList.add("x");
        game.gameList.add("");
        game.gameList.add("x");
        game.gameList.add("");
        game.gameList.add("x");
        game.gameList.add("");
        game.gameList.add("");
        boolean result = game.winningCheck();
        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }

    @Test
    void testTie() {
        //Given
        Game game = new Game();
        //When
        List<String> test = game.gameList;
        game.gameList.add("x");
        game.gameList.add("x");
        game.gameList.add("o");
        game.gameList.add("o");
        game.gameList.add("o");
        game.gameList.add("x");
        game.gameList.add("x");
        game.gameList.add("o");
        game.gameList.add("0");
        boolean result = game.winningCheck();
        //Then
        visualPresentation.printMove(game);
        Assertions.assertEquals(true, result);
    }
}
