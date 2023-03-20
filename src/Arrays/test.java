package Arrays;

import java.util.*;
import java.util.PriorityQueue;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.next();
        }
        sc.close();

        Arrays.sort(strings);
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}
