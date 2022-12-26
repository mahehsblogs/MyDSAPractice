package Tree;

import java.util.Scanner;

public class TreeCreation {
    static Node create(){
        int data;
        Scanner scn = new Scanner(System.in);
        Node root = null;
        System.out.print("Enter data");
        data = scn.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);
        System.out.print("Enter left child of"+root);
        root.left = create();
        System.out.print("Enter right child of"+root);
        root.right = create();

        return root;
    }

    public static void main(String[] args) {
        Node root = create();
    }
}

class Node{
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
