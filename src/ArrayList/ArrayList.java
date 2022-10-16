package ArrayList;

import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
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
