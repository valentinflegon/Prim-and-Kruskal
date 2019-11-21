package com.company;
import java.util.ArrayList;
import java.util.Collections;
public class Kruskal {
    private int sommePath;

    public Kruskal() {
        this.sommePath = 0;
    }

    /**
     *
     * @param graph
     * @return
     */
    public int kruskal(Graph graph){



        Path goodPath;

        do{
            goodPath = findBestPath(graph.arrayListOfNode);
            graph.arrayListOfUseNode.add(goodPath.getBegin());
            graph.arrayListOfUseNode.add(goodPath.getEnd());

        }while (graph.arrayListOfNode.size() != graph.arrayListOfUseNode.size());

        return getSommePath();
    }

    /**
     * fonction qui va trier toutes les transitions
     *
     * @param arrayListOfNode
     * @return une liste de transitions triées
     */
    public ArrayList<Path> arrayListOfNodeWhereSortPath(ArrayList<Node> arrayListOfNode){
        ArrayList<Path> listeTrieOfPath = new ArrayList<>();

        //on ajoute toute les transitions dans une liste
        for (int i=0;i<arrayListOfNode.size();i++){
            for (int j=0;j<arrayListOfNode.get(i).getArrayOfPath().size();j++){
                listeTrieOfPath.add(arrayListOfNode.get(i).getArrayOfPath().get(j));
                System.out.println(listeTrieOfPath.get(i).getWeight());
            }
        }

        //on trie la liste
        //a voir
        Collections.sort(listeTrieOfPath);

        //retourne une liste avec toute les transitions trié
        return listeTrieOfPath;
    }

    /**
     *
     * @param arrayOfNode
     * @return
     */
    public Path findBestPath(ArrayList<Node> arrayOfNode) {
        ArrayList<Path> arrayListSortPath = arrayListOfNodeWhereSortPath(arrayOfNode);
        Path goodPath ;
        for (int i=0;i<arrayListSortPath.size();i++){
            if (arrayListSortPath.get(i).isVariableIsUsed() != false ){
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
