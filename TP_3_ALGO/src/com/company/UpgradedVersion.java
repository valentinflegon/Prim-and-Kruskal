package com.company;



import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Partie 2 du TP Prim via UnionFind avec tas
 */
public class UpgradedVersion {
    public Graph graph;
    public Path[] paths;
    public int[] parent;

    public UpgradedVersion(Graph graph){
        this.graph = graph;
        parent = new int[graph.arrayListOfNode.size()];
        initialisePaths();
        initialiseParent();
    }

    public int prim(){
        boolean flag;
        Path tmpPath;
        int i;
        int totalWeight = 0;
        do {
            flag = false;
            i = 0;
            tmpPath = null;
            do {
                for (Path path : graph.arrayListOfNode.get(i).getArrayOfPath()){
                    if ((tmpPath == null || tmpPath.getWeight() > path.getWeight()) && parent[path.getEnd().getIndex()] == path.getEnd().getIndex() && !isPointedInParent(path.getEnd().getIndex())) {
                        tmpPath = path;
                        System.out.println("path valide");
                    }
                    System.out.println("path : " + path);
                }
                if (parent[i] == i) {
                    flag = true;
                    System.out.println("flag : true");
                }
                i = parent[i];
                System.out.println(i + " = parenti = " + parent[i]);
            }while (!flag);
            parent[i] = tmpPath.getEnd().getIndex();
            totalWeight += tmpPath.getWeight();
            setTrue(tmpPath);
            System.out.println(tmpPath.getBegin().getIndex() + "to" + tmpPath.getEnd().getIndex() + " weight : " + tmpPath.getWeight());
            displayParent();
        }while (!isValid());
        return totalWeight;
    }

    public int kruskal(){
        int endNodePosition, beginNodePosition;
        System.out.println(paths.length);
        int totalWeight = 0;
        for (Path path:paths) {
            System.out.println(path.getBegin().getIndex()+ " weight "+path.getWeight()+" to "+path.getEnd().getIndex());
            endNodePosition = path.getEnd().getIndex();
            beginNodePosition = path.getBegin().getIndex();
            if (parent[endNodePosition] == endNodePosition && parent[beginNodePosition] == beginNodePosition) {
                setTrue(path);
                newTree(endNodePosition, parent[beginNodePosition]);
                totalWeight += path.getWeight();
            }else if (parent[endNodePosition] == endNodePosition && parent[beginNodePosition] != endNodePosition) {
                setTrue(path);
                newTree(endNodePosition, parent[beginNodePosition]);
                totalWeight += path.getWeight();
            }else if (parent[beginNodePosition] == beginNodePosition && parent[endNodePosition] != beginNodePosition){
                setTrue(path);
                newTree(beginNodePosition, parent[endNodePosition]);
                totalWeight += path.getWeight();
            }
            /*if(!isLinked(beginNodePosition, endNodePosition)){
                setNewRootInParent(beginNodePosition, endNodePosition);
                setTrue(path);
            }*/
            System.out.println(path.getBegin().getIndex() + "to" + path.getEnd().getIndex() + " weight : " + path.getWeight());
            displayParent();
        }
        return totalWeight;
    }

    public void newTree(int oldTree, int newtree){
        for (int i = 0; i < parent.length; i++) {
            if (parent[i] == oldTree) parent[i] = newtree;
        }
    }

    public boolean isValid(){
        int flag = 0;

        for (int i = 0; i < parent.length; i++){
            if (i == parent[i]){
                flag++;
                if (flag > 1)return false;
            }
        }
        return true;
    }

    private void initialiseParent(){
        for (int i = 0; i < parent.length; i++){
            parent[i] = i;
        }
    }

    private void initialisePaths(){
        ArrayList<Path> pathArrayList = new ArrayList<>();
        for (Node node:graph.arrayListOfNode) {
            for (int pathPosition = 0; pathPosition < node.getArrayOfPath().size(); pathPosition++){
                if (!pathArrayList.contains(node.getArrayOfPath().get(pathPosition))) {
                    pathArrayList.add(node.getArrayOfPath().get(pathPosition));
                }
            }
            //node.setKeyValue(Integer.MAX_VALUE);
        }
        paths = new Path[pathArrayList.size()];
        int i = 0;
        for (Path path : pathArrayList) {
            paths[i] = path;
            i++;
        }
        bubbleSort();
    }

    private void setTrue(Path path){
        graph.arrayListOfNode.get(graph.arrayListOfNode.indexOf(path.getEnd())).getArrayOfPath().get(graph.arrayListOfNode.get(graph.arrayListOfNode.indexOf(path.getEnd())).getArrayOfPath().indexOf(path)).setVariableIsUsed(true);
        path.setVariableIsUsed(true);
        path.getEnd().setUsed(true);
        path.getBegin().setUsed(true);
        path.getEnd().getArrayOfPath().get(path.getEnd().getArrayOfPath().indexOf(path)).setVariableIsUsed(true);
        path.getBegin().getArrayOfPath().get(path.getBegin().getArrayOfPath().indexOf(path)).setVariableIsUsed(true);
    }

    private boolean isLinked(int firstInteger, int secondInteger) {
        int i = firstInteger;
        while (parent[i] != i) {
            i = parent[i];
        }
        int j = secondInteger;
        while (parent[j] != j) {
            j = parent[j];
        }
        if (j == i)return true;
        else return false;
    }

    private void setNewRootInParent(int firstInteger, int secondInteger){
        int j = secondInteger;
        while (parent[j] == j) {
            j = parent[j];
        }
        parent[j]=firstInteger;
    }
    public void bubbleSort() {
        int n = paths.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (paths[j].getWeight() > paths[j+1].getWeight())
                {
                    Path temp = paths[j];
                    paths[j] = paths[j+1];
                    paths[j+1] = temp;
                }
    }

    public void displayParent(){
        for (int i = 0; i < parent.length; i++) {
            System.out.println(i + ": parent : " + parent[i]);
        }
    }

    public boolean isPointedInParent(int i){
        for (int j = 0; j < parent.length; j++){
            if(i != j && parent[j] == i)return true;
        }
        return false;
    }
}
