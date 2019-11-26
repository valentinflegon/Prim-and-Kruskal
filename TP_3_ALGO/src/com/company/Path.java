package com.company;

import java.util.ArrayList;

public class Path {
    private Node begin,end;
    private int weight;
    private boolean variableIsUsed;


    public Path(Node begin, Node end) {
        this.begin = begin;
        this.end = end;
        this.weight = findWeight();
        this.variableIsUsed =false ;
    }


    public int findWeight(){
        int DeltaX = end.getX() - begin.getX(), DeltaY = end.getY() - begin.getY();
        return (int) Math.sqrt(Math.pow(DeltaX, 2) + Math.pow(DeltaY, 2));
    }

    public boolean isUsed(){
        return this.variableIsUsed;
    }

    public boolean isVariableIsUsed() {
        return variableIsUsed;
    }

    public void setVariableIsUsed(boolean variableIsUsed) {
        this.variableIsUsed = variableIsUsed;
    }

    public Node getBegin() {
        return begin;
    }

    public void setBegin(Node begin) {
        this.begin = begin;
    }

    public Node getEnd() {
        return end;
    }

    public int getWeight() {
        return weight;
    }

}
