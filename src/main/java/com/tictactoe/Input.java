package com.tictactoe;

import java.util.Objects;
import java.util.Scanner;

public class Input {

    private int arraySize;
    private  String startingFigure;
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

    public void enterArraySize(ForScanning forScanning) throws Exception{
            simpleText.arraySizeRequest();
            forScanning.whatArraySize();
            arraySize = forScanning.getArraySize();

            while (arraySize != 3 && arraySize != 10) {
                System.out.println("Let's stick to 3 or 10 for now");getArraySize();
                forScanning.whatArraySize();
                arraySize = forScanning.getArraySize();
            }
    }

    public void wrongInputForArray(){
        System.out.println("""
                    It's either 3 or 10, if that's too hard
                    then size of 3x3 is more than enough for You ಠ_ಠ
                    """);
        arraySize=3;
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
        while (!opponent.equals("computer") && !opponent.equals("person")&& !opponent.equals("COMPUTER") && !opponent.equals("PERSON")){
            simpleText.typeInCorrectStartinOpponent();
            opponent =scan.nextLine();
        }
        if (opponent.equals("computer") || opponent.equals("COMPUTER")){
            simpleText.playingAgainstComputer();
        } if (opponent.equals("person") || opponent.equals("PERSON")){
            simpleText.playingAgainstPerson();
        }
        return opponent;
    }
    public int horizontalNumberValue() throws Exception{

        simpleText.horizontalPosition();
        int horizontal;

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
        return horizontal;
    }

    public int verticalNumberValue() throws Exception{

        simpleText.verticalPosition();
        int vertical;

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

        return vertical;
    }

}
