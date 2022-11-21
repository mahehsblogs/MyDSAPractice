package Arrays;

import java.util.Scanner;

public class deleteElement {

    private static void removeElement(int[] arr, int n, int k){
        int[] arr1 = new int[n];
        for (int i = 0; i< n; i++){
            if(arr[i] == k)
                continue;
            arr1[i] = arr[i];
        }
//        return arr1;
        for (int i = 0; i < n; i++)
            System.out.print(arr1[i]+" ");
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
//        System.out.print(removeElement(arr,n,k));
        removeElement(arr,n,k);
    }
}
