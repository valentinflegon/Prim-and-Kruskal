package com.company;

public class Main {

    public static void main(String[] args) {
        Node node1 = new Node('a');
        Node node2 = new Node('b');
        Graph graph = new Graph();
        graph.addNode(node1);
        Path path1 = new Path(node1,node2,10);
        graph.addPath(path1);
        for(int i=0;i<graph.arrayListOfNode.size();i++){
            System.out.println(graph.arrayListOfNode.get(i).getLabel());
            System.out.println(graph.arrayListOfNode.get(i).getArrayOfPath().get(0).getWeight());
            System.out.println(graph.arrayListOfNode.get(i).getArrayOfPath().get(0).getEnd().getLabel());


        }
    }

}
