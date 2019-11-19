package com.company;

public class Main {

    public static void main(String[] args) {
        Node nodeA = new Node('a');
        Node nodeB = new Node('b');
        Path p1 = new Path(nodeA,nodeB,3);
        p1.display();
        Path p2 = new Path(nodeA,nodeB,99);
        p2.display();

    }

}
