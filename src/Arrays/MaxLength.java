package Arrays;

import java.util.Scanner;

public class MaxLength {
    private static int maxLength(int[] arr, int n, int k){
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] < k){
                cnt++;
            }else{
                break;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(maxLength(arr, n, k));
    }
}
/*
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    static void longest(int arr[], int n, int k){
        int[] freq = new int[7];

        int start = 0, end = 0, now = 0, l = 0;
        for (int i = 0; i < n; i++){

            freq[arr[i]]++;
            if (freq[arr[i]] == 1)
                now++;

            while (now >= k){
                freq[arr[l]]--;

                if (freq[arr[l]] == 0)
                    now--;
                l++;
            }

            if (i - l + 1 >= end - start + 1)
            {
                end = i;
                start = l;
            }
        }
        // for (int i = start; i <= end; i++)
            System.out.print(end - start + 1);
    }

    public static void main (String[] args) {
        // Your code here
        Scanner scn = new Scanner(System.in);
        // int cnt = 0;
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        longest(arr, n, k);
    }
}
 */