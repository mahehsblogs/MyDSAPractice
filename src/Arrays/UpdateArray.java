package Arrays;

import java.util.Scanner;

public class UpdateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i < n; i++){

            for(int j = i-k; j <= i+k; j++){
                if(j == i)
                    continue;
                else{
                    max = Math.max(arr[j], max);
                }
            }
        }
        System.out.println(max);
    }
}
