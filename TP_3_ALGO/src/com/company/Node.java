package com.company;

import java.util.ArrayList;

public class Node {
    //si pas de Path alors ACM pas connexe !
    private ArrayList<Path> arrayOfPath = new ArrayList<>();
    private boolean isUsed;
    private char label;
    private int index;


    public Node(char label) {
        this.arrayOfPath = new ArrayList<>();
        this.label = label;
    }


    public ArrayList<Path> getArrayOfPath() {
        return arrayOfPath;
    }

    public Path getArrayOfPath(int i) {
        return arrayOfPath.get(i);
    }

    public void setArrayOfPath(ArrayList<Path> arrayOfPath) {
        this.arrayOfPath = arrayOfPath;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean usage) {
        isUsed = usage;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public Character getLabelToCharacter(){
        return (Character) label;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
