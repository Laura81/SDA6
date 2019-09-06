package datastructure;

import org.junit.Test;

public class TestMyLinkedList {

    @Test

    public void teest() {
        Node n= new Node(5);
        MyLinkedList linkedList= new MyLinkedList(n);
        linkedList.insertHead(7);
        linkedList.insertLast(8);

        // linkedList.insertAfterData(5);
        // linkedList.insertAfterGivenNode(n, 7);

        // Node positionToAddAfter=new Node(5);
        // Node randomNode=new Node(10);
        // linkedList.insertAfter(positionToAddAfter, 3);
        linkedList.insertAfter(n, 4);

        // linkedList.printList();

        // boolean containes=linkedList.listContains(randomNode);
        // System.out.println(containes);
        // MyLinkedList list=new MyLinkedList(null);
        // list.insertLast(6);
        // list.printList();
    }
}
