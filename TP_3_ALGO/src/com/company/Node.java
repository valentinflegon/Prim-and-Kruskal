package com.company;

import java.util.ArrayList;

public class Node {
    //si pas de Path alors ACM pas connexe !

    private boolean isUsed;
    private int index;
    private int x, y;


    public Node(int x, int y) {

        this.x = x;
        this.y = y;
    }


    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean usage) {
        isUsed = usage;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
