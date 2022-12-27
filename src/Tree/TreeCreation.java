package Tree;

import java.util.Scanner;

public class TreeCreation {
    static Node create(){
        int data;
        Scanner scn = new Scanner(System.in);
        Node root = null;
//        System.out.print("Enter data");
        data = scn.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);
        System.out.print("Enter left child of "+root.data+" ");
        root.left = create();
        System.out.print("Enter right child of "+root.data+" ");
        root.right = create();

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        inorder(root.left);
        inorder(root.right);
    }
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {

        Node root = create();
        System.out.println("Preorder traversal of given tree is: ");
        preOrder(root);
        System.out.println();
        System.out.println("Inorder traversal of given tree is: ");
        inorder(root);
        System.out.println();
        System.out.println("Postorder traversal of given tree is: ");
        postOrder(root);
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
