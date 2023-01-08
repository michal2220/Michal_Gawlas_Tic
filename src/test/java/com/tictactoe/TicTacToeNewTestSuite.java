package com.tictactoe;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TicTacToeNewTestSuite {


    WinnigChecker winnigChecker = new WinnigChecker();
    CreatingArrays creatingArraysMock = mock(CreatingArrays.class);


    @Test
    void testWinningXInFirstRow() {


        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = "x";
        bigArray[1][0] = "x";
        bigArray[2][0] = "x";
        bigArray[0][1] = " ";
        bigArray[1][1] = " ";
        bigArray[2][1] = " ";
        bigArray[0][2] = " ";
        bigArray[1][2] = " ";
        bigArray[2][2] = " ";

        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);

        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();

        //Then

        Assertions.assertTrue(checker);

    }

    @Test
    void testWinningXInSecondRow() {

        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = " ";
        bigArray[1][0] = " ";
        bigArray[2][0] = " ";
        bigArray[0][1] = "x";
        bigArray[1][1] = "x";
        bigArray[2][1] = "x";
        bigArray[0][2] = " ";
        bigArray[1][2] = " ";
        bigArray[2][2] = " ";
        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();
        //Then
        Assertions.assertTrue(checker);

    }

    @Test
    void testWinningXInThirdRow() {

        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = " ";
        bigArray[1][0] = " ";
        bigArray[2][0] = " ";
        bigArray[0][1] = " ";
        bigArray[1][1] = " ";
        bigArray[2][1] = " ";
        bigArray[0][2] = "x";
        bigArray[1][2] = "x";
        bigArray[2][2] = "x";
        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();
        //Then
        Assertions.assertTrue(checker);

    }

    @Test
    void testWinningXInFirstColumn() {

        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = "x";
        bigArray[1][0] = " ";
        bigArray[2][0] = " ";
        bigArray[0][1] = "x";
        bigArray[1][1] = " ";
        bigArray[2][1] = " ";
        bigArray[0][2] = "x";
        bigArray[1][2] = " ";
        bigArray[2][2] = " ";
        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();
        //Then
        Assertions.assertTrue(checker);

    }

    @Test
    void testWinningXInSecondColumn() {

        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = " ";
        bigArray[1][0] = "x";
        bigArray[2][0] = " ";
        bigArray[0][1] = " ";
        bigArray[1][1] = "x";
        bigArray[2][1] = " ";
        bigArray[0][2] = " ";
        bigArray[1][2] = "x";
        bigArray[2][2] = " ";
        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();
        //Then
        Assertions.assertTrue(checker);

    }

    @Test
    void testWinningXInThirdColumn() {

        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = " ";
        bigArray[1][0] = " ";
        bigArray[2][0] = "x";
        bigArray[0][1] = " ";
        bigArray[1][1] = " ";
        bigArray[2][1] = "x";
        bigArray[0][2] = " ";
        bigArray[1][2] = " ";
        bigArray[2][2] = "x";
        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();
        //Then
        Assertions.assertTrue(checker);

    }

    @Test
    void testWinningXInDiagonallyOne() {

        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = "x";
        bigArray[1][0] = " ";
        bigArray[2][0] = " ";
        bigArray[0][1] = " ";
        bigArray[1][1] = "x";
        bigArray[2][1] = " ";
        bigArray[0][2] = " ";
        bigArray[1][2] = " ";
        bigArray[2][2] = "x";
        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();
        //Then
        Assertions.assertTrue(checker);

    }

    @Test
    void testWinningXInDiagonallyTwo() {

        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = " ";
        bigArray[1][0] = " ";
        bigArray[2][0] = "x";
        bigArray[0][1] = " ";
        bigArray[1][1] = "x";
        bigArray[2][1] = " ";
        bigArray[0][2] = "x";
        bigArray[1][2] = " ";
        bigArray[2][2] = " ";
        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();
        //Then
        Assertions.assertTrue(checker);

    }

    @Test
    void testWinningOInFirstRow() {


        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = "o";
        bigArray[1][0] = "o";
        bigArray[2][0] = "o";
        bigArray[0][1] = " ";
        bigArray[1][1] = " ";
        bigArray[2][1] = " ";
        bigArray[0][2] = " ";
        bigArray[1][2] = " ";
        bigArray[2][2] = " ";

        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);

        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();

        //Then

        Assertions.assertTrue(checker);

    }

    @Test
    void testWinningOInSecondRow() {

        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = " ";
        bigArray[1][0] = " ";
        bigArray[2][0] = " ";
        bigArray[0][1] = "o";
        bigArray[1][1] = "o";
        bigArray[2][1] = "o";
        bigArray[0][2] = " ";
        bigArray[1][2] = " ";
        bigArray[2][2] = " ";
        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();
        //Then
        Assertions.assertTrue(checker);

    }

    @Test
    void testWinningOInThirdRow() {

        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = " ";
        bigArray[1][0] = " ";
        bigArray[2][0] = " ";
        bigArray[0][1] = " ";
        bigArray[1][1] = " ";
        bigArray[2][1] = " ";
        bigArray[0][2] = "o";
        bigArray[1][2] = "o";
        bigArray[2][2] = "o";
        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();
        //Then
        Assertions.assertTrue(checker);

    }

    @Test
    void testWinningOInFirstColumn() {

        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = "o";
        bigArray[1][0] = " ";
        bigArray[2][0] = " ";
        bigArray[0][1] = "o";
        bigArray[1][1] = " ";
        bigArray[2][1] = " ";
        bigArray[0][2] = "o";
        bigArray[1][2] = " ";
        bigArray[2][2] = " ";
        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();
        //Then
        Assertions.assertTrue(checker);

    }

    @Test
    void testWinningOInSecondColumn() {

        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = " ";
        bigArray[1][0] = "o";
        bigArray[2][0] = " ";
        bigArray[0][1] = " ";
        bigArray[1][1] = "o";
        bigArray[2][1] = " ";
        bigArray[0][2] = " ";
        bigArray[1][2] = "o";
        bigArray[2][2] = " ";
        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();
        //Then
        Assertions.assertTrue(checker);

    }

    @Test
    void testWinningOInThirdColumn() {

        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = " ";
        bigArray[1][0] = " ";
        bigArray[2][0] = "o";
        bigArray[0][1] = " ";
        bigArray[1][1] = " ";
        bigArray[2][1] = "o";
        bigArray[0][2] = " ";
        bigArray[1][2] = " ";
        bigArray[2][2] = "o";
        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();
        //Then
        Assertions.assertTrue(checker);

    }

    @Test
    void testWinningOInDiagonallyOne() {

        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = "o";
        bigArray[1][0] = " ";
        bigArray[2][0] = " ";
        bigArray[0][1] = " ";
        bigArray[1][1] = "o";
        bigArray[2][1] = " ";
        bigArray[0][2] = " ";
        bigArray[1][2] = " ";
        bigArray[2][2] = "o";
        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();
        //Then
        Assertions.assertTrue(checker);

    }

    @Test
    void testWinningOInDiagonallyTwo() {

        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = " ";
        bigArray[1][0] = " ";
        bigArray[2][0] = "o";
        bigArray[0][1] = " ";
        bigArray[1][1] = "o";
        bigArray[2][1] = " ";
        bigArray[0][2] = "o";
        bigArray[1][2] = " ";
        bigArray[2][2] = " ";
        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);
        //When
        winnigChecker.winningCheckForThree(creatingArraysMock);
        boolean checker = winnigChecker.isWinningCheck();
        //Then
        Assertions.assertTrue(checker);

    }

    @Test
    void testTie() {

        //Given
        String[][] bigArray = new String[3][3];
        bigArray[0][0] = "x";
        bigArray[1][0] = "x";
        bigArray[2][0] = "x";
        bigArray[0][1] = "o";
        bigArray[1][1] = "o";
        bigArray[2][1] = "x";
        bigArray[0][2] = "x";
        bigArray[1][2] = "x";
        bigArray[2][2] = "o";
        when(creatingArraysMock.getBigArray()).thenReturn(bigArray);

        //When
        winnigChecker.checkingForTie(creatingArraysMock);
        boolean checker = winnigChecker.getTie();
        //Then
        Assertions.assertTrue(checker);

    }

    @Test
    void exceptionInInputDoesNotThrowTest(){
        //Given

        ForScanning forScanningMock = mock(ForScanning.class);
        Input input = new Input();


        //When

        when(forScanningMock.getArraySize()).thenReturn(3);


        //Then
        Assertions.assertDoesNotThrow(()->input.enterArraySize(forScanningMock));

    }

 /*   @Test
    void exceptionInInputDoesThrowsExceptionTest(){
        //Given

        ForScanning forScanningMock = mock(ForScanning.class);
        Input input = new Input();


        //When
        when(forScanningMock.getArraySize()).toString();


        //Then
        Assertions.assertThrows(Exception.class,()->input.enterArraySize(forScanningMock));

    }*/

}
