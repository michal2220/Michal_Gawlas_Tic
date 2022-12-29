package com.tictactoe.tenByTen;

import java.util.ArrayList;
import java.util.List;

public class Move {



    List<String> figuresList = new ArrayList<>();


    public List<String> makingFiguresList(){

        for (int i=0; i<100; i++) {
            figuresList.add(" ");
        }
        return figuresList;
    }

    public List<String> getFiguresList() {
        return figuresList;
    }

    public void moveX(MakingSureThatPositionInNumberBig sureBig){
        int position = sureBig.getPosition();
        figuresList.remove(position);
        figuresList.add(position,"x");
    }
    public void moveO(MakingSureThatPositionInNumberBig sureBig){
        int position = sureBig.getPosition();
        figuresList.remove(position);
        figuresList.add(position,"o");
    }

}
