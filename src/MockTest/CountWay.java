package MockTest;
/*
Calculate the total number of ways to achieve a given sum with n throws of dice having k faces.

Input:

The total number of throws n is 2

The total number of faces k is 6 (i.e., each dice has values from 1 to 6)

The desired sum is 10

(6,4), (4,6), (5,5) = 3 ways
*/

public class CountWay {
    public static int countWays(int n, int k, int sum){
        if(n == 0){
            return (sum == 0) ? 1: 0;
        }
        if(sum < 0 || k * n < sum || n > sum){
            return 0;
        }

        int res = 0;
        for (int i = 1; i <= k ; i++) {
            res += countWays(n-1, k, sum-i);
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 2;
        int k = 6;
        int sum = 10;
        System.out.println(countWays(n, k, sum));

    }
}


