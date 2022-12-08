package org.cs.DataStructures.LinkedList;

public class LinkedList {
    private Link startNode;

    public LinkedList() {
        startNode = null;
    }

    public boolean isEmpty() {
        return startNode == null;
    }

    public void insert(int data1, double data2) {
        Link link1 = new Link(data1, data2);
        link1.nextLink = startNode;
        startNode = link1;
    }

    public Link delete() {
        Link temp = startNode;
        if (startNode == null) {
            return null;
        }

        startNode = startNode.nextLink;
        return temp;
    }

    public void printList() {
        Link currentLink = startNode;
        System.out.print("First: ");

        while (currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }

        System.out.println("");
    }
}

class LinkListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1, 1.01);
        list.insert(2, 2.02);
        list.insert(3, 3.03);
        list.insert(4, 4.04);
        list.insert(5, 5.05);
        list.printList();
        while(!list.isEmpty()) {
            Link deletedLink = list.delete();
            System.out.print("deleted: ");
            deletedLink.printLink();
            System.out.println("");
        }
        list.printList();
    }
}
