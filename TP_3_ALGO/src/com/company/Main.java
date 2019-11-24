package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Node node1 = new Node('a');
        Node node2 = new Node('b');
        Node node3 = new Node('c');
        Node node4 = new Node('d');
        Node node5 = new Node('e');
        Node node6 = new Node('f');

        Graph graph = new Graph();

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addNode(node5);
        graph.addNode(node6);

        Path path1 = new Path(node1,node2,12);
        Path path2 = new Path(node1,node3,1);
        Path path = new Path(node2,node4,4);
        Path path3 = new Path(node3,node2,2);
        Path path4 = new Path(node1,node4,1);
        Path path5 = new Path(node1,node5, 4);
        Path path6 = new Path(node6,node5, 3);
        Path path7 = new Path(node2,node5, 5);
        Path path8 = new Path(node4,node5, 4);
        Path path9 = new Path(node2,node6, 4);
        Path path10 = new Path(node4,node6, 3);
        Path path11 = new Path(node1,node6, 5);
        Path path12 = new Path(node5,node6, 4);

        graph.addPath(path1);
        graph.addPath(path2);
        graph.addPath(path);
        graph.addPath(path3);
        graph.addPath(path4);
        graph.addPath(path5);
        graph.addPath(path6);
        graph.addPath(path7);
        graph.addPath(path8);
        graph.addPath(path9);
        graph.addPath(path10);
        graph.addPath(path11);
        graph.addPath(path12);

        graph.initArrayListOfNode();

       /* System.out.println(path2.isVariableIsUsed());
        System.out.println(graph.findBestPath(graph.arrayListOfNode).getWeight());
        System.out.println(path2.isVariableIsUsed());
        System.out.println(graph.findBestPath(graph.arrayListOfNode).getWeight());
        System.out.println("Poids des chemins = ");
        System.out.println(graph.getSommePath());
        */
           System.out.print("---- 0 = Prim             ----\n" + "---- 1 = Kurskal          ----\n" + "---- 2 = PrimUnionFind    ----\n" + "---- 3 = KurskalUnionFind ----\n" + "votre choix : ");
           Scanner scanner = new Scanner(System.in);
           int choice = scanner.nextInt();

           switch (choice) {
               case 0:
                   Prim prim = new Prim(graph);
                   System.out.println("Poids des chemins du graph " + prim.prim());
                   // graph.arrayListOfNodeWhereSortPath(graph.arrayListOfNode);
                   prim.graph.display();
                   break;
               case 1:
                   Kruskal kruskal = new Kruskal(graph);
                   kruskal.kruskal();
                   kruskal.graph.display();
                   break;
               case 2:
                   UnionFind primUnionFind = new UnionFind(graph);
                   primUnionFind.PrimUnionFind();
                   primUnionFind.graph.display2();
                   break;
               case 3:
                   UnionFind kruskalUnionFind = new UnionFind(graph);
                   kruskalUnionFind.kruskalUnionFind();
                   kruskalUnionFind.graph.display2();
                   break;
           }
        /*
        Prim prim = new Prim(graph);
        System.out.println("Poids des chemins du graph "+prim.prim());
            // graph.arrayListOfNodeWhereSortPath(graph.arrayListOfNode);
        prim.graph.display();
        */

        /*
        Kruskal kruskal = new Kruskal(graph);
        kruskal.kruskal();
        kruskal.graph.display();
         */


    }

}
