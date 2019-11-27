package com.company;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private boolean isUsed;
    private int index;
    private int x, y;
    static int NEX_ID = 0;
    public int clusterId = NEX_ID++;
    public double minWeight;


    public Node(int x, int y) {
        this.x = x;
        this.y = y;
        this.isUsed = false;
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
