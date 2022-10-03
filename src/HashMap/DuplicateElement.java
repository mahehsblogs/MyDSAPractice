package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateElement {
    private static int duplicateElement(int[] arr, int n){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++){
            if(mp.containsKey(arr[i])){

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
    }
}
