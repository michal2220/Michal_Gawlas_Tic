package com.tictactoe.newTry;

import com.tictactoe.SimpleText;

public class CreatingArrays {

    Input input=new Input();

    String[][] bigArray;
    String [] insideArray;
    int arraySize;

    public String[][] createArray(Input input){

        arraySize = input.getArraySize();
        bigArray = new String[arraySize][arraySize];

        for (int i = 0; i < bigArray.length; i++) {
            insideArray = bigArray[i];
            for (int j = 0; j < insideArray.length; j++) {
                bigArray[i][j]=" ";
            }
        }

        return bigArray;

    }

    public void printArrayX(Input input, SimpleText simpleText){

        int horizontal = input.horizontalNumberValue();
        int vertical = input.verticalNumberValue();


        while (!bigArray[horizontal][vertical].equals(" ")){
            simpleText.occupiedPosition();
            horizontal = input.horizontalNumberValue();
            vertical = input.verticalNumberValue();
        }
        bigArray[horizontal][vertical] = "x" ;
        topRowPrint();
        loopForPrinting();

    }

    public void printArrayO(Input input, SimpleText simpleText){

        int horizontal = input.horizontalNumberValue();
        int vertical = input.verticalNumberValue();

        while (!bigArray[horizontal][vertical].equals(" ")){
            simpleText.occupiedPosition();
            horizontal = input.horizontalNumberValue();
            vertical = input.verticalNumberValue();
        }
        bigArray[horizontal][vertical] = "o" ;
        topRowPrint();
        loopForPrinting();

    }

    private void loopForPrinting() {
        for (int i = 0; i < bigArray.length; i++) {
            insideArray = bigArray[i];
            System.out.print(i+ "   |");
            for (int j = 0; j < insideArray.length; j++) {

                System.out.print(" "+bigArray[i][j]+" |");
            }
            System.out.println();
        }
    }

    private void topRowPrint() {
        String [] topRow = new String[arraySize];
        System.out.print("     ");
        for (int i = 0; i < topRow.length; i++) {
            System.out.print(" "+i+"  ");
        }
        System.out.println();
    }

    public String[][] getBigArray() {
        return bigArray;
    }
}
