import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(10);
        myLinkedList.add(5);
        myLinkedList.add(9);
        myLinkedList.add(4);
        myLinkedList.add(6);
        myLinkedList.add(1);
        myLinkedList.sort();
        System.out.println();
        myLinkedList.printList();

    }
}