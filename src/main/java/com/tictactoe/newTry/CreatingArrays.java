package com.tictactoe.newTry;

import com.tictactoe.SimpleText;

import java.util.Random;

public class CreatingArrays {

    private int arraySize;
    private boolean smallChecker=false;
    private boolean winner=false;
    private String[][] bigArray;
    private String [] insideArray;
    private Random randomGenerator = new Random();

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

    public String[][] createSmallArray(){

        bigArray = new String[3][3];

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

    public boolean isEveryPositionOccupied(){
        boolean ocupationStatement=true;

        for (int i = 0; i<bigArray.length; i++ ){
            for(int j = 0; j < bigArray[i].length; j++){

                if(bigArray[i][j].equals(" ")){
                    ocupationStatement=false;
                }
            }
        }
        return ocupationStatement;
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

    public boolean winningCheck(Input input){

        int arraySize = input.getArraySize();

        if (arraySize==3){
            winningCheckForThree();
            if(smallChecker==true){
                System.out.println("Winner");
                winner=true;
            }
        } if (arraySize==10){
            winningCheckForTen();
            if(smallChecker==true){
                System.out.println("Winner");
                winner=true;
            }

        }

        return winner;
    }

    public boolean isWinner() {
        return winner;
    }

    public boolean winningCheckForThree(){


        for (int i = 0; i < bigArray.length; i++) {
            insideArray = bigArray[i];
            for (int j = 0; j < insideArray.length; j++) {

                if(j==1){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j]==bigArray[i][j-1]&&
                            bigArray[i][j]==bigArray[i][j+1]){

                        smallChecker=true;

                    }
                }

                if(i==1){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j]==bigArray[i-1][j]&&
                            bigArray[i][j]==bigArray[i+1][j]){

                        smallChecker=true;

                    }
                }

                if(i==1 && j==1){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j]==bigArray[i-1][j-1]&&
                            bigArray[i][j]==bigArray[i+1][j+1]){

                        smallChecker=true;

                    } if (!insideArray[j].equals(" ")&&
                            bigArray[i][j]==bigArray[i+1][j-1]&&
                            bigArray[i][j]==bigArray[i-1][j+1]){

                        smallChecker=true;

                    }
                }
            }
        }

        return smallChecker;

    }

    public boolean winningCheckForTen(){


        for (int i = 0; i < bigArray.length; i++) {
            insideArray = bigArray[i];
            for (int j = 0; j < insideArray.length; j++) {

                if(j>=2&&j<=7){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j]==bigArray[i][j-2]&&
                            bigArray[i][j]==bigArray[i][j-1]&&
                            bigArray[i][j]==bigArray[i][j+1]&&
                            bigArray[i][j]==bigArray[i][j+2]){

                        smallChecker=true;

                    }
                }
                if(i>=2&&i<=7){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j]==bigArray[i-2][j]&&
                            bigArray[i][j]==bigArray[i-1][j]&&
                            bigArray[i][j]==bigArray[i+1][j]&&
                            bigArray[i][j]==bigArray[i+2][j]){

                        smallChecker=true;

                    }
                }
                if(j>=2 && j<=7 && i>=2 && i<=7){

                    if (!insideArray[j].equals(" ")&&
                            bigArray[i][j]==bigArray[i-2][j-2]&&
                            bigArray[i][j]==bigArray[i-1][j-1]&&
                            bigArray[i][j]==bigArray[i+1][j+1]&&
                            bigArray[i][j]==bigArray[i+2][j+2]){

                        smallChecker=true;

                    }
                }
            }
        }

        return smallChecker;

    }
}
