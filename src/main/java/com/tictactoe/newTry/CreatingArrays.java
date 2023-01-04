package com.tictactoe.newTry;

import com.tictactoe.SimpleText;

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
        System.out.println("\ncomputer moves to: "+horizontal+" "+vertical+"\n");
        topRowPrint();
        loopForPrinting();
    }

/*    public void winningCheck(Input input){

        int arraySize = input.getArraySize();

        if (arraySize==3){
            winningCheckForThree();
            if(winningCheck){
                System.out.println("Winner");
                winner=true;
            }
        } if (arraySize==10){
            winningCheckForTen();
            if(winningCheck){
                System.out.println("Winner");
                winner=true;
            }

        }

    }

    public boolean isWinner() {
        return winner;
    }

    public void winningCheckForThree(){


        for (int i = 0; i < bigArray.length; i++) {
            insideArray = bigArray[i];
            for (int j = 0; j < insideArray.length; j++) {

                if(j==1){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j].equals(bigArray[i][j - 1]) &&
                            bigArray[i][j].equals(bigArray[i][j + 1])){

                        winningCheck =true;

                    }
                }

                if(i==1){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j].equals(bigArray[i - 1][j]) &&
                            bigArray[i][j].equals(bigArray[i + 1][j])){

                        winningCheck =true;

                    }
                }

                if(i==1 && j==1){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j].equals(bigArray[i - 1][j - 1]) &&
                            bigArray[i][j].equals(bigArray[i + 1][j + 1])){

                        winningCheck =true;

                    } if (!insideArray[j].equals(" ")&&
                            bigArray[i][j].equals(bigArray[i + 1][j - 1]) &&
                            bigArray[i][j].equals(bigArray[i - 1][j + 1])){

                        winningCheck =true;

                    }
                }
            }
        }

    }

    public void winningCheckForTen(){

        for (int i = 0; i < bigArray.length; i++) {
            insideArray = bigArray[i];
            for (int j = 0; j < insideArray.length; j++) {

                if(j>=2&&j<=7){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j].equals(bigArray[i][j - 2]) &&
                            bigArray[i][j].equals(bigArray[i][j - 1]) &&
                            bigArray[i][j].equals(bigArray[i][j + 1]) &&
                            bigArray[i][j].equals(bigArray[i][j + 2])){

                        winningCheck =true;

                    }
                }
                if(i>=2&&i<=7){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j].equals(bigArray[i - 2][j]) &&
                            bigArray[i][j].equals(bigArray[i - 1][j]) &&
                            bigArray[i][j].equals(bigArray[i + 1][j]) &&
                            bigArray[i][j].equals(bigArray[i + 2][j])){

                        winningCheck =true;

                    }
                }
                if(j>=2 && j<=7 && i>=2 && i<=7){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j].equals(bigArray[i - 2][j - 2]) &&
                            bigArray[i][j].equals(bigArray[i - 1][j - 1]) &&
                            bigArray[i][j].equals(bigArray[i + 1][j + 1]) &&
                            bigArray[i][j].equals(bigArray[i + 2][j + 2])){

                        winningCheck =true;

                    }
                }
            }
        }
    }

    public boolean checkingForTie(){
        boolean isEverythingOccupied=true;


        for (int i = 0; i<bigArray.length; i++ ){
            for(int j = 0; j < bigArray[i].length; j++){

                if(bigArray[i][j].equals(" ")){
                    isEverythingOccupied=false;
                }
            }
        }

        if (isEverythingOccupied && !winner){
            isTie=true;
            simpleText.tieInfo();
        }

        return isTie;
    }

    public boolean getTie() {
        return isTie;
    }*/
}
