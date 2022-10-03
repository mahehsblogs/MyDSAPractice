package Arrays;

import java.util.Scanner;

public class ThreeConsecutiveElement {

    private static void threeConsElem(int arr[], int n){
        int cnt = 0;
        for(int i = 0; i < n-2; i++){
            if(arr[i] == arr[i+1] && arr[i+1] == arr[i+2]) {
                cnt++;
            }
        }
        if(cnt >= 1)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scn.nextInt();
            threeConsElem(arr, n);
        }
    }
}
