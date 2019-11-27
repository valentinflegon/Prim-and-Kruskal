package com.company;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Prim {
    private double sommePath;
    public Graph graph;

    public Prim(Graph graph) {
        this.sommePath = 0;
        this.graph = graph;
    }

    public List<Node> prim() {
        List<Node> acm = new ArrayList<>();
        PriorityQueue<Node> noVisitNode = new PriorityQueue<>(Comparator.comparing(node -> node.minWeight));
        for (Node node:graph.arrayListOfNode){
           node.minWeight = Integer.MIN_VALUE;
        }
        Node randomStartNode = graph.arrayListOfNode.get(0);

        noVisitNode.addAll(graph.arrayListOfNode);
        while (!noVisitNode.isEmpty()){
            Node currentNode = noVisitNode.poll(); //afficher et supprime le premier element
            acm.add(currentNode);

            for(Path path: currentNode.getArrayOfPath()){
                Node nodeFinal = path.getBegin();

                if (path.getWeight()< nodeFinal.minWeight && noVisitNode.contains(nodeFinal)){
                    noVisitNode.remove(nodeFinal);
                    nodeFinal.minWeight = path.getWeight();
                    noVisitNode.add(nodeFinal);
                    sommePath = sommePath + path.getWeight();
                }
            }
        }
        return acm;
    }

        /**
         *
         * @return le poids du chemin actuel
         */
        public double getSommePath() {
            return sommePath;
        }


    }

