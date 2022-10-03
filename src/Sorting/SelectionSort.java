package Sorting;

import java.util.Scanner;

public class SelectionSort {
    private static void selectionSort(int arr[], int n){
        for (int i = 0; i < n; i++){
            int smallest = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        selectionSort(arr,n);
    }
}
