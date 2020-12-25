import MyLinkedList.*;

public class Main {

    public static void main(String[] args) throws Exception {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(new Node(22, null));
        myLinkedList.addFirst(new Node(60, null));
        myLinkedList.addLast(new Node(80, null));
        myLinkedList.addFirst(new Node((70), null));
        myLinkedList.getFirst();
        myLinkedList.getLast();
        myLinkedList.getSize();
        myLinkedList.print();
        myLinkedList.removeFirst();
        System.out.println("\n");
        myLinkedList.print2();
        System.out.println("\n");
        myLinkedList.addAfter(new Node(666, null), 60);
        myLinkedList.print2();
        System.out.println("\n");
        myLinkedList.deleteByElement(60);
        myLinkedList.print2();
    }
}
