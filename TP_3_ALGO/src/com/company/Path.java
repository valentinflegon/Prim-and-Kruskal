package com.company;

import java.util.ArrayList;

public class Path {
    private Node begin,end;
    private int weight;

    public Path(Node begin, Node end, int weight) {
        this.begin = begin;
        this.end = end;
        this.weight = weight;
    }

    public void display(){
        System.out.println(this.getBegin().getLabel());
        System.out.println("|");
        System.out.println(this.getWeight());
        System.out.println("|");
        System.out.println(this.getEnd().getLabel());
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

    public void setEnd(Node end) {
        this.end = end;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
