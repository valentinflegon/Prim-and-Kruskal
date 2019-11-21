package com.company;

public class Main {

    public static void main(String[] args) {
        Node node1 = new Node('a');
        Node node2 = new Node('b');
        Node node3 = new Node('c');
        Node node4 = new Node('d');

        Graph graph = new Graph();

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);

        Path path1 = new Path(node1,node2,12);
        Path path2 = new Path(node1,node3,1);
        Path path = new Path(node2,node4,4);
        Path path3 = new Path(node3,node2,2);
        Path path4 = new Path(node1,node4,1);

        graph.addPath(path1);
        graph.addPath(path2);
        graph.addPath(path);
        graph.addPath(path3);
        graph.addPath(path4);



       /* System.out.println(path2.isVariableIsUsed());
        System.out.println(graph.findBestPath(graph.arrayListOfNode).getWeight());
        System.out.println(path2.isVariableIsUsed());
        System.out.println(graph.findBestPath(graph.arrayListOfNode).getWeight());
        System.out.println("Poids des chemins = ");
        System.out.println(graph.getSommePath());

 */
       Prim prim = new Prim();
       System.out.println("Poids des chemins du graph "+prim.prim(graph));

      // graph.arrayListOfNodeWhereSortPath(graph.arrayListOfNode);
    }

}
