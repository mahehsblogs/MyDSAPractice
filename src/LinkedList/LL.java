package LinkedList;


public class LL {
    private static Node head;

    public static Node getHead() {
        return head;
    }

    class Node{
        int data;
        Node next;
//        public Node(){
//            int data;
//        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void insertNode(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtLast(int data){
        Node curr = head;
        Node newNode = new Node(data);
        if(curr == null){
            head = newNode;
        }else{
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }

    }

    public void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

//    public static void main(String[] args) {
//        LL li = new LL();
//        li.insertNode(3);
//        li.insertNode(4);
//        li.insertNode(5);
//
//        li.printList(head);
//    }
}
