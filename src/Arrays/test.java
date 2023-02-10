package Arrays;

import java.util.*;
import java.util.PriorityQueue;

public class test {
    public static int minSizeSubarray(int[] A, int[] B, long S) {
        int l = 0, r = 0;
        long prod = 0;
        int minSize = Integer.MAX_VALUE;
        while (l < A.length) {
            while (r < B.length && (prod = A[l] + B[r]) < S) {
                r++;
            }
            if (r < B.length && prod >= S) {
                minSize = Math.min(minSize, (l + 1) + (r + 1));
            }
            l++;
            if (r == B.length) {
                break;
            }
        }
        return (minSize == Integer.MAX_VALUE) ? -1 : minSize;
    }

    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[] A = new int[n];
            int[] B = new int[m];
            for(int i = 0; i < n; i++){
                A[i] = scn.nextInt();
            }
            for(int i = 0; i < m; i++){
                B[i] = scn.nextInt();
            }
            long S = scn.nextLong();

            System.out.println(minSizeSubarray(A, B, S));
        }
    }
}
