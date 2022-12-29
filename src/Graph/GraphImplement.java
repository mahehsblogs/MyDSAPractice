package Graph;

import java.util.LinkedList;
import java.util.Scanner;

public class GraphImplement {
    private LinkedList<Integer> adj[];

    public GraphImplement(int v){
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }

    }
    public void insertEdge(int s, int d){
        adj[s].add(d);
        adj[d].add(s);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of vertices and edges: ");
        int v = scn.nextInt();
        int e = scn.nextInt();
        GraphImplement g = new GraphImplement(v);
        System.out.println("Enter Edges");
        for (int i = 0; i < e; i++) {
            int s = scn.nextInt();
            int d = scn.nextInt();
            g.insertEdge(s, d);
        }
    }
}
