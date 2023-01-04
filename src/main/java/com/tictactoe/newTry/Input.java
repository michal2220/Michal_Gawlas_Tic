package com.tictactoe.newTry;

import com.tictactoe.SimpleText;

import java.util.Objects;
import java.util.Scanner;

public class Input {

    private int arraySize;
    private  String startingFigure;
    private boolean forException=false;
    SimpleText simpleText = new SimpleText();
    Scanner scan = new Scanner(System.in);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Input input = (Input) o;

        if (arraySize != input.arraySize) return false;
        return Objects.equals(startingFigure, input.startingFigure);
    }

    @Override
    public int hashCode() {
        int result = arraySize;
        result = 31 * result + (startingFigure != null ? startingFigure.hashCode() : 0);
        return result;
    }

    public int enterArraySize(){
        try {
            simpleText.arraySizeRequest();
            arraySize = scan.nextInt();
            while (arraySize != 3 && arraySize != 10) {
                System.out.println("Let's stick to 3 or 10 for now ;)");
                arraySize = scan.nextInt();
            }
            forException=false;
        } catch (Exception e){
            System.out.println("error " +e);
            arraySize=3;
            System.out.println("It's either 3 or 10, if that's too hard then\n" +
                    "then size of 3x3 is more than enough for You :P\n");
        }
        return arraySize;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void whichStartingFigure(){

        simpleText.startingWithXOrO();

        while (!scan.hasNext("[xoXO]")){
            simpleText.typeInCorrectXOrO();
            startingFigure=scan.next();
        }
        startingFigure=scan.next();

        if (startingFigure.equals("o") || startingFigure.equals("O")) {
            simpleText.startingWithO();
        }

        else if (startingFigure.equals("x") || startingFigure.equals("X")) {
            simpleText.startingWithX();
        }
    }

    public String getStartingFigure() {
        return startingFigure;
    }

    public String computerOrPerson(){
        simpleText.playingWithComputerOrPerson();
        String opponent = scan.nextLine();
        while (!opponent.equals("computer") && !opponent.equals("person")){
            simpleText.typeInCorrectStartinOpponent();
            opponent =scan.nextLine();
        }
        if (opponent.equals("computer")){
            simpleText.playingAgainstComputer();
        } if (opponent.equals("person")){
            simpleText.playingAgainstPerson();
        }
        return opponent;
    }
    public int horizontalNumberValue(){

        simpleText.horizontalPosition();
        int horizontal;

        try {
            while (!scan.hasNextInt()) {
                simpleText.enterNumber();
                scan.next();
            }
            horizontal = scan.nextInt();

            while (horizontal >= arraySize || horizontal < 0) {
                simpleText.biggerThenAllowed();
                simpleText.horizontalPosition();
                horizontal = scan.nextInt();
            }
        } catch (Exception e){
            System.out.println("\nCangrats You broke it! Your position will be 0 if available");
            horizontal=0;
        }
        return horizontal;
    }

    public int verticalNumberValue(){

        simpleText.verticalPosition();

        int vertical;

        try {
            while (!scan.hasNextInt()) {
                simpleText.enterNumber();
                scan.next();
            }
            vertical = scan.nextInt();

            while (vertical >= arraySize || vertical < 0) {
                simpleText.biggerThenAllowed();
                simpleText.verticalPosition();
                vertical = scan.nextInt();
            }
        } catch (Exception e){
            System.out.println("\nCangrats You broke it! Your position will be 0 if available");
            vertical=0;
        }
        return vertical;
    }

}
