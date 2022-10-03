package Arrays;

import java.util.Scanner;

public class ProductOfElements {

    private static void pElements(int arr[], int n) {
        if (n == 1) {
            System.out.print(0);
            return;
        }

        int start[] = new int[n];
        int end[] = new int[n];
        int prod[] = new int[n];
        start[0] = 1;
        end[n - 1] = 1;

        for (int i = 1; i < n; i++)
            start[i] = arr[i - 1] * start[i - 1];

        for (int j = n - 2; j >= 0; j--)
            end[j] = arr[j + 1] * end[j + 1];

        for (int i = 0; i < n; i++)
            prod[i] = start[i] * end[i];

        for (int i = 0; i < n; i++)
            System.out.print(prod[i] + " ");

        return;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        pElements(arr, n);
    }
}
