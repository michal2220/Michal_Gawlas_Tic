package com.tictactoe;

import java.util.Random;

public class CreatingArrays {

    SimpleText simpleText = new SimpleText();
    private int arraySize;
    private boolean winningCheck =false;
    private boolean winner=false;
    private boolean isTie = false;
    private String[][] bigArray;
    private String [] insideArray;
    private final Random randomGenerator = new Random();


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

    public String[][] getBigArray() {
        return bigArray;
    }

    public String[] getInsideArray() {
        return insideArray;
    }

    public void printArrayX(Input input, SimpleText simpleText) throws Exception{

        try {
            int horizontal = input.horizontalNumberValue();
            int vertical = input.verticalNumberValue();


            while (!bigArray[horizontal][vertical].equals(" ")) {
                simpleText.occupiedPosition();
                horizontal = input.horizontalNumberValue();
                vertical = input.verticalNumberValue();
            }
            bigArray[horizontal][vertical] = "x";
            topRowPrint();
            loopForPrinting();
        } catch (Exception e){
            throw new Exception();
        }
    }

    public void printArrayO(Input input, SimpleText simpleText) throws Exception{

        try {
            int horizontal = input.horizontalNumberValue();
            int vertical = input.verticalNumberValue();

            while (!bigArray[horizontal][vertical].equals(" ")) {
                simpleText.occupiedPosition();
                horizontal = input.horizontalNumberValue();
                vertical = input.verticalNumberValue();
            }
            bigArray[horizontal][vertical] = "o";
            topRowPrint();
            loopForPrinting();
        } catch (Exception e){
            throw new Exception();
        }
    }

    public void loopForPrinting() {
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

    public void payingAgainstComputerX(){
        int horizontal = randomGenerator.nextInt(arraySize);
        int vertical = randomGenerator.nextInt(arraySize);

        while (!bigArray[horizontal][vertical].equals(" ")){
            horizontal = randomGenerator.nextInt(arraySize);
            vertical = randomGenerator.nextInt(arraySize);
        }
        bigArray[horizontal][vertical] = "x" ;
        System.out.println("\ncomputer moves to: "+horizontal+" "+vertical+"\n");
        topRowPrint();
        loopForPrinting();
    }

    public void payingAgainstComputerO(){
        int horizontal = randomGenerator.nextInt(arraySize);
        int vertical = randomGenerator.nextInt(arraySize);

        while (!bigArray[horizontal][vertical].equals(" ")){
            horizontal = randomGenerator.nextInt(arraySize);
            vertical = randomGenerator.nextInt(arraySize);
        }
        bigArray[horizontal][vertical] = "O" ;
        System.out.println("\ncomputer moves to: " + horizontal + " " + vertical + "\n");
        topRowPrint();
        loopForPrinting();
    }
}
