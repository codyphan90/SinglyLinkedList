public class Main {

    public static void main(String[] args) {
        IntLinkedList intLinkedList = new IntLinkedList();
        intLinkedList.appendAtTail(10);
        intLinkedList.appendAtTail(10);
        intLinkedList.appendAtTail(22);
        intLinkedList.appendAtTail(3);
        intLinkedList.appendAtTail(34);
        intLinkedList.appendAtTail(21);
        intLinkedList.appendAtTail(6);
        intLinkedList.appendAtTail(2);
        intLinkedList.appendAtTail(11);
//        intLinkedList.removeTail();
//        intLinkedList.removeAtIndex(5);
//        intLinkedList.moveToTailNode(4);
        intLinkedList.removeNodeGreatThan(10);
        intLinkedList.display();

    }
}
