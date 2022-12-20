package com.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MakingSureThatPositionIsNumber {
    private int move;
    Scanner scanner = new Scanner(System.in);
    SimpleText simpleText = new SimpleText();
    Random randomGenerator = new Random();
    List<Integer> availablePositions = new ArrayList<>();
    public List<Integer> makingPositionsList(){
        availablePositions.add(0);
        availablePositions.add(1);
        availablePositions.add(2);
        availablePositions.add(3);
        availablePositions.add(4);
        availablePositions.add(5);
        availablePositions.add(6);
        availablePositions.add(7);
        availablePositions.add(8);

        return availablePositions;
    }

    public int makingSureNumber() {
        simpleText.enterNumber();
        while (!scanner.hasNextInt()) {
            simpleText.enterNumber();
            scanner.next();
        }
        move = scanner.nextInt();

        while (move > 8) {
            simpleText.enterNumberNotHigerThen8();
            move = scanner.nextInt();
        }
        while (!availablePositions.contains(move)) {
            if (move < 8 && move>=0) {
                simpleText.alreadyTaken();
                move = scanner.nextInt();
            }
            else if (move>8 && move>0) {
                simpleText.higherThen8();
                move = scanner.nextInt();
            }
            else if (move<0) {
                simpleText.lowerThen0();
                move = scanner.nextInt();
            }
        }
        availablePositions.remove(Integer.valueOf(move));
        return move;
    }

    public int computerMove(){
        while (!availablePositions.contains(move)) {
            move = randomGenerator.nextInt(9);
        }
        availablePositions.remove(Integer.valueOf(move));
        return move;
    }
    public int getMove() {
        return move;
    }
}
