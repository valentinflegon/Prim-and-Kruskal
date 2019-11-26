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
    public ArrayList<Point> arrayListOfPoint; //affichage graphique
    public ArrayList<Path> arrayOfPath;


    public Graph() {
        this.arrayListOfNode = new ArrayList<Node>();
        this.arrayOfPath = new ArrayList<>();
        this.arrayListOfPoint = new ArrayList<>();
    }

    public void addNode(Node node){
        this.arrayListOfNode.add(node);
        this.arrayListOfNode.get(this.arrayListOfNode.size()-1).setIndex(arrayListOfNode.size()-1);
        arrayListOfPoint.add(new Point(50,50));
    }

    public void addPath(Path path){
        arrayOfPath.add(path);
    }

    public void display(){
        Point[] points = new Point[arrayListOfNode.size()];
        Painter painter = new Painter(800,600);
        for (int i = 0; i<arrayListOfNode.size(); i++) {
            points[i] = new Point(arrayListOfNode.get(i).getX(), arrayListOfNode.get(i).getY());
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
        for (Path path:arrayOfPath) {
            begin = arrayListOfNode.indexOf(path.getBegin());
            end = arrayListOfNode.indexOf(path.getEnd());
            points[begin].drawLine(points[end], painter, Color.lightGray);
        }
        for (Path path:arrayOfPath) {
            begin = arrayListOfNode.indexOf(path.getBegin());
            end = arrayListOfNode.indexOf(path.getEnd());
            if (path.isUsed()) {
                points[begin].drawLine(points[end], painter, Color.blue);
            }
        }
        Main.drawPoints(painter,points);
    }

    public void display3(){
        Point[] points = new Point[arrayListOfNode.size()];
        Painter painter = new Painter(800,600);
        int begin, end;
        for (int i = 0; i<arrayListOfNode.size(); i++) {
            points[i] = new Point(arrayListOfNode.get(i).getX(), arrayListOfNode.get(i).getY());
        }
        Main.drawPoints(painter,points);
        for (Path path:arrayOfPath) {
            begin = arrayListOfNode.indexOf(path.getBegin());
            end = arrayListOfNode.indexOf(path.getEnd());
            if (path.isUsed()) {
                points[begin].drawLine(points[end], painter, Color.blue);
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
}
