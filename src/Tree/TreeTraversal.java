package Tree;

import java.util.Scanner;

class TreeNode{
    int data;
    TreeNode left,right;

    TreeNode(int data){
        this.data = data;
        left = right = null;
    }
}
public class TreeTraversal {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        TreeNode root = null;
        while(n-- > 0){
            int data = scn.nextInt();
            root = new TreeNode(1);
            root.left = new TreeNode(data);
            root.right = new TreeNode(data);
            inorder(root);
        }

    }
    public static void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
}
