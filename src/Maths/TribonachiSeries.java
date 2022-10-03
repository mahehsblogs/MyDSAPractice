package Maths;

import java.util.Scanner;

public class TribonachiSeries {

    public static long tribonacci(long n, long MOD) {
        if (n <= 2) return n;
        long a = 1, b = 2, c = 3, d;
        while (n-- > 2) {
            d = (a + b + c) % MOD;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long MOD = 1000000007;
        long ans= tribonacci(n,MOD);
        System.out.println(ans);
    }
}
