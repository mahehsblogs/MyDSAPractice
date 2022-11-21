package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
//        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        ArrayList<Integer>list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 0; i< n; i++) {
            int value = scn.nextInt();
            list.add(value);
        }

        for (int i = list.size()-1; i >=0; i--)
            System.out.print(list.get(i) + " ");

    }
}
