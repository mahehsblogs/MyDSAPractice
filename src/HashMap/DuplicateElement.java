package HashMap;

import java.util.HashMap;
import java.util.Scanner;
//finding duplicates elements into the arrays
public class DuplicateElement {
    private static int duplicateElement(int[] arr, int n){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            mp.put(arr[i], 1);
        }
        for (int i = 0; i < n; i++) {
            if(mp.get(arr[i]) > 1){
                return arr[i];
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
        System.out.println(duplicateElement(arr, n));
    }
}
