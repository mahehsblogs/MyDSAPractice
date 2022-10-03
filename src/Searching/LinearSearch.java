package Searching;

import java.util.Scanner;

public class LinearSearch {
    private static int linearSearch(int arr[], int n, int x){
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(linearSearch(arr, n, x));
    }

}
