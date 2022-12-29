package com.tictactoe.newTry;

import com.tictactoe.SimpleText;

import java.util.Objects;
import java.util.Scanner;

public class Input {

    SimpleText simpleText = new SimpleText();
    Scanner scan = new Scanner(System.in);
    int arraySize;
    int horizontal;
    int vertical;
    String startingFigure;

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

    public void enterArraySize(){
        simpleText.arraySizeRequest();
        arraySize = scan.nextInt();
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

    public int horizontalNumberValue(){

        simpleText.horizontalPosition();

        horizontal=scan.nextInt();

        while (horizontal>=arraySize||horizontal<0){
            simpleText.biggerThenAllowed();
            simpleText.horizontalPosition();
            horizontal=scan.nextInt();
        }

        return horizontal;
    }

    public int verticalNumberValue(){

        simpleText.verticalPosition();

        vertical=scan.nextInt();

        while (vertical>=arraySize||vertical<0){
            simpleText.biggerThenAllowed();
            simpleText.verticalPosition();
            vertical=scan.nextInt();
        }

        return vertical;
    }

}
