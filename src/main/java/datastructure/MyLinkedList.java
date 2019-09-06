package datastructure;

public class MyLinkedList {
    Node head;
    Node tail;

    public MyLinkedList(Node head) {
        this.head = head;
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public void insertHead(int dataToBeInserted) {
        Node newNode = new Node(dataToBeInserted);
        newNode.next = head;
        this.head = newNode;
    }

    public void insertLast(int dataToRight) {
        Node lastNode = new Node(dataToRight);
        if (head == null) {
            this.head = lastNode;
            return;
        }

        Node crtNode = head;

        while (crtNode.next != null) {
            crtNode = crtNode.next;
        }
        crtNode.next = lastNode;
        //tail=lastNode;
    }

    public void insertAfterData(int data) {
        Node newNode = new Node(data);
        Node crtNode = head;

        while (crtNode.data != data && crtNode.next != null) {
            crtNode = crtNode.next;
        }
        if (crtNode.data != data) {
            System.out.println("There is no node, no add..");
            return;
        } else {
            if (crtNode.next == null) {
                crtNode.next = newNode;
            } else {
                Node rightNode = crtNode.next;
                crtNode.next = newNode;
                newNode.next = rightNode;
            }
        }
        }

    public void insertAfter(Node b, int data) { // insertNodeAfterPosition
        if(listContains(b)){
            Node newNode=new Node(data);
            newNode.next=b.next;
            b.next=newNode;
        }else{
            System.out.println("Node " + b.data + "does not exist");
        }
    }

    boolean listContains(Node n){
        boolean contains=false;
        Node node = head;
        while(node!=null&& node.data!=n.data){
            node=node.next;
        }
        if(node!=null){
            contains=true;
        }
        return contains;
    }
}


