package MockTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
Problem 1: Given an integer numRows, return the first numRows of Pascal's triangle.

Input: numRows = 5

Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Input: numRows = 1

Output: [[1]]

we can find the with help of binomial coeficient as well.
 */
public class PascalTriangle {
//    public static int fact(int i){
//        if(i == 0){
//            return 1;
//        }
//        return i* fact(i-1);
//    }
    // we have store
    public static void pascDp(int n){
        if(n == 0){
            return;
        }
        ArrayList<Integer> row = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            row.add(0,1);
            for (int j = 1; j < row.size()-1; j++) {
                row.set(j,row.get(j)+row.get(j+1));
            }

            Iterator it = row.iterator();
            while (it.hasNext()){
                System.out.print((Integer)it.next()+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pascDp(n);
    }
}
