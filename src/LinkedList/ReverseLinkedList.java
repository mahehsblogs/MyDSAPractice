package LinkedList;

public class ReverseLinkedList {
    static Node head;
    //creating a node class and initialize the data and next pointer
    private static class Node{
        int data;
        Node next;
//        creating a constructor of Node class
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + "-> ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList lists = new ReverseLinkedList();
        head = new Node(85);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        lists.printList(head);
        head = lists.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        lists.printList(head);
    }
}
