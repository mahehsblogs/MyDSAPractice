package Sorting;

import java.util.Scanner;

public class InsersionSort {
    private static void insersionSort(int arr[], int n){
        for (int i = 1; i < n; i++){
            int curr = arr[i];
            int j = i-1;
            while(j >= 0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        insersionSort(arr,n);
    }
}
