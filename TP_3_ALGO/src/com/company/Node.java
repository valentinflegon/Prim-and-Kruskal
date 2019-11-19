package com.company;

import java.util.ArrayList;

public class Node {
    //si pas de Path alors ACM pas connexe !
    private ArrayList<Path> arrayOfPath = new ArrayList<>();
    private boolean isUse;
    private char label;

    public Node(char label) {
        this.arrayOfPath = new ArrayList<>();
        this.label = label;
    }


    public ArrayList<Path> getArrayOfPath() {
        return arrayOfPath;
    }

    public void setArrayOfPath(ArrayList<Path> arrayOfPath) {
        this.arrayOfPath = arrayOfPath;
    }

    public boolean isUse() {
        return isUse;
    }

    public void setUse(boolean use) {
        isUse = use;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }
}
