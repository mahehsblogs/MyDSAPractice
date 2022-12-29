package Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestElement {
    public static int findKthSmallest(List<Integer> input, int k)
    {
        // base case
        if (input == null || input.size() < k) {
            System.exit(-1);
        }

        // create an empty min-heap and initialize it with all input elements
        PriorityQueue<Integer> pq = new PriorityQueue<>(input);

        // pop from min-heap exactly `k-1` times
        while (--k > 0) {
            pq.poll();
        }

        // return the root of min-heap
        return pq.peek();
    }

    public static void main(String[] args)
    {
//        List<Integer> input = Arrays.asList(7, 4, 6, 3, 9, 1);
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0){
            int n = scn.nextInt();
            int k = scn.nextInt();
            List<Integer> input = new ArrayList<>(n);
            for(int i = 0; i< n; i++) {
                int value = scn.nextInt();
                input.add(value);
            }

            System.out.println("k'th smallest array element is " +
                    findKthSmallest(input, k));
        }

    }

}
