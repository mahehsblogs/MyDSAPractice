package Arrays;

import java.util.Scanner;

public class KadaneAlgorithm {
    private static int kadane(int[] arr, int n){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum = curr_sum + arr[i];
            max_sum = Math.max(max_sum, curr_sum);
            if(curr_sum < 0)
                curr_sum = 0;
        }
        return max_sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]  = scn.nextInt();
        }
        System.out.println("max subarray sum is: "+ kadane(arr, n));

    }

}
