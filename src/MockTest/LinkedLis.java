package MockTest;

public class LinkedLis {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            next = null;
        }
    }

    Node reverse(Node node){
        Node prev = null;
        Node curr = node;
        Node next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    void removeOddNode(){
        Node ptr = head;
        while (ptr != null){
            if(ptr.data % 2 == 1){
                deleteNode(ptr.data);
            }
            ptr = ptr.next;
        }
    }

    private void deleteNode(int key) {
        Node temp = head;
        Node pre = null;

        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key){
            pre = temp;
            temp = temp.next;
        }
        if(temp == null) return;
        pre.next = temp.next;
    }

    void print(Node node){
        while (node != null){
            System.out.print(node.data + " ");
//            System.out.print("null");
            node = node.next;
        }
    }
    public void printList(){
        Node ptr = head;
        while (ptr != null){
            System.out.println(ptr.data + " ");
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {
        LinkedLis list = new LinkedLis();
        list.head = new Node(5);
        list.head.next = new Node(6);
        list.head.next.next = new Node(7);
        list.head.next.next.next = new Node(8);

        System.out.println("original linked list");
        list.print(head);

        head = list.reverse(head);
        System.out.println();
        System.out.println("Reverse linked list");
        list.print(head);
        System.out.println();
        System.out.println("Print new list");
        list.printList();
        System.out.println();
        System.out.println("Print odd list");
        list.removeOddNode();
        System.out.println();
        System.out.print("Print new list");
        list.printList();

    }
}
