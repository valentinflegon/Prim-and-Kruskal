package com.company;
import java.util.ArrayList;
import java.util.Collections;
public class Kruskal {
    private int sommePath;
    Graph graph;

    public Kruskal(Graph graph) {
        this.sommePath = 0;
        this.graph = graph;
    }

    /**
     *
     * @param
     * @return
     */

    public int kruskal(){
          /*

        Path goodPath;
        do{
            goodPath = findBestPath();
            goodPath.getBegin().setUsed(true);
            goodPath.getEnd().setUsed(true);
            goodPath.setVariableIsUsed(true);
            goodPath.getBegin().getArrayOfPath().get(goodPath.getBegin().getArrayOfPath().indexOf(goodPath)).setVariableIsUsed(true);
            goodPath.getEnd().getArrayOfPath().get(goodPath.getEnd().getArrayOfPath().indexOf(goodPath)).setVariableIsUsed(true);
            graph.arrayListOfUseNode.add(goodPath.getBegin());
            graph.arrayListOfUseNode.add(goodPath.getEnd());
        }while (graph.arrayListOfNode.size() != graph.arrayListOfUseNode.size());
        for (Node node: graph.arrayListOfUseNode
             ) {

        }
        return getSommePath();

           */
    return Integer.parseInt(null);}

    /**
     * fonction qui va trier toutes les transitions
     *
     * @param
     * @return une liste de transitions triées
     */
    public ArrayList<Path> arrayListOfNodeWhereSortPath(){
        /*
        ArrayList<Path> listeTrieOfPath = new ArrayList<>();

        //on ajoute toute les transitions dans une liste
        for (int i=0;i<graph.arrayListOfNode.size();i++){
            for (int j=0;j<graph.arrayListOfNode.get(i).getArrayOfPath().size();j++){
                listeTrieOfPath.add(graph.arrayListOfNode.get(i).getArrayOfPath().get(j));
                System.out.println(listeTrieOfPath.get(i).getWeight());
            }
        }

        //on trie la liste
        //a voir
       // Collections.sort(listeTrieOfPath);

        //retourne une liste avec toute les transitions trié
        return listeTrieOfPath;

         */
    return null;}

    /**
     *
     * @param
     * @return
     */
    public Path findBestPath() {
        ArrayList<Path> arrayListSortPath = arrayListOfNodeWhereSortPath();
        Path goodPath ;
        for (int i=0;i<arrayListSortPath.size();i++){
            if (!arrayListSortPath.get(i).isVariableIsUsed()){
                goodPath = arrayListSortPath.get(i);
                arrayListSortPath.get(i).setVariableIsUsed(true);
                sommePath = sommePath + goodPath.getWeight();
                return goodPath;
            }
        }
        return null;
    }

    /**
     *
     * @return
     */
    public int getSommePath() {
        return sommePath;
    }
}
