package com.company;

import java.util.ArrayList;

public class Prim {

    public Prim() {
    }

// verifier si le graph est connexe

    public void prim(Graph graph){

        //partir d'un noeud
        //ici le premier noeud rentré
        Node initNode = graph.arrayListOfNode.get(0);
        graph.arrayListOfUseNode.add(initNode);

        do{
            for (int i=0;i<graph.arrayListOfUseNode.size();i++){
                Path goodPath = findBestPath(graph.arrayListOfUseNode);
                graph.arrayListOfUseNode.add(goodPath.getEnd());
            }

        //on fait ca tant que tout les nodes ne sont pas utilisé
        // cad il faut qu'il y ait autant de node utilisé que de Node rentré
        }while (graph.arrayListOfNode.size() != graph.arrayListOfUseNode.size());
    }


    // il faudra calculer le poids



    //choisir son path de poid le plus faible
    // pas utiliser la transition deja prise
    public Path findBestPath(ArrayList<Node> arrayOfNode){

        //initialisation
        int weightTransitionMin = arrayOfNode.get(0).getArrayOfPath(0).getWeight();
        Path pathMin = arrayOfNode.get(0).getArrayOfPath(0);

        //on parcourt  tout les nodes de la liste
        for(int i=0;i < arrayOfNode.size(); i++){

            //on parcourt toutes les transitions de chaque nodes
            for (int j=0; j < arrayOfNode.get(i).getArrayOfPath().size();j++){

                int transitionCurrent = arrayOfNode.get(i).getArrayOfPath(j).getWeight();
                //on verifie que la transition n'est pas deja utilisé
                if(arrayOfNode.get(i).getArrayOfPath(j).isUsed() == false){

                    //on stock la transition de poids min
                    if (transitionCurrent < weightTransitionMin){
                        weightTransitionMin = transitionCurrent;
                        pathMin = arrayOfNode.get(i).getArrayOfPath(j);
                    }
                }
            }
        }

        //on met la variable a utilisé
        pathMin.setVariableIsUsed(true);
        return pathMin;

    }




}
