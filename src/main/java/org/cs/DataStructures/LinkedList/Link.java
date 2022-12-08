package org.cs.DataStructures.LinkedList;

public class Link {
    private int data1;
    private double data2;
    public Link nextLink;

    public Link(int d1, double d2) {
        data1 = d1;
        data2 = d2;
    }

    public void printLink() {
        System.out.println("{" + data1 + ", " + data2 + "}");
    }
}
