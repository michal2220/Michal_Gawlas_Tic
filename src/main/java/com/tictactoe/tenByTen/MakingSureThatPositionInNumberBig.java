package com.tictactoe.tenByTen;

import com.tictactoe.Game;
import com.tictactoe.SimpleText;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakingSureThatPositionInNumberBig {

    Scanner scanner = new Scanner(System.in);
    SimpleText simpleText = new SimpleText();
    List<Integer> availablePositions = new ArrayList<>();
    private int position;

    public List<Integer> makingPositionsList(){

        for (int i=0; i<100; i++) {
            availablePositions.add(i);
        }
        return availablePositions;
    }

    public List<Integer> getAvailablePositions() {
        return availablePositions;
    }
    public int getPosition(){

        while (!scanner.hasNextInt()){
            simpleText.enterNumber();
            scanner.next();
        }
        position = scanner.nextInt();

        while (position >= 100) {
            simpleText.enterNumberNotHigerThen8();
            position = scanner.nextInt();
        }
        while (!availablePositions.contains(position)) {
            if (position <= 100 && position>=0) {
                simpleText.alreadyTaken();
                position = scanner.nextInt();
            }
            else if (position>=100 && position>0) {
                simpleText.higherThen8();
                position = scanner.nextInt();
            }
            else if (position<0) {
                simpleText.lowerThen0();
                position = scanner.nextInt();
            }
        }
        availablePositions.remove(Integer.valueOf(position));
        return position;
    }



}
