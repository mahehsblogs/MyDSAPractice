package LinkedList;


public class Main {
    public static void main(String[] args) {
        LL li = new LL();
//        li.insertNode(3);
//        li.insertNode(4);
//        li.insertNode(5);
//        li.insertNode(6);

        li.insertAtLast(3);
        li.insertAtLast(4);
        li.insertAtLast(5);
        li.insertAtLast(6);

        li.printList(LL.getHead());
    }

}
