package com.company;

import com.company.front.Main;
import com.company.front.Point;

import tp2.lib.Painter;

import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JComponent;

public class Graph extends JComponent {
    //création d'un graph avec des transtions

    public ArrayList<Node> arrayListOfNode;
    public ArrayList<Node> arrayListOfUseNode;
    public ArrayList<Point> arrayListOfPoint;

    public Graph() {
        this.arrayListOfNode = new ArrayList<Node>();
        this.arrayListOfUseNode = new ArrayList<Node>();
        arrayListOfPoint = new ArrayList<>();
    }

    public void addNode(Node node){
        this.arrayListOfNode.add(node);
        this.arrayListOfNode.get(this.arrayListOfNode.size()-1).setIndex(arrayListOfNode.size()-1);
        arrayListOfPoint.add(new Point(50,50));
    }

    public void addPath(Path path){
        path.getBegin().getArrayOfPath().add(path);
        path.getEnd().getArrayOfPath().add(path);
    }

    public void display(){
        Point[] points = new Point[arrayListOfNode.size()];
        Painter painter = new Painter(800,600);
        int begin, end;
        ArrayList<Path> printedPath = new ArrayList<>();
        for (int i = 0; i<arrayListOfNode.size(); i++) {
            points[i] = new Point(arrayListOfNode.get(i).getX(), arrayListOfNode.get(i).getY());
        }
        Main.drawPoints(painter,points);
        for (Node node:arrayListOfUseNode) {
            for (Path path:node.getArrayOfPath()) {
                if(path.isUsed() && !printedPath.contains(path)) {
                    printedPath.add(path);
                    begin = arrayListOfUseNode.indexOf(path.getBegin());
                    end = arrayListOfUseNode.indexOf(path.getEnd());
                    //System.out.println(path.getBegin().getLabel() + "-" + path.getWeight() + "-" + path.getEnd().getLabel());
                    points[begin].drawLine(points[end],painter,Color.lightGray);
                }
            }
        }
    }
    public void display1(){
        Point[] points = new Point[arrayListOfNode.size()];
        Painter painter = new Painter(800,600);
        int begin, end;
        for (int i = 0; i<arrayListOfNode.size(); i++) {
            points[i] = new Point(arrayListOfNode.get(i).getX(), arrayListOfNode.get(i).getY());
        }
        Main.drawPoints(painter,points);
        for (Node node:arrayListOfNode) {
            for (Path path:node.getArrayOfPath()) {
                begin = arrayListOfNode.indexOf(path.getBegin());
                end = arrayListOfNode.indexOf(path.getEnd());
                //System.out.println(path.getBegin().getLabel() + "-" + path.getWeight() + "-" + path.getEnd().getLabel());
                points[begin].drawLine(points[end],painter,Color.lightGray);
            }
        }
        Main.drawPoints(painter,points);
    }


    public void display2(){
        Point[] points = new Point[arrayListOfNode.size()];
        Painter painter = new Painter(800,600);
        int begin, end;
        for (int i = 0; i<arrayListOfNode.size(); i++) {
            points[i] = new Point(arrayListOfNode.get(i).getX(), arrayListOfNode.get(i).getY());
        }
        Main.drawPoints(painter,points);
        for (Node node:arrayListOfNode) {
            for (Path path:node.getArrayOfPath()) {
                begin = arrayListOfNode.indexOf(path.getBegin());
                end = arrayListOfNode.indexOf(path.getEnd());
                //System.out.println(path.getBegin().getLabel() + "-" + path.getWeight() + "-" + path.getEnd().getLabel());
                points[begin].drawLine(points[end],painter,Color.lightGray);
            }
        }
        for (Node node:arrayListOfNode) {
            for (Path path:node.getArrayOfPath()) {
                if(path.isUsed()) {
                    begin = arrayListOfNode.indexOf(path.getBegin());
                    end = arrayListOfNode.indexOf(path.getEnd());
                    //System.out.println(path.getBegin().getLabel() + "-" + path.getWeight() + "-" + path.getEnd().getLabel());
                    points[begin].drawLine(points[end],painter,Color.blue);
                }
            }
        }
        Main.drawPoints(painter,points);
    }

    public void initArrayListOfNode(){
        int i = 0;
        for (Node node:arrayListOfNode) {
            node.setIndex(i);
            i++;
        }
    }

    public boolean containValidNode(Node node){
        for (Node actualNode : arrayListOfNode) {
            if (actualNode.isUsed() == node.isUsed()) return  true;
        }
        return false;
    }
}
