package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        twoSum(arr, n, target);
    }

    private static void twoSum(int[] arr, int n, int target) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if(hm.containsKey(target-arr[i])){
                int val = hm.get(target-arr[i]);
                System.out.printf("pair found (%d %d)", arr[val], arr[i]);
                return;
            }
            hm.put(arr[i], i);
        }
        System.out.println("pair not found");
    }
}
