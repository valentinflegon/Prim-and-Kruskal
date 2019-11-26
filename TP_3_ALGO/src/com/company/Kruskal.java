package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kruskal {
    private int sommePath = 0;
    Graph graph;

    public Kruskal(Graph graph) {
        this.sommePath = 0;
        this.graph = graph;
    }


    public List<Path> sortPath(Graph graph){
        List<Path> listPath = new ArrayList<>();
        for (int i=0; i<graph.arrayListOfNode.size();i++){
            for (int j=0; j<graph.arrayListOfNode.size(); j++){
                listPath.add(new Path(graph.arrayListOfNode.get(i),graph.arrayListOfNode.get(j)));
            }
        }

        listPath.sort(Comparator.comparing(Path::getWeight));
        return listPath;
    }

    public List<Path> kruskal(Graph graph){
         List<Path> sortPath = sortPath(graph);
         List<Path> listACM = new ArrayList<>();
         int i= 0;
         while (listACM.size() < sortPath.size()-1){
             Path path = sortPath.get(i++);
             int firstId = path.getBegin().clusterId;
             int secondId = path.getEnd().clusterId;
             if (firstId != secondId){
                 listACM.add(path);
                 for(Node n: graph.arrayListOfNode){
                     if (n.clusterId == secondId){
                         n.clusterId = firstId;
                     }
                 }
             }
         }
         return listACM;
    }


    /**
     *
     * @return
     */
    public int getSommePath() {
        return sommePath;
    }


}
