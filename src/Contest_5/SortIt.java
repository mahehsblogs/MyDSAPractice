/*
Given an array of N integers containing only 0 or 1. You can do following operations on the array:
> swap elements at two indices.
> choose one index and change its value from 0 to 1 or vice- versa.
You have to do minimum number of above operations such that the final array is non-decreasing.

Input
First line of input contains a single integer N.
Second line of input contains N space separated integers denoting the array.

Constraints:
1 <= N <= 100000
elements of the array are 0 or 1.
Output
Minimum number of moves required such that the final array is non- decreasing.
*/

package Contest_5;

import java.util.Scanner;

public class SortIt {
    private static int minNoOfMove(int arr[], int n){
        int start = 0;
        int end = n-1;
        int cnt = 0;
        while (start < end){
            if(arr[start] == 0)
                start++;
            if(arr[end] == 1)
                end--;
            if(start < end) {
                swap(arr, start, end);
                cnt++;
            }
        }
        return cnt;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(minNoOfMove(arr,n));
    }
}
