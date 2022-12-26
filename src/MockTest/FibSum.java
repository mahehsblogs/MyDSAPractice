package MockTest;

import java.util.Scanner;

/*
N=3

0+1+1+2 = 4

N=7

0+1+1+2+3+5+8

20

find n fib no. and then find sum
*/
public class FibSum {
    static int fib(int n){
        if(n <= 1){
            return n;
        }

        int sum = 0;
        for (int i = 2; i <= n; i++) {
            int res = fib(i-2)+fib(i-1);
            sum += res;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fib(n));
    }
}
