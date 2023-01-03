package com.tictactoe.tenByTen;

public class GamePlayBig {
    private int modulo;

    public void play10x10(Move move, VisualPresentationBig vB, MakingSureThatPositionInNumberBig sure){
        move.makingFiguresList();
        sure.makingPositionsList();

        for(int i = 0; i<=100;i++){
            modulo= i % 2;
            if (modulo==0){
                move.moveO(sure);
                vB.printMove(move);
            }
            if(modulo!=0){
                move.moveX(sure);
                vB.printMove(move);
            }
        }
    }
}
