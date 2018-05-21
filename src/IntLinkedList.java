import java.util.Arrays;

public class IntLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public IntLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void appendAtHead(int value) {
        Node nodeAppend = new Node(value, null);
        size++;
        if (head == null) {
            head = nodeAppend;
            tail = head;
        } else {
            nodeAppend.setNext(head);
            head = nodeAppend;
        }
    }

    public void appendAtTail(int value) {
        Node nodeAppend = new Node(value, null);
        size++;
        if (head == null) {
            tail = nodeAppend;
            head = tail;
        } else {
            tail.setNext(nodeAppend);
            tail = nodeAppend;
        }
    }

    public void appendAtIndex(int value, int index) {
        Node nodeAppend = new Node(value, null);
        Node currentNode = head;
        if (index == 0) {
            appendAtHead(value);
        } else if (index == (size - 1)) {
            appendAtTail(value);
        } else {
            index = index - 1;
            for (int i = 1; i < size - 1; i++) {
                if (i == index) {
                    Node tempNode = currentNode.getNext();
                    nodeAppend.setNext(tempNode);
                    currentNode.setNext(nodeAppend);
                    break;
                }
                currentNode = currentNode.getNext();
            }
        }
        size++;
    }

    public void removeTail() {
        Node currentNode = head;
        for (int i = 0; i < size; i++) {
            if (i == size - 2) {
                currentNode.setNext(null);
                size--;
                break;
            }
            currentNode = currentNode.getNext();
        }
    }

    public void removeNodeGreatThan(int targetValue) {
        Node currentNode = head;
        Node preNode = null;
        while (currentNode != null) {
            if (currentNode.getValue() > targetValue) {
                if (currentNode == head) {
                    head = head.getNext();
                } else {
                    preNode.setNext(currentNode.getNext());
                    size--;
                }
            } else {
                preNode = currentNode;
            }
            currentNode = currentNode.getNext();
        }
    }

    public void removeAtIndex(int index) {
        Node currentNode = head;
        if (index == 0) {
            head = head.getNext();
            size--;
        } else if (index == (size - 1)) {
            removeTail();
        } else {
            index = index - 1;
            for (int i = 0; i < size - 1; i++) {
                if (index == i) {
                    Node nextNode = currentNode.getNext();
                    currentNode.setNext(nextNode.getNext());
                    size--;
                    break;
                }
                currentNode = currentNode.getNext();
            }
        }
    }

    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }
}
