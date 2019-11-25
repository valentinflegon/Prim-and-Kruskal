package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

        System.out.print("---- 0 = Generation Aleatoire----\n" +
                "---- 1 = Generation fixe     ----\n" +
                "---- 2 = Generation nuage    ----\n"+ "votre choix : ");
        Scanner scanner = new Scanner(System.in);
        int firstchoice = scanner.nextInt();
        Node tmpNode;
        Node newNode = new Node(0,0);
        Path newPath = new Path(newNode,newNode);
        int tmpInt = 0;
        switch (firstchoice) {
            case 0:
                newNode = new Node(0,0);
                newPath = new Path(newNode,newNode);
                tmpInt = 0;
                //painter de taille 800 x 600
                for (int i = 0; i < (15 + (int) (Math.random() * ( 50 ))); i++) {
                    graph.addNode(new Node((int) (Math.random() * ( 800 )),(int) (Math.random() * ( 600 ))));
                }
                for (Node node:graph.arrayListOfNode) {
                    newPath.setBegin(node);
                    for (int i = 0; i < graph.arrayListOfNode.size(); i++){
                        System.out.println("path");
                        do {
                            tmpInt=(int) (Math.random() * ((graph.arrayListOfNode.size())));
                            tmpNode = graph.arrayListOfNode.get(tmpInt);
                            System.out.println(tmpInt + "size : " + graph.arrayListOfNode.size());
                            System.out.println(tmpNode.getIndex() +" rdPath "+ node.getIndex());
                        }while (tmpInt == node.getIndex());
                        //newPath.setEnd(tmpNode);
                        graph.addPath(new Path(node,graph.arrayListOfNode.get(tmpInt)));
                    }
                }
                break;
            case 1:
                Node node1 = new Node(400,300);
                Node node2 = new Node(60,90);
                Node node3 = new Node(250,400);
                Node node4 = new Node(500,500);
                Node node5 = new Node(200,450);
                Node node6 = new Node(450,300);

                graph.addNode(node1);
                graph.addNode(node2);
                graph.addNode(node3);
                graph.addNode(node4);
                graph.addNode(node5);
                graph.addNode(node6);

                Path path1 = new Path(node5,node2);
                Path path2 = new Path(node1,node3);
                Path path = new Path(node2,node4);
                Path path3 = new Path(node3,node2);
                Path path4 = new Path(node1,node4);
                Path path5 = new Path(node1,node5);
                Path path6 = new Path(node3,node5);
                Path path7 = new Path(node2,node5);
                Path path8 = new Path(node4,node5);
                Path path9 = new Path(node2,node6);
                Path path10 = new Path(node4,node6);
                Path path11 = new Path(node1,node6);
                Path path12 = new Path(node5,node6);
                Path path13 = new Path(node4,node3);

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
                graph.addPath(path13);
                break;
            case 2:
                boolean flag = false;
                newNode = new Node(0,0);
                newPath = new Path(newNode,newNode);
                graph.arrayListOfNode.add(new Node(400, 300));
                graph.arrayListOfNode.add(new Node(450, 350));
                graph.arrayListOfNode.add(new Node(350, 250));
                graph.arrayListOfNode.add(new Node(450, 250));
                graph.arrayListOfNode.add(new Node(350, 350));
                graph.arrayListOfNode.add(new Node(500, 400));
                graph.arrayListOfNode.add(new Node(300, 200));
                graph.arrayListOfNode.add(new Node(500, 200));
                graph.arrayListOfNode.add(new Node(300, 400));
                graph.arrayListOfNode.add(new Node(550, 450));
                graph.arrayListOfNode.add(new Node(250, 150));
                graph.arrayListOfNode.add(new Node(550, 150));
                graph.arrayListOfNode.add(new Node(250, 450));
                graph.display();
                for (int i = 0; i < (100 + (int) (Math.random() * ( 500 ))); i++) {
                    System.out.println("aaaaa");
                    do {
                        System.out.println("ezezez");
                        flag = false;
                        newNode.setX((int) (Math.random() * ( 800 )));
                        newNode.setY((int) (Math.random() * ( 600 )));
                        for (int j = 0; j < graph.arrayListOfNode.size(); j++){
                            if (new Path(newNode,graph.arrayListOfNode.get(j)).getWeight() < 25) flag = true;
                        }
                    }while (!flag);
                    graph.arrayListOfNode.add(new Node(newNode.getX(),newNode.getY()));
                }
                for (Node node:graph.arrayListOfNode) {
                    newPath.setBegin(node);
                    for (int i = 0; i < graph.arrayListOfNode.size(); i++){
                        System.out.println("path");
                        do {
                            tmpInt=(int) (Math.random() * ((graph.arrayListOfNode.size())));
                            tmpNode = graph.arrayListOfNode.get(tmpInt);
                            System.out.println(tmpInt + "size : " + graph.arrayListOfNode.size());
                            System.out.println(tmpNode.getIndex() +" rdPath "+ node.getIndex());
                        }while (tmpInt == node.getIndex());
                        //newPath.setEnd(tmpNode);
                        graph.addPath(new Path(node,graph.arrayListOfNode.get(tmpInt)));
                    }
                }
                graph.display();
                break;
        }

        graph.initArrayListOfNode();


        System.out.print("---- 0 = Prim                ----\n" +
                "---- 1 = Kurskal             ----\n" +
                "---- 2 = Prim Amelioré       ----\n" +
                "---- 3 = Kurskal Amelioré    ----\n" + "votre choix : ");
        scanner = new Scanner(System.in);
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
                UpgradedVersion primUpgradedVersion = new UpgradedVersion(graph);
                System.out.println("TotalWeight : " + primUpgradedVersion.prim());
                primUpgradedVersion.graph.display2();
                break;
            case 3:
                UpgradedVersion kruskalUpgradedVersion = new UpgradedVersion(graph);
                System.out.println("TotalWeight : " + kruskalUpgradedVersion.kruskal());
                kruskalUpgradedVersion.graph.display2();
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
