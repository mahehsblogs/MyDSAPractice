package MockTest;

import java.util.Scanner;

public class SegrigateElements {
//    Segregate 0s and 1s in an array
//
//    Input = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
//
//    Output = [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
         segregateBinary(arr, n);
    }

    private static void segregateBinary(int[] arr, int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0)
                cnt++;
        }
        for (int i = 0; i < cnt; i++) {
            arr[i] = 0;
        }
        for (int i = cnt; i < n; i++) {
            arr[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
