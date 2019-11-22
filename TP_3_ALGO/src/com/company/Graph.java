package com.company;

import com.company.src.Main;
import com.company.src.Point;

import tp2.lib.Painter;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Arrays;
import java.util.List;
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

        Main.createPoints(points);
        Main.drawPoints(painter,points);
        for (Node node:arrayListOfUseNode) {

            for (Path path:node.getArrayOfPath()) {
                if(path.isUsed()) {
                    begin = arrayListOfUseNode.indexOf(path.getBegin());
                    end = arrayListOfUseNode.indexOf(path.getEnd());
                    points[begin].drawLine(points[end],painter,Color.lightGray);
                }
            }
        }


        /*
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(new Color(10, 50, 50));
        Shape circle = new Rectangle();
        circle.contains(40,52);
        g2d.draw(circle);*/
    }

}
