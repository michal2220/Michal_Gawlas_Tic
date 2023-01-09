package com.tictactoe;

import java.util.Scanner;

public class ForScanning {

    Scanner scanner = new Scanner(System.in);
    private int arraySize;

    public void whatArraySize(){

        arraySize = scanner.nextInt();

    }

    public int getArraySize() {
        return arraySize;
    }
}
