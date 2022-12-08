package com.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakingSureThatPositionIsNumber {

    Scanner scanner = new Scanner(System.in);
    int move;
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

    public int makingSureNumber(){
        System.out.println("next move, awailable positions: "+availablePositions);
        while(!scanner.hasNextInt()){
            System.out.println("Please enter a number!");
            scanner.next();
        }
        move = scanner.nextInt();
        while (move>8){
            System.out.println("Please enter a number which is lower then 9!");
            move= scanner.nextInt();
            System.out.println(availablePositions);
        }
        while(!availablePositions.contains(Integer.valueOf(move))){
            System.out.println(move+ " already taken!");
            move=scanner.nextInt();
        }
        availablePositions.remove(Integer.valueOf(move));

        return move;
    }

    public int getMove() {
        return move;
    }
}
