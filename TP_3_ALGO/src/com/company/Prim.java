package com.company;



import java.awt.*;
import java.util.ArrayList;

public class Prim {
    private int sommePath;
    public Graph graph;

    public Prim(Graph graph) {
        this.sommePath = 0;
        this.graph = graph;
    }

    /**
     *
     *
     */
    public int prim(){

        //partir d'un noeud
        //ici le premier noeud rentré
        Node initNode = graph.arrayListOfNode.get(0);
        graph.arrayListOfUseNode.add(initNode);
        Path goodPath= initNode.getArrayOfPath().get(0);
        while (graph.arrayListOfNode.size() != graph.arrayListOfUseNode.size()){
            //    System.out.println("nombre de noeud : "+graph.arrayListOfNode.size());
            //  System.out.println("nombre de noeud utilisé :"+graph.arrayListOfUseNode.size());

            System.out.println("nombre de noeud rentré :"+graph.arrayListOfNode.size());
            System.out.println("nombre de noeud utilisé :"+ graph.arrayListOfUseNode.size());

            //    for (int i=0;i <= graph.arrayListOfUseNode.size()+1;i++){
            goodPath = findBestPath();

            // }
            graph.arrayListOfUseNode.add(goodPath.getEnd());

            //on fait ca tant que tout les nodes ne sont pas utilisé
            // cad il faut qu'il y ait autant de node utilisé que de Node rentré
        }
        return getSommePath();
    }

    /***
     *
     * @param
     * @return
     */
    public Path findBestPath(){
        //initialisation
        int weightTransitionMin = graph.arrayListOfUseNode.get(0).getArrayOfPath(0).getWeight();
        Path pathMin = graph.arrayListOfUseNode.get(0).getArrayOfPath(0);

        //on parcourt  tout les nodes de la liste
        for(int i=0;i < graph.arrayListOfUseNode.size(); i++){

            //on parcourt toutes les transitions de chaque nodes
            for (int j=0; j < graph.arrayListOfUseNode.get(i).getArrayOfPath().size();j++){

                int transitionCurrent = graph.arrayListOfUseNode.get(i).getArrayOfPath(j).getWeight();
                //on verifie que la transition n'est pas deja utilisé
                if(!graph.arrayListOfUseNode.get(i).getArrayOfPath(j).isVariableIsUsed()){

                    //on stock la transition de poids min
                    if (transitionCurrent < weightTransitionMin){
                        weightTransitionMin = transitionCurrent;
                        pathMin = graph.arrayListOfUseNode.get(i).getArrayOfPath(j);
                        graph.arrayListOfUseNode.get(i).getArrayOfPath(j).setVariableIsUsed(true);
                    }
                }
            }
        }
        pathMin.setVariableIsUsed(true);
        sommePath = sommePath +pathMin.getWeight();
        return pathMin;
    }

    /**
     *
     * @return le poids du chemin actuel
     */
    public int getSommePath() {
        return sommePath;
    }


}
