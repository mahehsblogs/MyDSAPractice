package Searching;

import java.util.Scanner;

public class BinarySearch {
    private static int binarySearch(int arr[], int n, int k){
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == k)
                return mid;
            else if(arr[mid] < k)
                start = mid + 1;
            else if(arr[mid] > k)
                end = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(binarySearch(arr, n, k));
    }
}
