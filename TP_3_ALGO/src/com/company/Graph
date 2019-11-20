package com.company;

import java.util.ArrayList;

public class Graph  {
    //création d'un graph avec des transtions

    public ArrayList<Node> arrayListOfNode;
    public ArrayList<Node> arrayListOfUseNode;

    public Graph() {
        this.arrayListOfNode = new ArrayList<Node>();
        this.arrayListOfUseNode = new ArrayList<Node>();
    }

    public void addNode(Node node){
        this.arrayListOfNode.add(node);
    }
    public void addPath(Path path){
        path.getBegin().getArrayOfPath().add(path);
        path.getEnd().getArrayOfPath().add(path);
    }
}
